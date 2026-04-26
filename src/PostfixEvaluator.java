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
    // replaced String with int
    public static int evaluatePostfix(String exp){
        Stack<Integer> nums = new Stack<>();
        // Show token by token evaluation steps
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch >= '0' && ch <= '9') {
                nums.push(ch - '0');
            } else {
                int second = nums.pop();
                int first = nums.pop();

                if (ch == '+') {
                    nums.push(first + second);
                } else if (ch == '-') {
                    nums.push(first - second);
                } else if (ch == '*') {
                    nums.push(first * second);
                } else if (ch == '/') {
                    nums.push(first / second);
                } else if (ch == '%') {
                    nums.push(first % second);
                }
            }
        }
        return nums.pop();

    }
}
