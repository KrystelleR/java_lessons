class MenuValidator{

	public static boolean isMainValid(String optionStr){
		if(optionStr.equalsIgnoreCase("X")){
			System.out.println("Goodbye!");
			System.exit(0);
			return true;
		}
		else if(NumberValidator.isValid(optionStr)){
			int option = Integer.parseInt(optionStr);
				if(option>=0 && option<=5){
					return true;
				}
				else{
					return false;
				}
		}
		return false;
	}

	public static boolean isUpdateValid(String optionStr){
		if(NumberValidator.isValid(optionStr)){
			int option = Integer.parseInt(optionStr);
			if(option>=0 && option<=5){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
}