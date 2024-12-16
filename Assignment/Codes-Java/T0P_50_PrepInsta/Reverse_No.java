package T0P_50_PrepInsta;

import java.util.Scanner;
public class Reverse_No {
    private static final String Interger = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int rev = 0;
        int rem ;
        while(num!=0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num/=10;
        }

        System.out.println("Reverse of " + num + " is " + rev);
    }
}
