public class fibonacci_no {
    public static void main(String[] args) {
        int num = 10;
        fibo(num);
    }

    static void fibo(int num){
        int num1=0;
        int num2=1;
        for(int i=1; i<=num; i++){
            int num3 = num1 + num2;
            System.out .println(num1);
            num1 = num2;
            num2 = num3;
        }
    }
}
