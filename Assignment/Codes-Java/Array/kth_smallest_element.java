/*
 * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7


Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
Output: 10
 */

package Array;

import java.util.Arrays;

public class kth_smallest_element {
    public static void main(String[] args) {
        Integer arr[] = new Integer[] {12,3,5,7,19};
        int k = 2;
        System.out.println("k'th smallest is " + kth_smallest_element(arr,k));
    }

    static int kth_smallest_element(Integer[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
