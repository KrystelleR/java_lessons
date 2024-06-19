import java.util.function.Supplier;
import java.util.function.IntSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Function;


public class MyClass{
	public static void main(String[] args) {
		Supplier <String> stringSupplier  = () -> "I am a supplier";
		System.out.println(stringSupplier .get());

		Supplier <Integer> integerSupplier  = () -> 100;
		System.out.println(integerSupplier.get());

		IntSupplier inPrimitiveSupplier = () -> 47;
		System.out.println(inPrimitiveSupplier.getAsInt());

		Consumer<String> stringConsumer = (myString) -> System.out.println(myString);
        stringConsumer.accept("I am a consumer");

        Consumer <Integer> integerConsumer  = (myInt) -> System.out.println(myInt);
        integerConsumer.accept(35);

        IntConsumer intPrimitiveConsumer = (myInt) -> System.out.println(myInt);
        intPrimitiveConsumer.accept(94);

        Predicate<String> stringColorTester = (myString) -> myString.equals("Blue");
        System.out.println(stringColorTester.test("Brown"));

        Function<String, Integer> lengthFinderFunction = (str) -> str.length();
        System.out.println(lengthFinderFunction.apply("FunctionLength"));

	}
}