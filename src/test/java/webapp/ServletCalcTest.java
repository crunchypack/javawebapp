package webapp;


import static org.junit.Assert.assertEquals;


import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class ServletCalcTest {
	static Calculator calc;

	@Test
	public void testAddition() {
		double expected = 10;
		double actual = calc.addition(5, 5);
		assertEquals(expected, actual,0.001);
		
		
	}
	@Test 
	public void testSubstraction() {
		double expected = 10;
		double actual = calc.substraction(23, 13);
		assertEquals(expected, actual,0.001);
	}
	@Test
	public void testMemory() {
		double mem = 10;
		calc.setMemory(mem);
		double total = calc.addition(calc.getMemory(), 10);
		assertEquals(20,total,0.001);
	}

	@BeforeClass
	public static void startUp() {
		calc = new Calculator();
	}

}
