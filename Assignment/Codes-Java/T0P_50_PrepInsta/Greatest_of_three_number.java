/*
 * Find the Greatest of the Three Numbers in Java
Given three integers num1, num2 and num3 as inputs. The objective is to write a code to Find the Greatest of the Three Numbers in Java Language. To do so we’ll check the numbers with each other and print the largest of them all.
 
Example
Input : num1 = 12 num2 = 9 num3 = 14
Output : 14
 */

package T0P_50_PrepInsta;

public class Greatest_of_three_number {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;
        if(n1 >= n2 && n1 >= n3){
            System.out.println(n1 + " is the greatest");
        }
        else if(n2 >= n1 && n2 >= n3){
            System.out.println(n2 + " is the greatest");
        }
        if(n3 >= n2 && n3 >= n2){
            System.out.println(n3 + " is the greatest");
        }
    }
}
