import java.util.Stack;

public class EmployeeStackDemo {
    public static void main (String[] args){
        Stack<String> actionLog = new Stack<>();
        actionLog.push("Ali logged into the system");
        actionLog.push("Sara updated customer details");
        actionLog.push("Maha approved the invoice");
        actionLog.push("Hamed checked stock items");
        actionLog.push("Noor generated the daily report");
    }
}
