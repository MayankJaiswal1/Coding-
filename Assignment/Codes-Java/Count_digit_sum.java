// public class Count_digit_sum {
//     public static void main(String[] args) {
//         int num = 97531;
//         int sum = 0;
//         while(num>0){
//             int rem = num%10;
//             num/=10;
//             sum+=rem;
//         }
//         System.out.println(sum);
//     }
// }


class Count_digit_sum{
    public static void main(String[] args) {
        int num = 320;
        int rem = 0;
        int sum = 0;
        while(num>0){
            rem = num%10;
            num/=10;
            sum+=rem;
        }
        System.out.println(sum);
        int temp = sum;
        int count = 0;
        for(int i = 1; i<=sum; i++){
        //while(sum > 0){
            if(sum % i == 0){
                count++;
            }
            //temp --; 
        }
        if(count == 2){
            System.out.println("Googly");
        }
    }
}
