public class EnumTest {
	public static void main(String[] args) {
		PrimaryColours pc1 = PrimaryColours.BLUE;
		PrimaryColours pc2 = PrimaryColours.RED;
		 
		boolean res1 = pc1.equals(pc2);
		 
		System.out.println(pc1+" equals "+pc2+" is "+res1);
 
	}
 
}
