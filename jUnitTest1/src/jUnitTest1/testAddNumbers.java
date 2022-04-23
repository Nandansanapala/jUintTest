package jUnitTest1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	
	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		int result = jUnit.addnumbers(100, 200);
		assertEquals(300,result);
	}

}