package jUnit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assumptions;

public class TEST {

	@Test
	public void test1() 
	{
		jUnitTest jt=new jUnitTest();
		assertEquals(4,jt.addOne(2));
		//Assumptions.assumeTrue("Batman".equals(jt.name));
		Assumptions.assumeTrue("Superman".equals(jt.name));
	}
	
	@Test
	@DisplayName("測試二")
	public void test2() 
	{
		jUnitTest jt=new jUnitTest();
		assertEquals(49,jt.addOne(7));
	}
	
	@BeforeAll
	public static void BA() 
	{
		jUnitTest jt=new jUnitTest();
		assertTrue(jt.beforeAll());
		//assertTrue(false);
	}
}
