class SingleDimensionArray1{

	public static void main(String[] args) {
		//declarations
		int[] myArray = {234, 54, 789, 15, 6, 890, 321, 45, 167, 76, 8, 678, 13, 987, 
		543, 89, 241, 46, 789, 7, 543, 167, 24, 890, 79, 345, 456, 82, 121, 456, 876, 23, 810, 567, 17, 
		890, 876, 567, 234, 80, 719, 543, 34, 2, 12, 234, 57, 80, 876, 79};

		//printing out array
		System.out.println("All elements in array:");
		printArray(myArray);

		//incrementing array
		myArray = incrementArray(myArray);

		//printing out array now incremented
		System.out.println("\n\nAll elements in array incremented:");
		printArray(myArray);
	}

	//method to print all elements in array
	public static void printArray(int[] myArray){
		for(int element: myArray){
			System.out.print(element + " ");
		}
	}

	//method to increment all elements in array
	public static void incrementArray(int[] myArray){
		for(int i = 0; i < myArray.length; i++){
			myArray[i]++;
		}
	}
}