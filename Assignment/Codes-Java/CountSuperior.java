import java.util.Scanner;

public class CountSuperior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        CountSuperior obj = new CountSuperior();
        System.out.println(obj.FindSuperiorElements(arr,size));
    }

    int FindSuperiorElements(int arr[], int size){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            int j;
            for(j=i+1; j<arr.length; j++){
                if(arr[i] <= arr[j])
                    break;    
            }
            if(j == size )
                ans++;
        }
        return ans;
    }
}
