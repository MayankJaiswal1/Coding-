/*
 * Find the Sum of the Numbers in a Given Range in Java
Given two integer inputs number1 and number2, the objective is to find the sum of all Number that lay in the given interval by writing a code to Find the Sum of the Numbers in a Given Range in Java Language.

Example
Input : Number1 = 12 , Number2 = 15
Output : 54

Find the Sum of the Numbers in a Given Interval in Java
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods. To do so we basically iterate from the base interval to the final interval and keep adding the number. Here are some of the methods to solve the above mentioned problem in Java Language.

Method 1: Using Brute Force
Method 2: Using the Formula
Method 3: Using Recursion
We’ll discuss the above mentioned methods in detail in the upcoming sections.
 */

package T0P_50_PrepInsta;

public class Sum_Of_No_in_range {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int sum = 0;
        for(int i=a; i<=b; i++){
            sum += i;
        }
        System.out.println("The sum is : " + sum );

        sum = b * (b+1)/2 - a*(a+1)/2 + a;
        System.out.println(sum);

        System.out.println(getsum(0,a,b));
    }

    static int getsum(int sum, int i, int b){
        if(i>b){
            return sum;
        }
        return i + getsum(sum, i+1, b);
    }
}
