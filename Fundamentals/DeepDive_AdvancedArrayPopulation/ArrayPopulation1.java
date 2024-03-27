public class ArrayPopulation1 {
public static void main(String[]args){
        int[] array = new int[10];
        boolean[] booleanArray = new boolean[10];
        byte[] byteArray = new byte[10];
        char[] charArray = new char[10];
        short[] shortArray = new short[10];
        long[] longArray = new long[10];
        float[] floatArray = new float[10];
        double[] doubleArray = new double[10];
        String[] stringArray = new String[10];
        
        printArray("array: ",array);
        
        int[] tempArray = new int[10];
        int i =0;
        for(boolean element : booleanArray){
            tempArray[i] = element ? 1 : 0;
            i++;
        }

        printArray("boolean array: ",tempArray);

        i =0;
        for(byte element : byteArray){
            tempArray[i] = (int)element;
            i++;
        }

        printArray("byte array: ",tempArray);

        i =0;
        for(char element : charArray){
            tempArray[i] = (int)element;
            i++;
        }

        printArray("char array: ",tempArray);

        i =0;
        for(short element : shortArray){
            tempArray[i] = (int)element;
            i++;
        }
        printArray("short array: ",tempArray);

        i =0;
        for(long element : longArray){
            tempArray[i] = (int)element;
            i++;
        }
        printArray("long array: ",tempArray);

        i =0;
        for(float element : floatArray){
            tempArray[i] = (int)element;
            i++;
        }
        printArray("float array: ",tempArray);

        i =0;
        for(double element : doubleArray){
            tempArray[i] = (int)element;
            i++;
        }
        printArray("double array: ",tempArray);

        i =0;
        for(String element : stringArray){
            tempArray[i] = element==null?0:1;
            i++;
        }
        printArray("string array: ",tempArray);

    }
    
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

