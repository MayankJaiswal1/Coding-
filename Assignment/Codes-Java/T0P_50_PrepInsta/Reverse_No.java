/*
 * Find the Reverse of a Number in Java Language
Given an integer input as number, the objective is Find the Reverse of a Number
 in Java Language. To do so we usually break down the number into its individual digits and then rearrange them 
 in reverse order. Here are a few methods to solve the above-mentioned problem in Java Language,
 */

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
