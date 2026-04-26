import java.util.Stack;
public class ParenthesesValidator {
    public static void main(String[] args){
        String[] sampleLines = { // 5 different test strings with various parentheses combinations
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
    // this method checks if the brackets are balanced or not
    public static boolean isBalanced(String text) {
        Stack<Character> myStack = new Stack<>(); //Uses Stack to check if parentheses are balancedUses Stack to check if parentheses are balanced
        // read each character one by one
        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);
        // if it is opening bracket, add it to stack
        if (letter == '(' || letter == '[' || letter == '{') {
                myStack.push(letter);
            }
        // if it is closing bracket, check the top of stack
        else if (letter == ')' || letter == ']' || letter == '}') {

            if (myStack.isEmpty()) {
                return false;
            }

            char top = myStack.pop();

            if (letter == ')' && top != '(') {
                return false;
            }

            if (letter == ']' && top != '[') {
                return false;
            }

            if (letter == '}' && top != '{') {
                return false;
            }
        }
        }
        // if stack is empty, all brackets are closed correctly
        return myStack.isEmpty();
    }
}
