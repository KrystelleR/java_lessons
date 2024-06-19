 public class ClassCastTest {
	public static void main(String[] args) {
		
		String exception = new String();
		
		System.out.println("Step 1");
		
		Object exception2 = (Exception) exception;
		
		System.out.println("Step 2");
	}
}
