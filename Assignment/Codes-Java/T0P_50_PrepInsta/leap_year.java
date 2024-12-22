/*
 * Check Whether or Not the Year is a Leap Year in Java
We will write Leap Year Program in Java. Given an integer input “year” the objective is to check if the given year is a leap year or not using the conditions for a leap year. Therefore, keeping them in mind we write a code to Check Whether or Not the Year is a Leap Year in Java Language.

Example
Input : 2024
Output: Leap Year
 */

package T0P_50_PrepInsta;

public class leap_year {
    public static void main(String[] args) {
        int year = 2020;
        if(year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else if ( year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

        if(year % 400 == 0 ||  year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
