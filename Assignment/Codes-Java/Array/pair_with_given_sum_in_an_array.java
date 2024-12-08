/*
 * Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of elements in the array whose sum is equal to target. This problem is a variation of 2Sum problem.

Examples: 

Input: arr[] = {0, -1, 2, -3, 1}, target = -2
Output: True
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2


Input: arr[] = {1, -2, 1, 0, 5}, target = 0
Output: False
There is no pair with sum equals to given target.


 */

package Array;

public class pair_with_given_sum_in_an_array {
    public static void main(String[] args) {
        int arr[] = {0,-1,2,-3,1};
        int target = -2;
        if(twoSum(arr, target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    static boolean twoSum(int arr[], int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    
}
