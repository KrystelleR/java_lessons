class NumberValidator{
	// Method to check if input is a valid numerical value
	public static boolean isValid (String value){
		try{
			double validValue = Double.parseDouble(value);
			return true;
		}
		catch (Exception e){
			System.out.println("Invalid value. Try again.");
			return false;
		}
	}

	// Method to check if input is a valid non-zero value for division or modulus
	public static boolean isValidDivide (String value, String sign){
		if(Double.parseDouble(value) == 0){
			if(sign.equals("/") || sign.equals("%")){
				System.out.println("Cannot divide by 0.");
				return false;
			}
			else return true;
		}
		else return true;
	}
}