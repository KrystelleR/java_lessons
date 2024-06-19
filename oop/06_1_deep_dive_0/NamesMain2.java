public class NamesMain2{
	public static void main(String[] args) {
		NameGetter2 name2 = new NameGetter2();
		SurnameGetter2 surname2 = new SurnameGetter2();
		AgeGetter2 age2 = new AgeGetter2();

		String name = name2.getName();
		String surname = surname2.getSurname();
		int age = age2.getAge();

		System.out.println("Hello " + name + " " + surname);
		System.out.println("you are " + age + " years old");
	}
}