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

package Array;

import java.util.Arrays;

public class find_smallest_missing_positive_number {
    public static void main(String[] args) {
        int arr[] = {2,-3,4,1,1,7};
        System.out.println(missingNumber(arr));
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
}
