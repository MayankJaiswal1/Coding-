package T0P_50_PrepInsta;

public class Sum_Of_Digit_of_a_Number {
    public static void main(String[] args) {
        int num = 12345, sum = 0;
        while(num!= 0){
            sum += num %10;
            num = num /10;
        }
        System.out.println("Sum of Digits : " + sum);
    }
}
