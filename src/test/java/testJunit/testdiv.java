package testJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testdiv {

	@Test
	public void test() {
		testcalc test = new testcalc ();
		int result = test.div(9,3);
		assertEquals(3, result);
	}

}
