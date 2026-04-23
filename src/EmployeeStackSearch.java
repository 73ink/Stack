import java.util.Iterator;
import java.util.Stack;

public class EmployeeStackSearch {
    public static void main(String[] args) {
        Stack<String> workSearch = new Stack<>();
        workSearch.push("Ahmed logged into the HR portal");
        workSearch.push("Mona uploaded attendance report");
        workSearch.push("Salim approved leave request");
        workSearch.push("Huda updated salary details");
        workSearch.push("Yasir checked warehouse stock");
        workSearch.push("Reem sent invoice to client");

        System.out.println("Current employee action stack:");
        System.out.println(workSearch);
        System.out.println();

        System.out.println("Actions with positions from top:");
        for (int i = workSearch.size() - 1, pos = 1; i >= 0; i--, pos++) {
            System.out.println("Position " + pos + ": " + workSearch.get(i));
        }
        System.out.println();
        int firstSearch = workSearch.search("Salim approved leave request");
        int secondSearch = workSearch.search("Ahmed logged into the HR portal");

        System.out.println("Search results:");
        System.out.println("\"Salim approved leave request\" found at position from top: " + firstSearch);
        System.out.println("\"Ahmed logged into the HR portal\" found at position from top: " + secondSearch);
        System.out.println();

        System.out.println("Contains check:");
        System.out.println("Does stack contain \"Huda updated salary details\"? "
                + workSearch.contains("Huda updated salary details"));
        System.out.println("Does stack contain \"Khalid removed old file\"? "
                + workSearch.contains("Khalid removed old file"));
        System.out.println();

        System.out.println("Iterating with normal for loop (top to bottom):");
        for (int i = workSearch.size() - 1; i >= 0; i--) {
            System.out.println(workSearch.get(i));
        }
        System.out.println();

        System.out.println("Iterating with for-each loop (bottom to top):");
        for (String action : workSearch) {
            System.out.println(action);
            System.out.println();
        }

        System.out.println("Iterating with Iterator:");
        Iterator<String> stepByStep = workSearch.iterator();
        while (stepByStep.hasNext()) {
            System.out.println(stepByStep.next());
        }
        System.out.println();

        System.out.println("Actions with index positions:");
        for (int i = 0; i < workSearch.size(); i++) {
            System.out.println("Index " + i + ": " + workSearch.get(i));
        }

    }
}