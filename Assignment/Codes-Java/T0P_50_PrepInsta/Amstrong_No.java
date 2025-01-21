/*
 * Check whether or Not the Number is an Armstrong Number in Java
Given an integer input the objective is to check whether or not the number is an Armstrong number. To do so we check if the number satisfies the below mentioned conditions and if it does, the it’s an Armstrong. The task is to write a code to Check Whether or Not the Number is an Armstrong Number in Java Language.

Example
Input : 371
Output : It's an Armstrong Number.
Armstrong number or not using Java
Check Whether or Not the Number is an Armstrong Number
Given an integer input, the objective is to check whether or not the number input is an Armstrong number or not.

However, Armstrong number is any number following the given rule –

abcd… = an + bn + cn + dn + …
Where n is the order(length/digits in number)
Also check – Armstrong Number in a given Range in Java

Armstrong Numbers
Example
Input : 371
Output : It's an Armstrong Number.
Explanation: 371 = 3^3 + 7^3 + 1^3
Therefore it's an Armstrong number.
 */

package T0P_50_PrepInsta;

public class Amstrong_No {
    public static void main(String[] args) {
       int num = 153;
       if(isArmstrong(num)){
        System.out.println(num + " is an Amstrong no.");
       }else{
        System.out.println(num + "is not an Armstrong No. ");
       }
    }

    public static boolean isArmstrong(int num){
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;
        while(n > 0){
            int ld = n % 10;
            sum += Math.pow(ld, k);
            n /= 10;
        }
        return sum == num ? true : false;
    }
}
