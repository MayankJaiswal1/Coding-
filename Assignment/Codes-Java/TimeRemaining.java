public class TimeRemaining {
    public static void main(String[] args) {
        int h = 0, m = 01;
        remainingTime(h,m);
    }
    //h = hour , m = minute 

    static void remainingTime(int h, int m){
        int totalMin, hourRemaining, minRemaining;
        totalMin = 1440 - 24*h - m ;  //24*60 = 1440
        hourRemaining = totalMin / 60;
        minRemaining = totalMin % 60;
        System.out.println(hourRemaining + "::" + minRemaining); 
    }
}
