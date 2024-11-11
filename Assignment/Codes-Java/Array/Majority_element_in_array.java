// Java program to find Majority
// element in an array using nested loops

package Array;

public class Majority_element_in_array {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,1,5,5,7,8,5};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }
}
