/*
Find the Fibonacci Series up to Nth Term in Java
For a Given integer input number as the Nth value, the objective is to Find the Fibonacci Series up to the Nth Term. Therefore, we’ll write a program to Find the Fibonacci Series up to Nth Term in Java Language.

Example
Input : 4
Output : 0 1 1 2
*/


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
