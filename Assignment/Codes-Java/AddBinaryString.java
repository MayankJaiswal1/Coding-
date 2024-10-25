public class AddBinaryString {
    public static void main(String[] args) {
        String x = "011011";
        String y = "1010111";
        System.out.println(add_Binary(x,y));
    }
    
    static String add_Binary(String x, String y){
        int num1 = Integer.parseInt(x,2);  // Binary to decimal & 2= base2 fir binary
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);   //Decimal to binary
        return result;
    }
}
