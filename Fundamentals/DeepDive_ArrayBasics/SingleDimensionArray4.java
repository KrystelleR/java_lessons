import java.util.Random;

class SingleDimensionArray4{
	 public static void main(String[] args) {
	 	//declare
	 	int[] myArray = new int[50];

	 	//populating array
	 	myArray = populateArray(myArray);

	 	//printing out all elements in array
	 	System.out.println("All elements in array:");
	 	printArray(myArray);
	 	
	 	//incrementing array
	 	myArray = incrementArray(myArray);

	 	//printing out all elements in array after incrementation
	 	System.out.println("\n\nAll elements in array (post-increment):");
	 	printArray(myArray);

	 }

	 //method to populate array with random values
	 public static int[] populateArray(int[] myArray){
	 	Random randomNumbers = new Random();
	 	for(int i = 0; i < myArray.length; i++){
	 		myArray[i] = randomNumbers.nextInt(100);
	 	}
	 	return myArray;
	 }

	 //method to print out all elements in array
	 public static void printArray(int[] myArray){
	 	for(int element : myArray){
	 		System.out.print(element + " ");
	 	}
	 }

	 //method to increment all values in array
	 public static int[] incrementArray(int[] myArray){
	 	for(int i = 0; i < myArray.length; i++){
	 		myArray[i]++;
	 	}
	 		 	return myArray;
	 }
}
