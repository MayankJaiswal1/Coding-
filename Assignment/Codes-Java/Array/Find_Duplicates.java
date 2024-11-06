package Array;

import java.util.ArrayList;
import java.util.List;

public class Find_Duplicates {
    public static void main(String[] args) {
        int arr[] = {12, 11, 11, 5, 6, 5, 11, 18};
        List<Integer> duplicates = findDuplicates(arr);
        for(int x : duplicates){
            System.out.println(x + " ");
        }
    }

    static List<Integer> findDuplicates(int arr[]){
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    if(!result.contains(arr[i]))
                        result.add(arr[i]);
                    break;    
                }
            }
        }
        return result;
    }
}
