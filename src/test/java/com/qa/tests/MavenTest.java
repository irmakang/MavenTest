package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest {

	@Test
	public void sum() {
		System.out.println("SUM - 1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30,a+b);
	}

	@Test
	public void sub() {
		System.out.println("SUB - 1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10,b-a);
	}
}
