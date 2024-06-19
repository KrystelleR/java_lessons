public class NumberValidator3{
	public static boolean isValid(String value){
		try{
			int number = Integer.parseInt(value);
			return true;
		}
		catch(Exception e){
			System.out.println("Invalid number");
			return false;
		}
	}
}