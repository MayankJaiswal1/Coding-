/*
 * Check Whether or Not the Number is a Palindrome in Java
Given an integer input as the number, the objective is to check whether or not the given number is a palindrome. To do so, we’ll first reverse the string input using loops and recursion and check if it matches the original number.

Example
Input : 121
Output : Palindrome
 */

package T0P_50_PrepInsta;

public class palimdrome_No {
    public static void main(String[] args) {
        int num = 10201, rev = 0, rem, temp;
        temp = num;
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if(num == rev){
            System.out.println(num + " is Palimdrome");
        }else{
            System.out.println(num + " is not Palimdrome");
        }
    }
}
