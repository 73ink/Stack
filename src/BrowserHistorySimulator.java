import java.util.Stack;

public class BrowserHistorySimulator {
    public static void main (String[] args){
        Stack<String> pageTrail = new Stack<>();

        visitPage(pageTrail, "https://www.figma.com");
        visitPage(pageTrail, "https://www.quillbot.com");
        visitPage(pageTrail, "https://www.github.com");
        visitPage(pageTrail, "https://www.translate.google.com");
        visitPage(pageTrail, "https://www.typingtest.com");

        goBack(pageTrail);
        goBack(pageTrail);

        showCurrentPage(pageTrail);
        System.out.println("Is browser history empty? " + pageTrail.isEmpty());
        System.out.println();

        visitPage(pageTrail, "https://www.reddit.com");
        visitPage(pageTrail, "https://www.medium.com");

        System.out.println("Final browsing history:");
        System.out.println(pageTrail);
        System.out.println();

        System.out.println("Clearing history now...");
        pageTrail.clear();
        System.out.println("History after clear: " + pageTrail);
        System.out.println("Is browser history empty now? " + pageTrail.isEmpty());

    }
    public static void visitPage(Stack<String> pageTrail, String url) {
        pageTrail.push(url);
        System.out.println("Visited: " + url);
        showCurrentPage(pageTrail);
        System.out.println("History: " + pageTrail);
        System.out.println();
    }
    public static void goBack(Stack<String> pageTrail) {
        if (!pageTrail.isEmpty()) {
            String removedPage = pageTrail.pop();
            System.out.println("Went back from: " + removedPage);
        } else {
            System.out.println("No pages in history to go back.");
        }
        showCurrentPage(pageTrail);
        System.out.println("History: " + pageTrail);
        System.out.println();
    }
    public static void showCurrentPage(Stack<String> pageTrail){
        if (!pageTrail.isEmpty()) {
            System.out.println("Current page: " + pageTrail.peek());
        } else {
            System.out.println("Current page: no page opened");
        }
    }
}
