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
        if (n == 1) {
            moveDisk(from, to);
        } else {
            solveHanoi(n - 1, from, aux, to);
            moveDisk(from, to);
            solveHanoi(n - 1, aux, to, from);
        }
    }
    public static void moveDisk(char fromPeg, char toPeg) {
        if (isValidMove(fromPeg, toPeg)) {

            Stack<Integer> fromStack = getPeg(fromPeg);
            Stack<Integer> toStack = getPeg(toPeg);

            int disk = fromStack.pop();
            toStack.push(disk);

            moves++;

            System.out.println("Move " + moves + ": Disk " + disk + " from " + fromPeg + " to " + toPeg);
            displayPegs();

        } else {
            System.out.println("Invalid move from " + fromPeg + " to " + toPeg);
        }
    }
    public static boolean isValidMove(char fromPeg, char toPeg) {
        Stack<Integer> fromStack = getPeg(fromPeg);
        Stack<Integer> toStack = getPeg(toPeg);

        if (fromStack.isEmpty()) {
            return false;
        }

        if (toStack.isEmpty()) {
            return true;
        }

        if (fromStack.peek() < toStack.peek()) {
            return true;
        } else {
            return false;
        }
    }
    public static void displayPegs() {
        System.out.println("Peg A: " + pegA);
        System.out.println("Peg B: " + pegB);
        System.out.println("Peg C: " + pegC);
        System.out.println("---------------------------");

    }
    public static Stack<Integer> getPeg(char pegName){
        return pegA;
    }

}
