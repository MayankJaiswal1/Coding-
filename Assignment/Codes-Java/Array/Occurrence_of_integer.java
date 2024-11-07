package Array;

public class Occurrence_of_integer {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 8, 4, 2, 1, 3};
        int n = arr.length;
        int x = 5;
        System.out.println(countOccurrences(arr, n, x));
    }

    static int countOccurrences(int arr[], int n, int x){
        int count = 0;
        for(int i=0; i<n; i++){
            if(x==arr[i]){
                count++;
            }
        }
        return count;
    }
}
