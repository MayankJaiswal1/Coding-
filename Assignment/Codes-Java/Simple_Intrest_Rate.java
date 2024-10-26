public class Simple_Intrest_Rate {
    public static void main(String[] args) {
        double principal_amount = 2000;    // 10000
        double rate_of_intrest = 50;       // 10 
        double time_period = 3;            //3
        System.out.println(cal_SI(principal_amount,rate_of_intrest,time_period));
    }

    static double cal_SI(double principal_amount, double rate_of_intrest, double time_period){
        return(principal_amount * rate_of_intrest * time_period)/100;
    }
    
}
