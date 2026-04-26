import java.util.Stack;

public class PostfixEvaluator {
    public static void main(String[] args) {
        // 6 different postfix expressions to evaluate
        String[] expressions = {"34+", "52-", "62*", "82/", "93%", "23+4*"};

        for (String exp : expressions) {
            System.out.println("Postfix expression: " + exp);
            System.out.println("Result: " + evaluatePostfix(exp));
            System.out.println("--------------------");
        }
    }
    public static String evaluatePostfix(String expression){

    }
}
