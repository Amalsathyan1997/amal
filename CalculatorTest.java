package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	public CalculatorTest(String name) {
		super(name);
	}
	public void testFactorial() {
		Calculator m1=new Calculator();
		assertEquals(120,m1.factorial(5));
	}


	
}
