public class PushPullTest {
	public static void main(String[] args) {
		
		PushPull pushPull = new PushPull();
		
		Push var1 = null;
		Pull var2 = null;
		
		//---Replace
		var2 = (Pull) var1;
		var1 = pushPull;
		var2 = pushPull;
    }
}
