/*
 * Partition a Set into Two Subsets of Equal Sum
Last Updated : 15 Nov, 2024
Given an array arr[], the task is to check if it can be partitioned into two parts such that the sum of elements in both parts is the same.

Examples: 

Input: arr[] = [1, 5, 11, 5]
Output: True 
Explanation: The array can be partitioned as [1, 5, 5] and [11]


Input: arr[] = [1, 5, 3]
Output: False 
Explanation: The array cannot be partitioned into equal sum sets.


 */

package Array;

public class Partition_a_set {
    public static void main(String[] args) {
        int arr[] = {1,5,11,5,4,7,8};
        if(equalPartition(arr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    static boolean equalPartition(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        if(sum%2 != 0){
            return false;
        }
        return isSubsetSum(arr.length, arr, sum/2);
    }

    static boolean isSubsetSum(int n, int arr[], int sum){
        if(sum == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(arr[n-1] > sum){
            return isSubsetSum(n-1, arr, sum);
        }
        return isSubsetSum(n-1, arr, sum)  || isSubsetSum(n-1, arr, sum-arr[n-1]);
    }
}
