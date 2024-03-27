class SingleDimensionArray2{
	public static void main(String[] args) {
		//declaration
		int [] myArray = new int [11];
		//populate array
		populateArray(myArray);
		//loop through array and test each element
		int i = 0;
		while(i<myArray.length)
			arrayCondition(myArray[i++]);
	}

//method to populate array
	public static void populateArray(int[] myArray){
		int i = 0;
		while(i < myArray.length)
			myArray[i] = i++;
	}

//method to check if conditions are true
	public static void arrayCondition(int value){
		if(value > 1)
			if(value > 2)
				if(value > 3)
					if(value > 4)
						if(value > 5)
							if(value > 6)
								if(value > 7)
									if(value > 8)
										if(value > 9)
											System.out.println("Greater than 9");
									else 
										System.out.println("Greater than 8");
								else 
									System.out.println("Greater than 7");
							else 
								System.out.println("Greater than 6");
						else 
							System.out.println("Greater than 5");
					else 
						System.out.println("Greater than 4");
				else 
					System.out.println("Greater than 3");
			else 
				System.out.println("Greater than 2");							
		else
			System.out.println("Greater than 1");
	}
}