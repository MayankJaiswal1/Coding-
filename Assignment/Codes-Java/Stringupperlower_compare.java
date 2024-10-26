// count no. of upper and lower case letter and which one more convert string to that

public class Stringupperlower_compare {
    public static void main(String[] args) {
        String str = "AsdfGTYreXEWR";
        System.out.println(convertStr(str));
    }

    static String convertStr(String str){
        int uppercount = 0, Lowercount =0;
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c))
                uppercount++;
            else
                Lowercount++;    
        }
        if(uppercount>Lowercount){
            return str.toUpperCase();
        }else{
            return str.toLowerCase();
        } 
    }
    
}
