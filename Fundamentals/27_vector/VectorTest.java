import java.util.*;

public class VectorTest {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("banana"); 
        v.add("apple"); 
        v.add("orange"); 
        v.add("peach");   
        System.out.println(v);

        v.remove("peach");
        System.out.println(v);

        v.clear();
        System.out.println(v);

        v.add("banana"); 
        v.add("apple"); 
        v.add("orange"); 
        v.add("peach"); 
        System.out.println(v.size());

        System.out.println(v.contains("peach"));
        System.out.println(v.contains("not peach"));
        System.out.println(v.get(0));

        Vector<String> v_Dupe = new Vector<>();
        v_Dupe.addAll(v);  
        System.out.println(v_Dupe);

        System.out.println(v_Dupe.containsAll(v));
        v_Dupe.remove("peach");
        System.out.println(v_Dupe.containsAll(v));

        Iterator<String> i = v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        String[] array = v.toArray(new String[v.size()]);
        for(String fruit: v){
            System.out.println(fruit);
        }

    }
}
