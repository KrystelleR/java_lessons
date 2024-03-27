import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("Djibouti", "Djibouti City ");
		hashMap.put("Anitgua and Barbuda", "Saint John's");
		hashMap.put("Seychelles", "Victoria");
		hashMap.put("Bolivia", "Sucre");
		hashMap.put("Eritrea", "Asmara");
		hashMap.put("Moldova", "Chișinău");
		hashMap.put("Nicaragua", "Managua");

		
		Set<String> keySet = hashMap.keySet();		
		Collection<String> values = hashMap.values();		
		
		for (String key : keySet) {
            System.out.println("Key: " + key);
        }	


        for (String value : values) {
            System.out.println("Value: " + value);
        }
    }	
}
