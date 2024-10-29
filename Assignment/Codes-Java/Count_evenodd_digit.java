public class Count_evenodd_digit {
    public static void main(String[] args) {
        int num = 12356;
        int evencount = 0;
        int oddcount = 0;
        while(num>0){
            int rem = num%10;
            num/=10;
            if(rem%2 ==1 ){
                oddcount++;
            }else{
                evencount++;
            }   
        }
        System.out.println(oddcount+ " ," + evencount);
    }
}
