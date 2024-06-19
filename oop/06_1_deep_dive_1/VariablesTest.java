public class VariablesTest implements Variables{
	private static int i = 5, j = 7;
	private int x = 6, y=8;
	private final static int var2 = 10;
	private final static String var3 = "10";
	private final static int var1 =0;
	private int var4, var5;
	private static int var6, var7;

	public static void main(String[] args) {
		VariablesTest test1 = new VariablesTest();
		test1.doIt();

		VariablesTest test2 = new VariablesTest();
		test2.converter(var3);

		VariablesTest construct1 = new VariablesTest(j, var6, var7);
	}

	public void converter(String input){
		int number = Integer.parseInt(input);
		System.out.println("Converted String: " +number);
	}

	public void doIt(){
		int a = 2;
		System.out.println("Overloaded Method 2: " + this.doIt(this.x, this.y, a));
	}

	public int doIt(int i, int j, int x){
		int a =4, b=1;
		System.out.println("Overloaded Method 3: " + this.doIt(i, j, a, b));
		return (i + j - x) / a * var2;
	}

	public static int doIt(int i, int j, int x, int y){
		int a =3;
		return (i + j * x) / a * var2;
	}

	//static initializer
	static{
		var7 = 11;
	}

	//instance initializer
	{
		var4 = 15;
		i++;
		j++;
		x++;
		y++;
		var4++;
		var5++;
		var6++;
		var7++;
	}

	//constructor
	public VariablesTest(){
		var5 =13;
		var6=9;
	}

	public VariablesTest(int i, int j){
		double result = (this.i + this.j - this.var6 + 4.0) + this.var7;
		System.out.println( "Result for 2 args constructor: " +result);
	}

	public VariablesTest(int a, int b, int c){
		this(a, b);
		double result = (a - b + var6 + c) - var7;
		System.out.println("Result for 3 args constructor: " +result);
	}
}