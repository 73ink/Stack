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
    }
}