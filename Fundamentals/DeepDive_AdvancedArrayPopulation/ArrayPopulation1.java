public class ArrayPopulation1 {
    public static void main(String[] args) {
        // Declarations
        Integer[] array = new Integer[10];
        Boolean[] booleanArray = new Boolean[10];
        Byte[] byteArray = new Byte[10];
        Character[] charArray = new Character[10];
        Short[] shortArray = new Short[10];
        Long[] longArray = new Long[10];
        Float[] floatArray = new Float[10];
        Double[] doubleArray = new Double[10];
        String[] stringArray = new String[10];

        // Printing arrays
        printArray("boolean array: ", convertToIntegerArray(booleanArray));
        printArray("byte array: ", convertToIntegerArray(byteArray));
        printArray("char array: ", convertToIntegerArray(charArray));
        printArray("short array: ", convertToIntegerArray(shortArray));
        printArray("long array: ", convertToIntegerArray(longArray));
        printArray("float array: ", convertToIntegerArray(floatArray));
        printArray("double array: ", convertToIntegerArray(doubleArray));
        printArray("string array: ", convertToIntegerArray(stringArray));
    }
    private static int[] convertToIntegerArray(Object[] myArray) {
        int[] tempArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] instanceof Number) {
                tempArray[i] = ((Number) myArray[i]).intValue();
            } else if (myArray[i] instanceof Boolean) {
                tempArray[i] = ((Boolean) myArray[i]) ? 1 : 0;
            } else if (myArray[i] instanceof Character) {
                tempArray[i] = (int) ((Character) myArray[i]);
            } else {
                tempArray[i] = (myArray[i] != null) ? 1 : 0;
            }
        }
        return tempArray;
    }

    //pretty print int array
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
