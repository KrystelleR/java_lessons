public class ArrayPopulation5 {
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

        //populating arrays
        populateArray(booleanArray);
        populateArray(byteArray);
        populateArray(charArray);
        populateArray(shortArray);
        populateArray(longArray);
        populateArray(floatArray);
        populateArray(doubleArray);
        populateArray(stringArray);
        
        //printing padded arrays
        printArray("array: ",array);
        printArray("boolean array: ",booleanArray);
        printArray("byte array: ",byteArray);
        printArray("char array: ",charArray);
        printArray("short array: ",shortArray);
        printArray("long array: ",longArray);
        printArray("float array: ",floatArray);
        printArray("double array: ",doubleArray);
        printArray("string array: ",stringArray);

    }

    //methods to populate arrays
    public static void populateArray(boolean[] myArray){
    	for(int i = 0; i <5; i++){
    		myArray[i] = false;
    	}
        for(int i = 5; i <myArray.length; i++){
            myArray[i] = true;
        }
    }

    public static void populateArray(byte[] myArray){
    	for(int i = 0; i <5; i++){
    		myArray[i] = 0;
    	}
        for(int i =5; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(char[] myArray){
    	for(int i = 0; i <5; i++){
    		myArray[i] = '0';
    	}
        for(int i =5; i <myArray.length; i++){
            myArray[i] ='a';
        }
    }

    public static void populateArray(short[] myArray){
    	for(int i = 0; i <5; i++){
    		myArray[i] = 0;
    	}
        for(int i =5; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(long[] myArray){
    	for(int i = 0; i <5; i++){
    		myArray[i] = 0;
    	}
        for(int i =5; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(float[] myArray){
    	for(int i = 0; i <5; i++){
    		myArray[i] = 0;
    	}
        for(int i =5; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(double[] myArray){
    	for(int i = 0; i <5; i++){
    		myArray[i] = 0;
    	}
        for(int i =5; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(String[] myArray){
    	for(int i = 0; i <5; i++){
    		myArray[i] = "0";
    	}
        for(int i =5; i <myArray.length; i++){
            myArray[i] ="-1";
        }
    }


    //methods to print arrays
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

    public static void printArray(String prefix,boolean[] arrayToPrint){
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

        public static void printArray(String prefix,byte[] arrayToPrint){
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

        public static void printArray(String prefix,char[] arrayToPrint){
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

        public static void printArray(String prefix,short[] arrayToPrint){
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

    public static void printArray(String prefix,long[] arrayToPrint){
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

        public static void printArray(String prefix,float[] arrayToPrint){
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

        public static void printArray(String prefix,double[] arrayToPrint){
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

        public static void printArray(String prefix,String[] arrayToPrint){
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

