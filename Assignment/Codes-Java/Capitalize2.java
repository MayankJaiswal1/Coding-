public class Capitalize2 {
    public static void main(String[] args) {
        String input = "geek foR geeks";
        String result = convert(input);
        System.out.println(result);
    }

    static String convert(String input){
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for(String word : words){
            if(word.length() > 0){
                output.append(Character.toTitleCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return output.toString().trim();
    }
    
}
