class CodeAlong1_5{
	public static void main(String[] args) {
		//declaration
		int[] myArray = new int[25];
		//populate array
		populateArray(myArray);
		//method call
		count(myArray);
	}

	//method to print values 1 to max value
	public static void count(int[] myArray){
		for(int i =0; i < myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
	}

	//method to populate array (values 0 to array.length)
	public static void populateArray(int[] myArray){
		for(int i = 0; i <myArray.length; i++){
			myArray[i] = i;
		}
	}
}