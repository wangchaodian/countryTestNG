package com.qa.config;

import com.sun.tracing.ProviderName;

import org.testng.annotations.*;

public class TestNG_Demo2 {

	@Test
	@Parameters({ "Browser", "Server" })
	public void test1(String browser, String server) {
		System.out.println("hello");

		 System.out.println("这次启动浏览器是： "+browser+" 测试服务器地址是： "+server);

	}
	
	//设置了执行次数数5次，5次执行总共耗时不能超过5100毫秒，否则抛出中断异常
	@Test(invocationCount = 5 ,invocationTimeOut = 5200)
	public void loginTest() throws InterruptedException{
		
		try {
			Thread.sleep(2000);
			System.out.println("login test");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
