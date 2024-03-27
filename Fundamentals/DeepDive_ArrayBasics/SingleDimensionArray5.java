import java.util.Random;

class SingleDimensionArray5{
	 public static void main(String[] args) {
	 	//declare
	 	int[] myArray = new int[50];

	 	//populating array
	 	myArray = populateArray(myArray);

	 	//printing out all even elements that are divisible by 11 in array
		System.out.println("All even elements that are divisible by 11 in Array:");
		printAllEvenandDivisibleBy11Array(myArray);
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

	//method to print out all even values in array
	 	 public static void printAllEvenandDivisibleBy11Array(int[] myArray){
	 	for(int element : myArray){
	 		if(element%2 ==0)
	 			if(element%11 ==0)
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
