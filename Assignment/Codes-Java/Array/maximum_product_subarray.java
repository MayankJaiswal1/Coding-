/*
 * Input: arr[] = {-2, 6, -3, -10, 0, 2}
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180


Input: arr[] = {-1, -3, -10, 0, 60}
Output: 60
Explanation: The subarray with maximum product is {60}.
 */

package Array;
public class maximum_product_subarray {
    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }

    static int maxProduct(int arr[]){
        int n = arr.length;
        int result = arr[0];
        for(int i=0; i<n; i++){
            int mul = 1;
            for(int j=i; j<n; j++){
                mul *=arr[j];
                result = Math.max(result, mul);
            }
        }
        return result;
    }
    
}