/*
 * Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.


Input: arr[] = {-2, -4}
Output: –2
Explanation: The subarray {-2} has the largest sum -2.


Input: arr[] = {5, 4, 1, 7, 8}
Output: 25
Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
 */

package Array;

public class Largest_subarray_sum_Kadanes_algorithm {
    public static void main(String[] args) {
        int arr[] = {2,-8,37,-1,2,3};
        System.out.println(maxSubarraySum(arr));

        int arr1[] = {2,-8,37,-1,2,3};
        System.out.println(maxSubarraySum_II(arr1));
    }

    // Function to find the sum of subarray with maximum sum
    static int maxSubarraySum(int arr[]){
        int res = arr[0];
        // Outer loop for starting point of subarra
        for(int i=0; i<arr.length; i++){
            int currSum = 0;
            // Inner loop for ending point of subarray
            for(int j=i; j<arr.length; j++){
                currSum += arr[j];
                // Update res if currSum is greater than res
                res = Math.max(res, currSum);
            }
        }
        return res;
    }

    static int maxSubarraySum_II(int[] arr){
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i=1; i<arr.length; i++){
            // Find the maximum sum ending at index i by either extending 
            // the maximum sum subarray ending at index i - 1 or by
            // starting a new subarray from index i
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
