/*
 * Given two arrays arr1[] and arr2[] of size m and n respectively, the task is to determine whether arr2[] is a subset of arr1[]. Both arrays are not sorted, and elements are distinct.

Examples: 

Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
Output: Yes


 */

package Array;

public class array_subset {
    public static void main(String[] args) {
        int arr1[] = {11,1,13,21,3,7};
        int arr2[] = {11,3,5,1};
        int m = arr1.length;
        int n = arr2.length;
        if(isSubset(arr1, arr2, m, n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static boolean isSubset(int arr1[], int arr2[], int m, int n){
        for(int i=0; i<n; i++){
            boolean found = false;
            for(int j=0; j<m; j++){
                if(arr2[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}
