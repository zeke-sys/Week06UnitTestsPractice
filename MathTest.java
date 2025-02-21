package week06UnitTestsPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import week06UnitTestsPractice.Math; //Can't import because MathTest is in the same package of the Math class.

class MathTest {
	
	Math math = new Math();

	@Test
	void testMultiplyReturnsCorrectValues() { //multiply test
		int product = math.multiply(2, 5);
		assertEquals(10, product);
	}
	
	@Test
	void testDivideReturnsCorrectValues() { //divide test
		double quotient = math.divide(5, 2);
		assertEquals(2, quotient);
	}
	
	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() { //true test
		int a = 5;
		assertTrue(math.isPositiveNumber(a));
	}
	
	@Test
	 void testDivideThrowsExceptionWhenDividingbyZero() { //Exception test
		assertThrows(ArithmeticException.class, () -> math.divide(5, 0)); //using lambda () ->
	}
	
	
	


}
