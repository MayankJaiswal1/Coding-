package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Duplicates {
    public static void main(String[] args) {
        int arr[] = {12, 11, 11, 5, 6, 5, 11, 18};
        List<Integer> duplicates = findDuplicates(arr);
        for(int x : duplicates){
            System.out.print(x + " ");
        }

        System.out.println( );

        List<Integer> arr1 = Arrays.asList(12, 11, 40, 12, 5, 6, 5, 12, 11);
        List<Integer> result = findDuplicates_II(arr1);
        for(int x : result){
            System.out.print(x + " ");
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

    static List<Integer> findDuplicates_II(List<Integer> arr1){
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x : arr1){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue()>1){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
