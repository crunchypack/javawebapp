package webapp;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	static Calculator calc;

	@Test
	public void testAddition() {
		double expected = 10;
		double actual = calc.addition(5, 5);
		assertEquals(expected, actual,0.001);
		
		
	}
	@BeforeClass
	public static void startUp() {
		calc = new Calculator();
	}

}
