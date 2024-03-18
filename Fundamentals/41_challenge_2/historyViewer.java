import java.util.ArrayList;
import java.util.Iterator;

class historyViewer {
    // ArrayList to store history
    public static ArrayList<String> history = new ArrayList<>();

    // Method to display history
    public static void display() {
        // Creating iterator for history ArrayList
        Iterator<String> historyIterator = history.iterator();
        if (!history.isEmpty()) {
            // Printing history
            System.out.println("\n************ History ************");
            int x = 1;
            while (historyIterator.hasNext()) {
                System.out.println(x + ") " + historyIterator.next());
                x++;
            }
            System.out.println("*********************************\n\n");
        } else {
            // If history is empty
            System.out.println("\nYou have no history. Complete an equation first.\n\n");
        }
    }
}