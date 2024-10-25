// Capitalized 1st letter of each word of the string

public class Capitalize1 {
    public static void main(String[] args) {
        String input = "Java program is fun";
        String result = convert(input);
        System.out.println(result);
    }

    static String convert(String input){
        String[] words = input.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for(String word : words){
            if(word.length() > 0){
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                                   .append(word.substring(1).toLowerCase())
                                   .append(" ");                       
            }
        }
        return capitalizedSentence.toString().trim();
    }
    
}
