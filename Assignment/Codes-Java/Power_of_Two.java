public class Power_of_Two {
    public static void main(String[] args) {
        if(isPowerOfTwo(31)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        System.out.println(isPowerOfTwo_2(16) ? "Yes" : "No");
        System.out.println(isPowerOfTwo_3(64) ? "Yes" : "No");
    }

    static boolean isPowerOfTwo(int n){
        if(n == 0){
            return false;
        }
        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(Math.log(n) / Math.log(2)));
    }

    static boolean isPowerOfTwo_2(int n){
        if( n == 0){
            return false;
        }

        while(n !=1 ){
            if(n%2 != 0){
                return false;
            }
            n/=2;
        }
        return true;
    }

    static boolean isPowerOfTwo_3(int x){
        return x!=0 && ((x & (x-1)) == 0);
    }
}
