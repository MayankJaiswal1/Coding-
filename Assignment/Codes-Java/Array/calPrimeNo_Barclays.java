package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class calPrimeNo_Barclays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result[] = calPrimeNumbers(num);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
            if(i< result.length - 1){
                System.out.print(" ");
            }
        }
    }

    static int[] calPrimeNumbers(int num){
        if(num < 2){
            return new int[0];
        }
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i=2; i*i<=num; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=num; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i=2; i<=num; i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        //int[] result = primes.stream().mapToInt(Integer::intValue).toArray();
        //return result;
        
        return primes.stream().mapToInt(Integer::intValue).toArray();
    }
}
