class MenuValidator{
	 // Method to check if input is valid for menu
	public static boolean isValid(String value){
		// Checking if input is 'x' (exit)
		boolean isValid = (value.equalsIgnoreCase("x"))? true: false;
		return isValid;
	}
}