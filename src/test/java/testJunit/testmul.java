package testJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testmul {

	@Test
	public void test() {
		testcalc test = new testcalc ();
		int result = test.mul(9,6);
		assertEquals(54, result);
	}

}
