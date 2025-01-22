/*
Find the Fibonacci Series up to Nth Term in Java
For a Given integer input number as the Nth value, the objective is to Find the Fibonacci Series up to the Nth Term. Therefore, we’ll write a program to Find the Fibonacci Series up to Nth Term in Java Language.

Example
Input : 4
Output : 0 1 1 2
*/

/*Fibonacci Series
A series of numbers in which each number is the sum of the two preceding numbers is known as a Fibonacci Series.

General Formula to find the Nth term of a Series 
F0 = 0 and F1 = 1 be the seed values
The Nth term of a Fibonacci series is given as Fn = Fn-1 + Fn-2 .
Example, 
Input : 5
Fibonacci Series : 0 1 1 2 3
Explanation:
For 3rd term it's 2nd term + 1st term.
For 4th term it's 3rd term + 2nd term.
for 5th term it's 4th term + 3rd term. */


package T0P_50_PrepInsta;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int num = 15;
        int a = 0, b = 1;
        System.out.print(a + " , " + b + " , ");
        int nextTerm;
        for(int i = 2; i< num; i++){
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }
}
