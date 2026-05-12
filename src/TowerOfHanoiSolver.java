import java.util.Stack;

public class TowerOfHanoiSolver {

    static Stack<Integer> pegA = new Stack<>();
    static Stack<Integer> pegB = new Stack<>();
    static Stack<Integer> pegC = new Stack<>();

    static int moves = 0;

    public static void main (String[] args){

    }

    public static void runHanoi(int numDisks){
        pegA.clear();
        pegB.clear();
        pegC.clear();
        moves =  0;

        initializePegs(numDisks);

        System.out.println("Starting Tower of Hanoi with " + numDisks + " disks");
        displayPegs();

        solveHanoi(numDisks, 'A', 'C', 'B');

        System.out.println("Total moves: " + moves);
        System.out.println("Minimum moves should be: " + ((int)Math.pow(2, numDisks) - 1));
        System.out.println("=================");

    }
    public static void initializePegs(int numDisks){
        for (int i = numDisks; i >= 1; i--) {
            pegA.push(i);
        }

    }
    public static void solveHanoi(int n, char from, char to, char aux){

    }
    public static void moveDisk(char fromPeg, char toPeg) {

    }
    public static boolean isValidMove(char fromPeg, char toPeg) {

    return false;
    }
    public static void displayPegs() {

    }

}
