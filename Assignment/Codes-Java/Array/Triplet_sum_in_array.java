/*
 * Input: arr = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9 
Explanation: There is a triplet (12, 3 and 9) present 
in the array whose sum is 24. 


Input: arr = {1, 2, 3, 4, 5}, sum = 9 
Output: 5, 3, 1 
Explanation: There is a triplet (5, 3 and 1) present 
in the array whose sum is 9.


Input: arr = {2, 10, 12, 4, 8}, sum = 9 
Output: No Triplet
Explanation: We do not print in this case and return false.
 */

package Array;

import java.util.HashSet;
import java.util.Set;

public class Triplet_sum_in_array {
    public static void main(String[] args) {
        int arr[] = {1,4,45,6,10,8};
        int sum = 22;
        find3Numbers(arr, sum);
        find3Numbers_II(arr, sum);
    }

    static boolean find3Numbers(int arr[], int sum){
        int n = arr.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.println("Triplet is " + arr[i] +"," +  arr[j] + ","+ arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean find3Numbers_II(int arr[], int sum){
        int n = arr.length;
        // Fix the first element as arr[i]
        for(int i=0; i<n-2; i++){
            // Create a set to store potential second
            // elements that complement the desired sum
            Set<Integer> s = new HashSet<>();
            int curr_sum = sum - arr[i];
            // Iterate through the subarray arr[i+1..n-1] to
            // find a pair with the required sum
            for(int j=i+1; j<n; j++){
                int required_value = curr_sum - arr[j];if(s.contains(required_value)){
                    System.out.println("Triplet is " + arr[i] + "," + arr[j] + "," + required_value);
                    return true;
                }
                // Add the current element to the set for future complement checks
                s.add(arr[j]);
            }
        }
        return false;
    }
}
