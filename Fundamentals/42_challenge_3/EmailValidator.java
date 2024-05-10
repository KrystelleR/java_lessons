class EmailValidator{
	public static boolean isValid(String email){
		boolean foundSymbol = false;

		for(int i =0; i<email.length(); i++){
			char currentValue = email.charAt(i);
			if(currentValue=='@'){
				foundSymbol = true;
				break;
			}
		}

		if(foundSymbol){
			String[] emailDomain = email.split("@", 2);
			if(emailDomain[1].contains(".com") || emailDomain[1].contains(".co.za")){
				return true;
			}
			else{
				return false;
			}
		}

		return false;
	}
}