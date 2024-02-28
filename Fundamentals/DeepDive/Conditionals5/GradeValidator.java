class GradeValidator{
	/*
			Method to check if grade is valid.
			Grade must be an int value (using try and catch)
			Grade must be inbetween 1 and 12
	*/
	public static boolean isValid(String gradeStr){
		try{
			int grade = Integer.parseInt(gradeStr);
			if((grade >=1) && (grade <=12)){
				return true;
			}
			else{
				System.out.println("Invalid grade. Enter a value between 1 and 12");
				return false;
			}
		}
		catch (Exception e){
			System.out.println("Invalid. Try again");
			return false;
		}
	}
}