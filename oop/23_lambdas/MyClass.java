public class MyClass  {
   public static void main (String[] args) {
         MyInterface myInterface = () -> {
         System.out.println("My first lambda");
         return 22.7;
      };

      System.out.println(myInterface.myMethod());
   }
}