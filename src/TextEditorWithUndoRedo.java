import java.util.Stack;

public class TextEditorWithUndoRedo {
    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();
    static String text = "";

    public static void main(String[] args) {
        // simulate 8 different user actions (typing, undo, redo)
        type("Hello");
        type(" I'm");
        type(" Aaisha");
        type(" coding-champ");
        type(" Stack");
        type(" Practice");
        type(" Task 9");


        undo();
        undo();

        redo();

        type(" Aaisha");
        type("Java");

        undo();
        undo();
        undo();
        redo();
        redo();
        undo();
        undo();
        undo();

    }

    public static void type(String newText) {
        undoStack.push(text);
        limitUndoHistory();
        text = text + newText;
        redoStack.clear();

        System.out.println("Typed: " + newText);
        display();
    }
    public static void limitUndoHistory(){

        if (undoStack.size() > 10){
            Stack<String> tempStack = new Stack<>();
            while (!undoStack.isEmpty()){
                tempStack.push(undoStack.pop());
            }
        }
    }

    public static void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
        } else {
            redoStack.push(text);
            text = undoStack.pop();
            System.out.println("Undo done");
        }

        display();
    }

    public static void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
        } else {
            undoStack.push(text);
            text = redoStack.pop();
            System.out.println("Redo done");
        }

        display();
    }

    public static void display() {
        System.out.println("Current text: " + text);
        System.out.println("Undo stack: " + undoStack);
        System.out.println("Redo stack: " + redoStack);
        System.out.println("--------------------");

    }
}
