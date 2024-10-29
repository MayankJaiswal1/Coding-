public class Count_digit_sum {
    public static void main(String[] args) {
        int num = 97531;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num/=10;
            sum+=rem;
        }
        System.out.println(sum);
    }
}
