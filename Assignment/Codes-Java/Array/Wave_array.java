/*Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} 
Explanation: 
here you can see {10, 5, 6, 2, 20, 3, 100, 80} first element is larger than the second and the same thing is repeated again and again. large element – small element-large element -small element and so on .it can be small element-larger element – small element-large element -small element too. all you need to maintain is the up-down fashion which represents a wave. there can be multiple answers.


Input: arr[] = {20, 10, 8, 6, 4, 2}
Output: arr[] = {20, 8, 10, 4, 6, 2} */

package Array;

import java.util.Arrays;

public class Wave_array {
    public static void main(String[] args) {
        int arr[] = {10,90,49,2,1,5,23,52,45};
        int n = arr.length;
        Wave_array ob = new Wave_array();
        ob.sortWave(arr, n);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    
    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    void sortWave(int arr[], int n){
        // Sort the input array
        Arrays.sort(arr);
        // Swap adjacent elements
        for(int i=0; i<n-1; i+=2){
            swap(arr, i, i+1);
        }

        //0r
        // Traverse all even elements
        for(int i=0; i<n; i+=2){
            //swap odd and even positions
            if(i>0 && arr[i-1]>arr[i])
                swap(arr,i,i-1);
                if(i<n-1 && arr[i+1]>arr[i])
                swap(arr, n, i);
        }
    }

     // A utility method to swap two numbers.
    void swap(int arr[], int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
