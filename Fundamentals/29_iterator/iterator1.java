import java.util.ArrayList;
import java.util.Iterator;

class iterator1{
	public static void main (String[] args){
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Banana");
		myList.add("Apple");
		myList.add("Pear");
		myList.add("Strawberry");
		myList.add("Blueberry");
		myList.add("Orange");

		Iterator<String> listIterator = myList.iterator();  
		while(listIterator.hasNext()){
			String value = listIterator.next();
			System.out.println(value);

			if(value.equals("Orange")){
				listIterator.remove();
			}

		}

		System.out.println(myList);

	}
}