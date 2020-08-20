package com.qa.demo;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult iTestResult) {
		
		System.out.println("用例启动"+ iTestResult.toString());
		
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("用例执行成功"+iTestResult.toString());
		
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("用例运行失败，启动截图");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}

	@Override
	public void onStart(ITestContext context) {

		
	}

	@Override
	public void onFinish(ITestContext context) {

		
	}
	  @Test
	    public void listenerExampletest() {
	 
	        Assert.assertTrue(11==10);
	    }

	

}
