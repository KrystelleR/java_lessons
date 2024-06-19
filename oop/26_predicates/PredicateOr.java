import java.util.function.Predicate;

public class PredicateOr{
	public static void main(String[] args) {
        // Define two predicates
        Predicate<Integer> divisibleByThree = num -> num % 3 == 0;
        Predicate<Integer> divisibleByFive = num -> num % 5 == 0;

        // Combine the predicates using the or method
        Predicate<Integer> divisibleByThreeOrFive = divisibleByThree.or(divisibleByFive);

        // Test the combined predicate
        System.out.println("Is 8 divisible by 3 or 5? " + divisibleByThreeOrFive.test(8));
        System.out.println("Is 9 divisible by 3 or 5? " + divisibleByThreeOrFive.test(9));
        System.out.println("Is 10 divisible by 3 or 5? " + divisibleByThreeOrFive.test(10));
        System.out.println("Is 15 divisible by 3 or 5? " + divisibleByThreeOrFive.test(15));
    }
}