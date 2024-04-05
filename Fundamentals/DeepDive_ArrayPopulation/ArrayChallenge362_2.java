import java.util.Random;

class ArrayChallenge362_2{
	public static void main(String[] args) {
		//declarations
		int[][] twoDArray = new int [3][100];

		//populating arrays
		populateEvenArray(twoDArray[0]);
		populateOddArray(twoDArray[1]);
		populatePrimeArray(twoDArray[2]);

		//printing arrays
		System.out.println("Printing even array:");
		printArray(twoDArray[0]);
		System.out.println("Printing odd array:");
		printArray(twoDArray[1]);
		System.out.println("Printing prime array:");
		printArray(twoDArray[2]);
	}

	//method to populate even array
	public static void populateEvenArray(int[] myArray){
		int value = 0;
		for(int i = 0; i< myArray.length; i++){
			//do-while so that code repeats until a valid value is found
			do
			value++;
			while((value%2 ==0) == false);
			
			myArray[i] = value;
		}
	}		

	//method to populate odd array
	public static void populateOddArray(int[] myArray){
		Random r = new Random();
		int randomValue;
		for(int i = 0; i< myArray.length; i++){
			//do-while so that code repeats until a valid value is found
			do
			randomValue = r.nextInt(1000);
			while((randomValue%2 !=0) == false);
			
			myArray[i] = randomValue;
		}
	}		

	//method to populate prime array
	public static void populatePrimeArray(int[] myArray){
		Random r = new Random();
		int randomValue;
		boolean invalid;
		for(int i =0; i < myArray.length; i++){
			//do-while so that code repeats until a valid value is found
			do{
				invalid = false;
				randomValue = r.nextInt(1000);
				
				//if it is prime, value can only be divisible by 1 and itself
				//therefore everything in between (2 and value-1), if the value is divisible by that, it is not prime.
				for(int j = 2; j <randomValue-1; j++){
					if(randomValue!=2) //2 is the only even prime number and is therefore excluded from the rest of the formula
						if(randomValue%j==0){
							invalid = true;
						}
				}
			}
			while(invalid == true);
			myArray[i] = randomValue;
		}
	}

	//method to print array
	public static void printArray(int[] myArray){ 
		for(int element : myArray){
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
}