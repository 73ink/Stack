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

        for (int i = 0; i < html.length(); i++){
            if (html.charAt(i) =='<'){
                int end = html.indexOf('>', i);
                String tag = html.substring(i+1, end);

                if (!tag.startsWith("/")){
                    tagStack.push(tag);
                } else {
                    String closingTag = tag.substring(1);

                    if(tagStack.isEmpty()){
                        return false;
                    }
                    String openingTag = tagStack.pop();
                    if (!openingTag.equals(closingTag)){
                        return  false;
                    }
                }
                i = end;

            }
        }
        return  tagStack.isEmpty();

    }

}
