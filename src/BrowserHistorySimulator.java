import java.util.Stack;

public class BrowserHistorySimulator {
    public static void main (String[] args){
        Stack<String> pageTrail = new Stack<>();

        visitPage(pageTrail, "https://www.figma.com");
        visitPage(pageTrail, "https://www.quillbot.com");
        visitPage(pageTrail, "https://www.github.com");
        visitPage(pageTrail, "https://www.translate.google.com");
        visitPage(pageTrail, "https://www.typingtest.com");

    }
    public static void visitPage(Stack<String> pageTrail, String url) {

    }
}
