import java.util.ArrayList;
import java.util.Iterator;

public class VectorTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Aaron");
        list.add("Ghislain-Claude");
        list.add("Samantha");
        list.add("Tumi");
        list.add("Krystelle");

        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n\n");

        list.remove("Aaron");
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n\n");
        list.clear();
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        boolean hasSam = list.contains("Samantha");
        System.out.println("Is Samantha in the list:" + hasSam);

        list.add("Aaron");
        list.add("Ghislain-Claude");
        list.add("Samantha");
        list.add("Tumi");
        list.add("Krystelle");

        ArrayList<String> listA = new ArrayList<>();
        listA.addAll(list);

        for(int i =0; i<listA.size(); i++){
            System.out.println(listA.get(i));
        }

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Aaron");
        listB.add("Ghislain-Claude");
        listB.add("Samantha");
        listB.add("Phil");
        listB.add("Thebe");
        listB.add("KG");

        System.out.println("\n\n");
        System.out.println(listA.containsAll(list));
        System.out.println(listB.containsAll(list));

        System.out.println("\n\n");
        Iterator<String> iterate = list.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println("\n\n");
        String [] listAsArray = list.toArray(new String[7]);
        for(int i =0; i<listAsArray.length; i++){
            System.out.println(listAsArray[i]);
        }

        list.remove("Aaron");
        for(int i =0; i<listAsArray.length; i++){
            System.out.println(listAsArray[i]);
        }
    }
}
