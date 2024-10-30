package Array;

import java.util.Arrays;

public class Largest_no_array {
    public static void main(String[] args) {
        String[] arr1 = {"3", "30", "34", "5", "9"};
        System.out.println(largest_no(arr1));

        String[] arr2 = {"54", "546", "548", "60"};
        System.out.println(largest_no(arr2));
    }

    static String largest_no(String[] arr){

        // Sort array with custom comparator in reverse order
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

        // Edge case: If the largest element is "0", return "0" (all elements are zero)
        if(arr[0].equals("0")){
            return "0";
        }

        // Build the largest number by joining sorted elements
        StringBuilder result = new StringBuilder();
        for(String num : arr) {
            result.append(num);
        }
        return result.toString();
    }
    
}
