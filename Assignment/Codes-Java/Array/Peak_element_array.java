/*
 * Input: arr[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.


Input: arr[] = {10, 20, 15, 2, 23, 90, 90}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.


Input: arr[] = [1, 1, 1]
Output : 1
Explanation:  All elements are peak in the given array, we can return any of them,
 */

package Array;

public class Peak_element_array {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,20,4,1,0};
        int arr[] = {10,2,30,20,4,1,0};
        int n = arr.length;
        System.out.println("Index of a peak point is " + findpeak(arr,n));
    }

    static int findpeak(int arr[], int n){
        if(n==1)
            return 0;
        if(arr[0]>arr[1])
            return 0;
        if(arr[n-1]>=arr[n-2])
            return n-1;
        for(int i=1; i<n; i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
                return i;
        }
        return 0;    
    }
}
