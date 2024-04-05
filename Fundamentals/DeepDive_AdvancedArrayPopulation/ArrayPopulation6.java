public class ArrayPopulation6 {
    public static void main(String[]args){
        //declaraing source array
        int[] source = new int[10];

        //populate source with position+20 as index value
        for(int i = 0; i < source.length; i++){
            source[i] = i + 20;
 
        }

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
        
        //printing all arrays (before and after)
        printArray("source array: ",source);
        System.out.println("\n");

        printArray("boolean array before: ",booleanArray);
        copyArray (booleanArray, source);
        printArray("boolean array after: ",booleanArray);
        System.out.println("\n");

        printArray("byte array before: ",byteArray);
        copyArray (byteArray, source);
        printArray("byte array after: ",byteArray);
        System.out.println("\n");

        printArray("char array before: ",charArray);
        copyArray (charArray, source);
        printArray("char array after: ",charArray);
        System.out.println("\n");

        printArray("short array before: ",shortArray);
        copyArray (shortArray, source);
        printArray("short array after: ",shortArray);
        System.out.println("\n");

        printArray("long array before: ",longArray);
        copyArray (longArray, source);
        printArray("long array after: ",longArray);
        System.out.println("\n");

        printArray("float array before: ",floatArray);
        copyArray (floatArray, source);
        printArray("float array after: ",floatArray);
        System.out.println("\n");

        printArray("double array before: ",doubleArray);
        copyArray (doubleArray, source);
        printArray("double array after: ",doubleArray);
        System.out.println("\n");

        printArray("string array before: ",stringArray);
        copyArray (stringArray, source);
        printArray("string array after: ",stringArray);
        System.out.println("\n");

    }

    //methods to populate arrays
    public static void populateArray(boolean[] myArray){
        for(int i = 0; i <myArray.length; i++){
            myArray[i] = true;
        }
    }

    public static void populateArray(byte[] myArray){
        for(int i =0; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(char[] myArray){
        for(int i =0; i <myArray.length; i++){
            myArray[i] ='a';
        }
    }

    public static void populateArray(short[] myArray){
        for(int i =0; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(long[] myArray){
        for(int i =0; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(float[] myArray){
        for(int i =0; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(double[] myArray){
        for(int i =0; i <myArray.length; i++){
            myArray[i] =-1;
        }
    }

    public static void populateArray(String[] myArray){
        for(int i =0; i <myArray.length; i++){
            myArray[i] ="-1";
        }
    }

    //methods to copy first 3 values of source into destination array
    public static void copyArray(boolean[] destinationArray, int[] sourceArray){
        for(int i = 0; i<3; i++){
            destinationArray[i] = sourceArray[i]==1? true : false;
        }
    }

    public static void copyArray(byte[] destinationArray, int[] sourceArray){
        for(int i = 0; i<3; i++){
            destinationArray[i] = (byte)sourceArray[i];
        }
    }

    public static void copyArray(char[] destinationArray, int[] sourceArray){
        for(int i = 0; i<3; i++){
            destinationArray[i] = (char)sourceArray[i];
        }
    }

    public static void copyArray(short[] destinationArray, int[] sourceArray){
        for(int i = 0; i<3; i++){
            destinationArray[i] = (short)sourceArray[i];
        }
    }

    public static void copyArray(long[] destinationArray, int[] sourceArray){
        for(int i = 0; i<3; i++){
            destinationArray[i] = sourceArray[i];
        }
    }

    public static void copyArray(float[] destinationArray, int[] sourceArray){
        for(int i = 0; i<3; i++){
            destinationArray[i] = sourceArray[i];
        }
    }

    public static void copyArray(double[] destinationArray, int[] sourceArray){
        for(int i = 0; i<3; i++){
            destinationArray[i] = sourceArray[i];
        }
    }

    public static void copyArray(String[] destinationArray, int[] sourceArray){
        for(int i = 0; i<3; i++){
            destinationArray[i] = String.valueOf(sourceArray[i]);
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

