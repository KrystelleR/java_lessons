import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("strawberry");
           
        System.out.println(list);

        list.remove("strawberry");
        
        System.out.println(list);

        list.clear();

        System.out.println(list);

        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("strawberry");

        System.out.println(list.size());
        System.out.println(list.contains("strawberry"));
        System.out.println(list.get(1));


        ArrayList<String> listA = new ArrayList<>();
        listA.addAll(list);
        System.out.println(listA);

        System.out.println(listA.containsAll(list));

        Iterator <String> iterate = list.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        String [] fruitArray = list.toArray(new String[0]);

        for(String fruit: fruitArray){
            System.out.println(fruit);
        }   
    }
}
