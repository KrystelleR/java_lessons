class getBlock{
	/*
			Method to return block to user using switch case. 
			If user is in primary school (grade 1 to grade 7) then they are in block B.
			If user is in high school (grade 8 to grade 12) then they are in block A.
	*/
	public static String returnBlock(int grade){
		if(grade>=1 && grade <= 7){
			return "Block B";
		}
		else if(grade>=8 && grade <=12){
			return "Block A";
		}
		else{
			return "Invalid Block";
		}
	}
}