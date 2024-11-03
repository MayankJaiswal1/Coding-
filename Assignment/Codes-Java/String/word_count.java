// package String;

// public class word_count {
//     public static void main(String[] args) {
//         String str = "Hi ISR is a field of IR callesd ISR";
//         System.out.println("No. of words: " + countwords(str));
//     }
    
//     static int countwords(String str){
//         if(str.length() == 0){
//             return 0;
//         }
//         int count = 0;
//         int state = 0;

//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i) == '\\'){
//                 i++;
//                 continue;
//             }
//             if(Character.isLetterOrDigit(str.charAt(i))){
//                 if(state == 0){
//                     count++;
//                     state = 1;
//                 }
//             }
//             else{
//                 state = 0;
//             }
//         }
//         return count;
//     }
// }







package String;

import java.util.StringTokenizer;

public class word_count {
    public static void main(String[] args) {
        String str = "Hi ISR is a field of IR callesd ISR";
        System.out.println("No. of words: " + countwords_II(str));
        System.out.println("No. of words: " + countwords_III(str));
    }
    
    static int countwords_II(String str){
        if ( str == null || str.isEmpty())
            return 0;
        
    String[] words = str.split("\\s+");  
    return words.length;
    }

    static int countwords_III(String str){
        if ( str == null || str.isEmpty())
            return 0;
        
    StringTokenizer tokens = new StringTokenizer(str);  
    return tokens.countTokens();
    }
}
