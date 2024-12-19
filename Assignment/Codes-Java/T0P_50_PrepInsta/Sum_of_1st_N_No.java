/*
 * Find the Sum of First N Natural Numbers in Java
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. To do so we can use different approaches to write the Java code and some such methods are mentioned below,

Method 1: Using for Loop
Method 2: Using Formula for the Sum of Nth Term
Method 3: Using Recursion
We’ll discuss and learn more about each above-mentioned method in detail in the sections below.
 */

package T0P_50_PrepInsta;

public class Sum_of_1st_N_No {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println(sum);

        System.out.println("Sum : " + num*(num+1)/2);

        sum = getsum (num);
        System.out.println(sum);
    }

    static int getsum(int num){
        if(num == 0){
            return num;
        }
        return num + getsum(num - 1);
    }
}
