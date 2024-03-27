import org.junit.*;
import static org.junit.Assert.*;

public class DividerTest{
	Divider divider = new Divider();
	String message = "Don’t do that";

	@Test
	public void testDivideByZero() {
		double resultDiv = divider.divideByZero(8);
        assertEquals("Divide by zero gives infinity as result", true, Double.isInfinite(resultDiv));
		//assertThrows(ArithmeticException.class, () -> divider.divideByZero(8)); 
		// Expecting ArithmeticException, this is for when you didvide by anything BUT a double or float 
		//(java allows for floating point values to eb divided by 0)
	}

	@Test
	public void testDivideByNegative(){
		assertEquals(-2.0, divider.divideByNegative(8,4), 0);
	}

	@Test
	public void testDivideByPositive(){
		assertEquals(0.2, divider.divideByPositive(25,100), 0);
	}

}