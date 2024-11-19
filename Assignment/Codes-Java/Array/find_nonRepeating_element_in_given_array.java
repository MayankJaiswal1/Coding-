/*
 * Input: {-1, 2, -1, 3, 0}
Output: 2
Explanation: The first number that does not repeat is : 2


Input: {9, 4, 9, 6, 7, 4}
Output: 6
 */

package Array;

public class find_nonRepeating_element_in_given_array {
    public static void main(String[] args) {
        int arr[] = {9,6,4,9,6,7,4};
        int n = arr.length;
        System.out.print(firstNonRepeating(arr, n));
    }

    static int firstNonRepeating(int arr[], int n){
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<n; j++){
                if(i!=j && arr[i] == arr[j]){
                    break;
                }
            }
            if(j == n){
                return arr[i];
            }
        }
        return -1;
    }
}


