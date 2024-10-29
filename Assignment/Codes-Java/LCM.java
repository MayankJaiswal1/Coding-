public class LCM {
    public static void main(String[] args) {
        int arr[] = { 25, 50, 125, 625};
        int min, max, x, Lcm=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i]> arr[j]){
                    min = arr[j];
                    max = arr[i];
                }else{
                    min = arr[i];
                    max = arr[j];
                }
                for(int k=0; k<arr.length; k++){
                    x = k*max;
                    if(x%min==0){
                        Lcm =x;
                    }
                }
            }
        }
        System.out.println(Lcm);
    }
    
}
