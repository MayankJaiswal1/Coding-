/*
 * Input: {4, 2, -3, 1, 6}
Output: true 
Explanation:
There is a subarray with zero sum from index 1 to 3.


Input: {4, 2, 0, 1, 6}
Output: true
Explanation: The third element is zero. A single element is also a sub-array.


Input: {-3, 2, 3, 1, 6}
Output: false
 */

package Array;

public class Subarrays_with_zero_sum {
    public static void main(String[] args) {
        int arr[] = {-3,2,3,1,6};
        int n = arr.length;
        if(subArrayExists(arr,n)){
            System.out.println("Found a subarray with 0 sum");
        }else{
            System.out.println("No such sub array exists!");
        }
    }

    static boolean subArrayExists(int arr[], int n){
        for(int i=0; i<n; i++){
            int sum = arr[i];
            if(sum == 0){
                return true;
            }
            for(int j=i+1; j<n; j++){
                sum +=arr[j];
                if(sum == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
