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
        Stack<Character> letters = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            letters.push(word.charAt(i));
        }

        String reversed = "";

        while (!letters.isEmpty()) {
            reversed = reversed + letters.pop();
        }
        return reversed;

    }
    public static boolean isPalindrome(String word){
        String smallWord = word.toLowerCase(); // convert the word to lowercase if it has uppercase letters, so that it would be easier to match words

        String reversed = reverseString(smallWord);

        if (smallWord.equals(reversed)) {
            return true;// if the two word matches even with the reverse, then the program will give us true.
        } else {
            return false; // if not equal, then the program will give us false.
        }

    }
}
