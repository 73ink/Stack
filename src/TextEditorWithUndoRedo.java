import java.util.Stack;

public class TextEditorWithUndoRedo {
    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();
    static String text = "";
    public static void main (String[] args){
        type("Hello");
        type(" World");
        type(" Java");

        undo();
        undo();

        redo();

        type(" Aaisha");

    }
    public static void type(String newText){

    }
    public static void undo() {

    }
    public static void redo() {

    }
}
