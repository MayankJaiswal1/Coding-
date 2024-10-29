public class pythagorus_Triplet {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int num = arr.length;
        int result = istriplet(arr, num);
        if(result == -1){
            System.out.println("no triplet");
        }
    }

    static int istriplet(int arr[], int num){
        int x, y, z;
        for( int i = 0; i<num; i++){
            for(int j=i+1; j<num; j++){
                for(int k=j+1; k<num; k++){
                    x = arr[i]*arr[i];
                    y = arr[j]*arr[j];
                    z = arr[k]*arr[k];
                    if(x==y+z || y==x+z || z==x+y){
                        System.out.println(arr[i] + arr[j] + arr[k]);
                        return 1;
                    }
                }
            }
        }
        return -1;
    }
    
}
