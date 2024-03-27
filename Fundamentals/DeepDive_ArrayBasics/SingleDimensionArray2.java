class SingleDimensionArray2{

	public static void main(String[] args) {
		//declarations
		int[] myArray = {234, 54, 789, 15, 66, 890, 321, 45, 167, 76, 88, 678, 13, 987, 
		543, 89, 241, 46, 789, 7, 543, 167, 24, 890, 79, 22, 456, 82, 121, 456, 876, 23, 810, 567, 17, 
		890, 876, 567, 234, 80, 719, 543, 34, 2, 12, 234, 57, 80, 876, 79};

		//printing out all even elements that are divisible by 11 in array
		System.out.println("All even elements that are divisible by 11 in Array:");
		printAllEvenandDivisibleBy11Array(myArray);
	}

	//method to print all elements in array
	public static void printArray(int[] myArray){
		for(int element: myArray){
			System.out.print(element + " ");
		}
	}

	//method to increment all elements in array
	public static int[] incrementArray(int[] myArray){
		for(int i = 0; i < myArray.length; i++){
			myArray[i]++;
		}
		return myArray;
	}

	//method to print out all even values in array
	public static void printAllEvenandDivisibleBy11Array(int[] myArray){
		for(int element: myArray){
			if(element%2 ==0)
				if(element%11==0)
					System.out.print(element + " ");
		}
	}

}


