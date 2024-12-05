/*
 * Given two sorted arrays having some elements in common. Find the sum of the maximum sum path to reach from the beginning of any array to the end of any of the two arrays. We can switch from one array to another array only at common elements. 

Note: The common elements do not have to be at the same indexes. And individual arrays have distinct elements only (no repetition within the array).

Examples: 

Input: ar1[] = {2, 3, 7, 10, 12}, ar2[] = {1, 5, 7, 8}
Output: 35
Explanation: 35 is sum of 1 + 5 + 7 + 10 + 12.
Start from the first element of ar2 which is 1, then move to 5, then 7.  From 7 switch to ar1 (as 7 is common) and traverse 10 and 12.


Input: ar1[] = {10, 12}, ar2 = {5, 7, 9}
Output: 22
Explanation: 22 is the sum of 10 and 12. 
Since there is no common element, take all elements from the array with more sum.


Input: ar1[] = {2, 3, 7, 10, 12, 15, 30, 34}, ar2[] = {1, 5, 7, 8, 10, 15, 16, 19}
Output: 122
Explanation: 122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34
Start from the first element of ar2 which is 1, then move to 5, then 7. From 7 switch to ar1 (as 7 is common), then traverse the remaining ar1.
 */

package Array;

public class maximum_sum_path_in_two_arrays {
    public static void main(String[] args) {
        maximum_sum_path_in_two_arrays sumpath = new maximum_sum_path_in_two_arrays();
        int arr1[] = {2,3,7,10,12,15,30,34};
        int arr2[] = {1,5,7,8,10,15,16,19};
        int m = arr1.length;
        int n = arr2.length;
        System.out.println("Maximum Sum path is : " + sumpath.maxPathSum(arr1, arr2, m, n));
    }

    int max(int x, int y){
        return (x > y) ? x:y; 
    }

    int maxPathSum(int arr1[], int arr2[], int m, int n){
        int i=0, j=0;
        int result =0, sum1 = 0, sum2 =0;
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                sum1 += arr1[i++];
            }else if(arr1[i] > arr2[j]){
                sum2 += arr2[j++];
            }else{
                // Take the maximum of two sums and add to
                // result
                // Also add the common element of array,
                // once
                result += max(sum1, sum2) + arr1[i];
                // Update sum1 and sum2 for elements after
                // this intersection point
                sum1 = 0; 
                sum2 = 0;
                // update i and j to move to next element of
                // each array
                i++;
                j++;
            }
        }
        while(j < n){
            sum2 += arr2[j++];
        }
        result += max(sum1, sum2);
        return result;
    }
}
