public class InstanceTest{
	public static void main(String[] args) {
		Object mary = new Mary();
	    boolean test  = (mary instanceof person);
		System.out.println("Instance of returned ["+test+"]");
	}	
}