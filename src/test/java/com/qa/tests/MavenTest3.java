package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest3 {

	@Test
	public void sum() {
		System.out.println("SUM3");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30,a+b);
	}

	@Test
	public void sub() {
		System.out.println("SUB3");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10,b-a);
	}
}
