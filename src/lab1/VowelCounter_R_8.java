package lab1;

//R-1.8

public class VowelCounter_R_8 {
    public static void main(String[] args) {
        String example = "Hello World";
        System.out.println("Number of vowels: " + countVowels(example)); // Should print 3
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
