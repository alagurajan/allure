package com.source.allure;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Epic("GCP MP E2E API Automation")
// @SpringBootTest
public class AllureApplicationTests {

	@Feature("GCP MP Validation")
	@Story("Main Testing")
	@Test(testName = "Main Testing Method", description = "This is the test against one thing")
	public void Testing() {
	 	Checking1();
		Checking2();
		Checking3();
		Checking4();
		Checking5();
		Checking6();
		Checking7();
		Checking8();
	}
	@Feature("Install & Configuration")
	@Story("Preparing")
	//@Test(priority = 0, description = "Set up environment")
	@BeforeClass
	public void setup(){
		Assert.assertEquals(2, 2);
	}


	@Feature("Install & Configuration")
	@Story("Installation")
	//@Test(priority = 1, description = "Installation test")
	public void Checking1(){
		System.out.println("This is our test scenario 1");
		Assert.assertEquals(2, 2);
	}


	@Feature("Install & Configuration")
	@Story("Configuration")
	//@Test(priority = 2, description = "Configuration test")
	public void Checking2(){
		System.out.println("This is our test scenario 2");
		Assert.assertEquals(2, 2);
	}


	@Feature("Check Adapter Status")
	@Story("Adapter status")
	//@Test(priority = 3, description = "Adapter Check test")
	public void Checking3(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Object Validation")
	@Story("Adapter Instance")
	//@Test(priority = 4, description = "Validate Adapter Instance Test")
	public void Checking4(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Object Validation")
	@Story("Adapter Services")
	//@Test(priority = 5, description = "Validate Adapter Services Test")
	public void Checking5(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Object Validation")
	@Story("Service Objects")
	//@Test(priority = 6, description = "Validate Adapter Service Object Test")
	public void Checking6(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Remove the Adapter")
	@Story("Remove the Credential")
	//@Test(priority = 7, description = "Validate Remove Credentail Test")
	public void Checking7(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Remove the Adapter")
	@Story("Remove the Adapter")
	//@Test(priority = 8, description = "Validate Remove Adapter Test")
	public void Checking8(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}
}
