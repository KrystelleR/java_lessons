import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEg3 {
   public static void main(String[] args) {
       List<String> friends = new ArrayList<String>(Arrays.asList("1Brian", "Nate", "Neal", "Raju", "Sara", "Scott"));

       friends.replaceAll(e -> e.toUpperCase());
       System.out.println(friends);
   }
}
