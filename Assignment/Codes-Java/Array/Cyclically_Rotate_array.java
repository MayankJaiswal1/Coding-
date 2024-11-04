package Array;

import java.util.Arrays;

public class Cyclically_Rotate_array {

    static int arr[] = new int[] {1, 2, 3, 4, 5};

    static int arr1[] = new int[] {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        System.out.println("Given Array is : ");
        System.out.println(Arrays.toString(arr));
        rotate_I();
        System.out.println("Rotated Array is : ");
        System.out.println(Arrays.toString(arr));

        rotate_II();
        System.out.println("Rotated Array is : ");
        System.out.println(Arrays.toString(arr1));
    }

    static void rotate_I(){
        int last_el = arr[arr.length - 1];
        int i;
        for(i = arr.length -1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last_el;
    }

    static void rotate_II(){
        int i =0, j = arr1.length - 1;
        while (i != j) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i++;
        }
    }
}
