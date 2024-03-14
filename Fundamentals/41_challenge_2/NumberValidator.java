class NumberValidator{
	public static boolean isValid (String value){
		try{
			int validValue = Integer.parseInt(value);
			return true;
		}
		catch (Exception e){
			System.out.println("Invalid value. Try again.");
			return false;
		}
	}

	public static boolean isValidDivide (String value, String sign){
		if(Integer.parseInt(value) == 0){
			if(sign.equals("/") || sign.equals("%")){
				System.out.println("Cannot divide by 0.");
				return false;
			}
			else return true;
		}
		else return true;
	}
}