class Printer{
	/*
			Method to print out users information
	*/
	public static void print(String name, String surname, int grade, String block, String classTeacher, String peTeacher){
		System.out.println("======================================================");
		System.out.println("Welcome, " + name + " " + surname + "!\nYou are in grade " + grade);
		System.out.println("\n\nYou are in " + block);

		//if user's block is A, they are in high school else they are in primary school
		if(block.equals("Block A"))
			System.out.println("You are in high school");
		else
			System.out.println("You are in primary school");

		System.out.println("Your class teacher is " + classTeacher);
		System.out.println("Your PE teacher is " + peTeacher);
		System.out.println("======================================================");
	}
}