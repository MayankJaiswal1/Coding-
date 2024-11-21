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
    }

    static int maxSubarraySum(int arr[]){
        int res = arr[0];
        for(int i=0; i<arr.length; i++){
            int currSum = 0;
            for(int j=i; j<arr.length; j++){
                currSum += arr[j];
                res = Math.max(res, currSum);
            }
        }
        return res;
    }
}
