class MyCleanCode{
	public static void main(String[] args) {
		int [] shoesize  =  {11,2,33,4,5,6,7,8,9,10,2,4,6,8,20,1,3,5,10,99,17,2,3,21,5,6,7,8,9,50,13,2,4,32,7,8,4,2,6,8,2,5,43,9,3,5,88,54,4,10};

		//displaying all shoe sizes
		System.out.println("All Shoe Sizes:");
		for(int size : shoesize){
			System.out.print(size + "  ");
		}

		//displaying all shoe sizes that are even
		System.out.println("\n\nShoe Sizes that are even:");
		printEven(shoesize);

		//displaying all shoe sizes divisible by 11
		System.out.println("\n\nShoe sizes that are divisible by 11:");
		printDivisibleby11(shoesize);

		//displaying all shoe sizes that are even (post increment)
		System.out.println("\n\nIncreasing shoe size by 1:");
		incrementValues(shoesize);

		//displaying all shoe sizes that are even after increment
		System.out.println("\n\nShoe Sizes that are even (after increment):");
		printEven(shoesize);
		

		//displaying all shoe sizes divisable by 11 after increment
		System.out.println("\n\nShoe sizes that are divisable by 11 (after increment):");
		printDivisibleby11(shoesize);
		
	}

	public static void printEven(int [] shoesize){
		for(int size : shoesize){
			//see if size is even
			if(size%2 == 0)
			System.out.print(size+ "  ");
		}
	}

	public static void printDivisibleby11(int [] shoesize){
		for(int size : shoesize){
			//see if size is divisable by 11
			if(size%11 == 0)
			System.out.print(size+ "  ");
		}
	}

	public static void incrementValues(int [] shoesize){
		for(int i=0; i < shoesize.length; i++){
			shoesize[i] = shoesize[i] +1;
			System.out.print(shoesize[i] + " ");
		}
	}
}