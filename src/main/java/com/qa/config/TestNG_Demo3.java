package com.qa.config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Demo3 {
	
	@Test(dependsOnMethods={"test2","test4"} ,alwaysRun = true)
	public void test1(){
		System.out.println("test1");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	@Test
	public void test3(){
		Assert.assertTrue(12==13);
		System.out.println("test3");
	}
	
	@Test(dependsOnMethods="test5",alwaysRun = true) // ---alwaysRun = true，遇到错误后也会执行
	public void test4(){
		System.out.println("test4");
	}
	
	@Test
	public void test5(){
		Assert.assertTrue(12==13);
		System.out.println("test5");
	}

}
