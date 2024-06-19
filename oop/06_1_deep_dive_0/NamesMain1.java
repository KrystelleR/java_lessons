public class NamesMain1{
	public static void main(String[] args) {
		String name = NameGetter1.getName();
		String surname = SurnameGetter1.getSurname();
		int age = AgeGetter1.getAge();

		System.out.println("Hello " + name + " " + surname);
		System.out.println("you are " + age + " years old");
	}
}