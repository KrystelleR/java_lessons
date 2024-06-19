public class InputValidator3{
	public static boolean isValid(String input){
		if(input.length() !=0){
			return true;
		}
		System.out.println("Input cannot be empty");
		return false;
	}
}