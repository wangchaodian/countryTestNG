package com.qa.config;

import org.testng.annotations.Test;

public class TestNG_Demo1 {

	@Test(timeOut = 3000)
	public void test1() {
		try {
			Thread.sleep(2500);
			System.out.println("Hello");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Test(enabled = false)   //enabled = false --- 不执行
	public void test2() {
		System.out.println("TestNG2");
	}
	
	@Test(priority = 3)
	public void test3() {
		System.out.println("TestNG3");
	}
	
	@Test      // --- 不填写则是（priority = 0 --- 数字越小越先执行）
	public void test4() {
		System.out.println("TestNG4");
	}
	
	@Test(priority = 2)
	public void test5() {
		System.out.println("TestNG5");
	}

}
