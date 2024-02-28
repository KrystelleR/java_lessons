class NameValidator{
	/*
			Method to check if strings given are valid.
			If length is 0 then empty then invalid.
	*/
	public static boolean isValid(String input){
		try{
			if(input.length() == 0){
				System.out.println("Input cannot be blank.");
				return false;
			}
			else{
				return true;
			}
		}
		catch (Exception e){
			System.out.println("Invalid input. Try again");
			return false;
		}
	}
}