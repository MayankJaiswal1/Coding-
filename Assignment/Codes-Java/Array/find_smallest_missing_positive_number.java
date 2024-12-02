/*
 * Input: arr[] = {2, -3, 4, 1, 1, 7}
Output: 3
Explanation: 3 is the smallest positive number missing from the array.


Input: arr[] = {5, 3, 2, 5, 1}
Output: 4
Explanation: 4 is the smallest positive number missing from the array.


Input: arr[] = {-8, 0, -1, -4, -3}
Output: 1 
Explanation: 1 is the smallest positive number missing from the array.
 */

// Java program to find the first missing positive number 
// using visited array

package Array;

import java.util.Arrays;

public class find_smallest_missing_positive_number {
    public static void main(String[] args) {
        int arr[] = {2,-3,4,1,1,7};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber_II(arr));
        System.out.println(missingNumber_III(arr));
    }

    static int missingNumber(int arr[]){
        Arrays.sort(arr);
        int res = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == res){
                res++;
            }else if(arr[i] > res){
                break;
            }
        }
        return res;
    }

    static int missingNumber_II(int arr[]){
        int n = arr.length;
        // To mark the occurrence of elements
        boolean vis[] = new boolean[n];
        for(int i=0; i<n; i++){
            // if element is in range from 1 to n
            // then mark it as visited
            if(arr[i] > 0 && arr[i] <= n){
                vis[arr[i] - 1] = true;
            }
        }
        // Find the first element which is unvisited
        // in the original array
        for(int i=1; i<=n; i++){
            if(!vis[i+1]){
                return i;
            }
        }
        // if all elements from 1 to n are visited
        // then n+1 will be first positive missing number
        return n+1;
    }

    static int missingNumber_III(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // if arr[i] is within the range [1, n] and arr[i]
            // is not placed at (arr[i]-1)th index in arr
            while (arr[i] >= 1 && arr[i] <= n
                   && arr[i] != arr[arr[i] - 1]) {

                // then swap arr[i] and arr[arr[i]-1] to
                // place arr[i] to its corresponding index
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }

        // If any number is not at its corresponding index 
        // then it is the missing number
        for (int i = 1; i <= n; i++) {
            if (i != arr[i - 1]) {
                return i;
            }
        }

        // If all number from 1 to n are present then n+1 
        // is smallest missing number
        return n + 1;
    }
}
