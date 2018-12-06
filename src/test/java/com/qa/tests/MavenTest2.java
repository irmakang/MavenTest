package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest2 {

	@Test
	public void sum() {
		System.out.println("SUM2");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30,a+b);
	}

	@Test
	public void sub() {
		System.out.println("SUB2");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10,b-a);
	}
}
