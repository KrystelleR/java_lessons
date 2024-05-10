class NumberValidator{

	public static boolean isValid(String valueStr){
		try{
			int value = Integer.parseInt(valueStr);
			return true;
		}
		catch(Exception e){
			System.out.println("\nInvalid. Please enter a valid numerical value.");
			return false;
		}
	}
}