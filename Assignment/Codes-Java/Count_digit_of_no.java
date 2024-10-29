public class Count_digit_of_no {
    public static void main(String[] args) {
        int num = 95847;
        int count = 0; 
        while(num>0){
            int rem = num%10;
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
