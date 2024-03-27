class CodeAlong1_2{
	public static void main(String[] args) {
		//method call
		count();
	}

	//method to print values 1 to 10
	public static void count(){
		int i = 1;
		do
			System.out.print(i + " ");
		while(i++<10);
	}
}