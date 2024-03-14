class operatorValidator{
	public static boolean isValid(String input){
		String[] operators = {"+", "-", "/", "*", "%"};
		boolean isValid = false;

		for(String sign : operators){
			if(sign.equals(input)){
				isValid = true;
			}
		}

		for(int i = 1; i <=5; i++){
			if(input.equals(String.valueOf(i))){
				isValid = true;
			}
		}
		return isValid;
	}

	public static String operationFinder(String operator){
		switch(operator){
			case "+":
			case "1":
				return "addition (+)";
			case "-":
			case "2":
				return "subtraction (-)";
			case "*":
			case "3":
				return "multiplication (*)";
			case "/":
			case "4":
				return "division (/)";
			case "%":
			case "5":
				return "modulus (%)";
			default:
				return "invalid";
		}
	}

	public static String getSign(String sign){
		for(int i = 1; i<=5; i++){
			if(sign.equals(String.valueOf(i))){
				switch (sign){
				case "1":
					return "+";
				case "2":
					return "-";
				case "3":
					return "*";
				case "4":
					return "/";
				case "5":
					return "%";
				}
			}
		}
			return sign;
	}
}