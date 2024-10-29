package Array;

import java.util.Scanner;

public class arrayprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=1; j<=arr[i]; j++){
                if(arr[i]%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("Prime");
            }else{
                System.out.println("Composite");
            }
        }
    }
}
