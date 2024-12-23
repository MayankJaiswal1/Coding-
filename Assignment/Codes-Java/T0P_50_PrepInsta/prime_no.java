package T0P_50_PrepInsta;

public class prime_no {
    public static void main(String[] args) {
        int num = 11;
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count ++;
            }
        }
        if(count == 2){
            System.out.println(num + " is prime ");
        }else{
            System.out.println(num + " is composite");
        }
    }
}
