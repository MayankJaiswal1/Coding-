/*Find the Sum of the Digits of a Number in Java
Given an integer input number, the objective is t0 Find the Sum of the Digits of a Number in Java Language. To do we’ll break the number into it’s digits. Then we add them one by one as we extract them from the number using modulo operator “%”.

Example
Input : 1234
Output : 1 + 2 + 3 + 4 = 10 */

package T0P_50_PrepInsta;

public class Sum_Of_Digit_of_a_Number {
    public static void main(String[] args) {
        int num = 12345, sum = 0;
        while(num!= 0){
            sum += num %10;
            num = num /10;
        }
        System.out.println("Sum of Digits : " + sum);
    }
}
