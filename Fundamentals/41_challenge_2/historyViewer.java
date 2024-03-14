import java.util.ArrayList;
import java.util.Iterator;

class historyViewer{
	public static ArrayList <String> history = new ArrayList <>();

	public static void display(){
		Iterator <String> historyIterater = history.iterator();
		if(!history.isEmpty()){
			System.out.println("\n************ History ************");
			int x = 1;
			while(historyIterater.hasNext()){
				System.out.println(x + ") " +historyIterater.next());
				x++;
			}
			System.out.println("*********************************\n\n");
		}
		else{
			System.out.println("\nYou have no history. Complete an equation first.\n\n");
		}

	}
}