package com.qa.config;

//import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependenceDemo {
	
	@Test(groups = {"tomcat"})
	public void restatTomcatService(){
		System.out.println("Restart the tomcat server when it is down!");
	}
	
	@Test(groups = {"tomcat"})
	public void tomcatServiceIsDown(){
		System.out.println("tomcat service is down");	
	}
	
	
	@Test(groups = {"app"})
	public void startAppService(){
		System.out.println("Start App Service");
	}
	
	@Test(groups = {"app"})
	public void shutDownApp(){
		System.out.println("Shutdown App Service");
	}
	
	// alwaysRun = true --- 软依赖,最后都会执行
//	@Test(dependsOnGroups = {"tomcat"},alwaysRun = true)
//	public void startAppService(){
//		System.out.println("Start App Service");
//	}
	

}
