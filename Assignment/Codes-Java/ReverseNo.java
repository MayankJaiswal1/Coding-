/**
 * ReverseNo
 */
public class ReverseNo {
    public static void main(String[] args) {
        int num = 7853;
        int var = 0;
        int temp = num;
        while(num>0){
            int rem = num % 10;
            var = var*10 + rem;   //var = var*10 + (num%10) //without taking extra variable rem
            num/=10;
        }
        System.out.println("reverse no. = " + var);
    }
}


















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
