/*
 * Input: arr[] = {5, 6, 1, 2, 3, 4}
Output: 1
Explanation: 1 is the minimum element present in the array.


Input: arr[] = {1, 2, 3, 4}
Output: 1


Input: arr[] = {2, 1}
Output: 1
 */

package Array;
import java.util.Arrays;
import java.util.List;

public class Minimum_in_a_sorted_rotated_array {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5,6,1,2,3,4);
        System.out.println(findMin(arr));
    }

    static int findMin(List<Integer> arr) {
        int res = arr.get(0);
        for(int i=1; i<arr.size(); i++){
            res = Math.min(res, arr.get(i));
        }
        return res;
    }
}
