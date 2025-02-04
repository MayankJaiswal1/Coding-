package Delloite_Drive_25_1_25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rmostunique_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digit = lastNonRepeatingDigit(N);
        System.out.println(digit);
    }

    public static int lastNonRepeatingDigit(int N){
        String numStr = Integer.toString(N);
        int length = numStr.length();
        Map<Character, Integer> frequency = new HashMap<>();

        for(int i=0; i<length; i++){
            char digit = numStr.charAt(i);
            frequency.put(digit, frequency.getOrDefault(digit, 0));
        }
        for(int i= length - 1; i>= 0; i--){
            char digit = numStr.charAt(i);
            if(frequency.get(digit) == 1){
                return Character.getNumericValue(digit);
            }
        }
        return -1;
    }
}
