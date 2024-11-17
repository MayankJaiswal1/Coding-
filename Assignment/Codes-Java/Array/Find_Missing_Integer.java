package Array;

public class Find_Missing_Integer {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,23};
        int n = 5;
        System.out.println(missingNumber(n,arr));
    }

    static int missingNumber(int n, int arr[]){
        int hash[] = new int[n+1];
        for(int i=0; i<n-1; i++){
            hash[arr[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
