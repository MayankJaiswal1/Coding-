/*
 * Check if a Number is Positive or Negative in Java
In this article, we will create a java program to check whether the number entered by the user is positive or negative. The number is demonstrated as positive or negative by comparing the entered number with the Zero(0). If the number entered by the user is greater than zero, then the number is positive, else if the number is less than zero, then the number is negative and else the number is zero.

N > 0 then, number is Positive.
N < 0 then, number is Negative.
N = 0 then, number is Zero.
 */

package T0P_50_PrepInsta;

public class Positive_Negative_No {
    public static void main(String[] args) {
        int num = 5;
        if(num > 0){
            System.out.println("The number is Positive ");
        }else if(num < 0){
            System.out.println("The number is Negative ");
        }else{
            System.out.println("Zero");
        }

        if(num >=0 ){
            if(num == 0){
                System.out.println("Zero");
            }else{
                System.out.println("Number is Positive");
            }
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}
