// Convert 1st word to small and 1st letter of second word to capital 
//input- Hello world
//output-hello World

public class StringConvert {
    public static void main(String[] args) {
        String input = "Hello world";
        String result = convert(input);
        System.out.println(result);
    }

    static String convert(String input){
        String[] words = input.split(" ");
        if(words.length < 2 )
            return input;

        String firstWord = words[0].toLowerCase();
        String secondWord = words[1].substring(0, 1).toUpperCase() + words[1].substring(1).toLowerCase();
        return firstWord + " " + secondWord;  
    }
}
