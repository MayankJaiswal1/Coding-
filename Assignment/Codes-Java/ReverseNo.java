public class ReverseNo {
    public static void main(String[] args) {
        int num = 320;
        System.out.println(rev(num));
    }

    static int rev(int num ){
        int reverse = 0;
        while(num>0){
            reverse = reverse*10 + (num%10);
            num/=10; 
        }
        return reverse;
    }
    
}
