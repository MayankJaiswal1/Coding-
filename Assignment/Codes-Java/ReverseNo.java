import java.util.Scanner;

/**
 * ReverseNo
 */
public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int Reverse = rev(num);
        System.out.println(Reverse);
    }

    static int rev(int num){
        int var = 0;
        while(num>0){
            var = var*10 + num%10;  // rev = num%10;    var = var*10+rev;
            num/=10;
        }
        return var;
    }
    
}







// /**
//  * ReverseNo
//  */
// public class ReverseNo {
//     public static void main(String[] args) {
//         int num = 7853;
//         int var = 0;
//         int temp = num;
//         while(num>0){
//             int rem = num % 10;
//             var = var*10 + rem;   //var = var*10 + (num%10) //without taking extra variable rem
//             num/=10;
//         }
//         System.out.println("reverse no. = " + var);
//     }
// }


















// public class ReverseNo {
//     public static void main(String[] args) {
//         int num = 320;
//         System.out.println(rev(num));
//     }

//     static int rev(int num ){
//         int reverse = 0;       // reverse = var
//         while(num>0){
//             reverse = reverse*10 + (num%10);
//             num/=10; 
//         }
//         return reverse;
//     }
    
// }
