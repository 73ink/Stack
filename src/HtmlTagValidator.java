import java.util.Stack;

public class HtmlTagValidator {

    public static void main(String[] args){

        String[] tags ={
                "<b><i></i></b>",
                "<p></p>",
                "<b><i></b></i>",
                "<h1></h1>",
                "<div><p></p></div>"
        };

        for (String html : tags){
            System.out.println("HTML: " + html);
            System.out.println("Valid? " + checkTags(html));
            System.out.println("---------------");
        }

    }
    public  static boolean checkTags(String html){

        Stack<String> tagStack = new Stack<>();

    }

}
