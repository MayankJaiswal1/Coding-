// palimdrome = reverse_no. + if condition

public class Palimdrome_reverseno_if_condition {
    public static void main(String[] args) {
        int num = 12121;

        //int result = palimdrome(num);
        //OR below
        //System.out.println(palimdrome(num));
        palimdrome(num);
    }
    
    static int palimdrome(int num ){
        int var =0;
        int temp = num;
        while(num>0){
            var = var*10 + num%10;
            num/=10;
        }
        if(var == temp){
            System.out.println(var + " is Palimdrome no.");
        }else{
            System.out.println(var + " is not a palimdrome no.");
        }
        return var;
    }
}
