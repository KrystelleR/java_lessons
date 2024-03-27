public class AssertTest2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;

        boolean conditionA = a > 0;
        assert conditionA : "A is expected to be greater than 0";

        boolean conditionB = b >10;
        assert conditionB : "B is expected to be greater than 10";
        //Place your code here
        System.out.println("Finished");
    }
}
