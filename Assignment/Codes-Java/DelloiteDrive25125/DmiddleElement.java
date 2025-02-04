package DelloiteDrive25125;

import java.util.Scanner;

public class DmiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];
    for(int i=0; i<N; i++){
        arr[i] = sc.nextInt();
    }
    int middleIndex = N/2;
    System.out.println(arr[middleIndex]);
    sc.close();
    }
}
