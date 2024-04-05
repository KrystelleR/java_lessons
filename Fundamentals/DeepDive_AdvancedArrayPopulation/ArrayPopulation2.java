public class ArrayPopulation2 {
	public static void main(String[]args){
		//declarations
        int[] array = new int[10];
        boolean[] booleanArray = new boolean[10];
        byte[] byteArray = new byte[10];
        char[] charArray = new char[10];
        short[] shortArray = new short[10];
        long[] longArray = new long[10];
        float[] floatArray = new float[10];
        double[] doubleArray = new double[10];
        String[] stringArray = new String[10];

        //giving random value to last value in index
        booleanArray[booleanArray.length-1] = true;
        byteArray[byteArray.length-1] = 111;
        charArray[charArray.length-1] = 'A';
        shortArray[shortArray.length-1] = 222;
        longArray[longArray.length-1] = 333;
        floatArray[floatArray.length-1] = 444.4f;
        doubleArray[doubleArray.length-1] = 555.5;
        stringArray[stringArray.length-1] = "B";

        //printing out array
        printArray("array: ",array);
        printArray("boolean array: ",convertToIntegerArray(booleanArray));
        printArray("byte array: ",convertToIntegerArray(byteArray));
        printArray("char array: ",convertToIntegerArray(charArray));
        printArray("short array: ",convertToIntegerArray(shortArray));
        printArray("long array: ",convertToIntegerArray(longArray));
        printArray("float array: ",convertToIntegerArray(floatArray));
        printArray("double array: ",convertToIntegerArray(doubleArray));
        printArray("string array: ",convertToIntegerArray(stringArray));

    }

	//convert boolean array to int array
    public static int[] convertToIntegerArray(boolean[] myArray){
        int[] tempArray = new int[myArray.length];
        int i =0;
        for(boolean element : myArray){
            tempArray[i] = element ? 1 : 0;
            i++;
        }  
        return tempArray; 
    }

    //convert byte array to int array
    public static int[] convertToIntegerArray(byte[] myArray){
        int[] tempArray = new int[myArray.length];
        int i =0;
        for(double element : myArray){
            tempArray[i] = (int)element;
            i++;
        }
        return tempArray;
    }

    //convert char array to int array
    public static int[] convertToIntegerArray(char[] myArray){
        int[] tempArray = new int[myArray.length];
        int i =0;
        for(double element : myArray){
            tempArray[i] = (int)element;
            i++;
        }
        return tempArray;
    }

    //convert double array to int array
    public static int[] convertToIntegerArray(double[] myArray){
        int[] tempArray = new int[myArray.length];
        int i =0;
        for(double element : myArray){
            tempArray[i] = (int)element;
            i++;
        }
        return tempArray;
    }

    //convert short array to int array
    public static int[] convertToIntegerArray(short[] myArray){
        int[] tempArray = new int[myArray.length];
        int i =0;
        for(double element : myArray){
            tempArray[i] = (int)element;
            i++;
        }
        return tempArray;
    }

    //convert long array to int array
    public static int[] convertToIntegerArray(long[] myArray){
        int[] tempArray = new int[myArray.length];
        int i =0;
        for(double element : myArray){
            tempArray[i] = (int)element;
            i++;
        }
        return tempArray;
    }

	//convert float array to int array
    public static int[] convertToIntegerArray(float[] myArray){
        int[] tempArray = new int[myArray.length];
        int i =0;
        for(double element : myArray){
            tempArray[i] = (int)element;
            i++;
        }
        return tempArray;
    }

    //convert String array to int array
    public static int[] convertToIntegerArray(String[] myArray){
        int[] tempArray = new int[myArray.length];
        int i =0;
        for(String element : myArray){
            tempArray[i] = element==null?0:1;
            i++;
        }
        return tempArray;
    }

    //method to print out int array
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }     
        }
        System.out.print("]\n");
    }
}