public class Power_of_Two {
    public static void main(String[] args) {
        if(isPowerOfTwo(31)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    static boolean isPowerOfTwo(int n){
        if(n == 0){
            return false;
        }
        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(Math.log(n) / Math.log(2)));
    }
}
