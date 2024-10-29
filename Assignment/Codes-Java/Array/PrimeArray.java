package Array;

import java.util.Scanner;

public class PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        primrORcomposite(arr , num);
    }

    static boolean isprime(int num){
        if(num<=1) return false;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    static int primrORcomposite(int arr[], int num){
        int primecount = 0;
        int compositecount = 0;
        for(int i=0; i<num; i++){
            if(isprime(arr[i])){
                primecount++;
            }else if(num>1){
                compositecount++;
            }
        }
        if(primecount>compositecount){
            System.out.println(primecount);
            return primecount;
        }else{
            System.out.println(compositecount);
            return compositecount;
        }
    }
}
