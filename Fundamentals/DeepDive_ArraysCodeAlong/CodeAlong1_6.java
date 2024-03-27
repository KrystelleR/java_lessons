class CodeAlong1_6{
	public static void main(String[] args) {
		//declaration
		int[][] myArray = new int[10][10];
		//populate array
		populateArray(myArray);
		//method call
		count(myArray);
	}

	//method to print values in array
	public static void count(int[][] myArray){
		for(int i =0; i < myArray.length; i++){
			for(int j =0; j < myArray[i].length; j++){
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	//method to populate array (values 0 to array.length)
	public static void populateArray(int[][] myArray){
		int value = 0;
		for(int i = 0; i <myArray.length; i++){
			for(int j = 0; j <myArray[i].length; j++){
				myArray[i][j] = value++;
			}
		}
	}
}