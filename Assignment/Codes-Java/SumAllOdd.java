import java.util.Scanner;

class SumAllOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        SumAllOdd obj = new SumAllOdd();
        System.out.println(obj.SumOddInegers(arr, size));
    }

    int SumOddInegers(int arr[], int size){
        int oddsum = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 == 1){
                oddsum += arr[i];
            }
        }
        return oddsum;
    }
}










// import java.util.Scanner;

// class SumAllOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         int oddsum = 0;

//         // Change the loop condition to i < arr.length
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Directly call the method without creating an instance
//         System.out.println(SumOddIntegers(arr, size));
//     }

//     // Removed the static oddsum variable
//     static int SumOddIntegers(int arr[], int size) {
//         int oddsum = 0; // Initialize oddsum here
//         // Change the loop condition to i < arr.length
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 1) {
//                 oddsum += arr[i];
//             }
//         }
//         return oddsum;
//     }
// }
