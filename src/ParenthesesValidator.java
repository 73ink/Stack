import java.util.Stack;
public class ParenthesesValidator {
    public static void main(String[] args){
        String[] sampleLines = {
         "{[()]}",
         "((()))",
         "[[",
         ")))",
          "",
        };
        for (String text : sampleLines) {
            System.out.println("Expression: " + text);

            if (isBalanced(text)) {
                System.out.println("Result: Balanced");
            } else {
                System.out.println("Result: Not Balanced");
            }

            System.out.println("----------------------");
        }
    }
    public static boolean isBalanced(String text) {
        Stack<Character> myStack = new Stack<>();

    }
}
