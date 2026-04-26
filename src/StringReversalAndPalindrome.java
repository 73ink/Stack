import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main (String[] args){
        // Add simple strings for testing
        String[] words = {"app", "hallah","mom", "level", "RaceCar", "", "a"};
            // output and system prints
        for (String word : words) {
            System.out.println("Original word: " + word);

            String reversed = reverseString(word);
            System.out.println("Reversed word: " + reversed);

            boolean result = isPalindrome(word);
            System.out.println("Is palindrome? " + result);

            System.out.println("--------------------");
        }

    }
    public static String reverseString(String word){
        return x;

    }
    public static boolean isPalindrome(String word){
        return y;
    }
}
