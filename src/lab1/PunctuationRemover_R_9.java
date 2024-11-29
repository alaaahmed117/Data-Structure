package lab1;

//R-1.9

public class PunctuationRemover_R_9 {
    public static void main(String[] args) {
        String sentence = "Let’s try, Mike!";
        System.out.println(removePunctuation(sentence)); // Should print "Lets try Mike"
    }

    public static String removePunctuation(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
