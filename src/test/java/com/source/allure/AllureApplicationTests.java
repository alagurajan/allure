package com.source.allure;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Epic("GCP MP E2E API Automation")
@SpringBootTest
public class AllureApplicationTests {

	@Feature("GCP MP Validation")
	@Story("Main Testing")
	@org.testng.annotations.Test(testName = "Main Testing Method", description = "This is the test against one thing")
	public void Testing() {

	}
	@Feature("Install & Configuration")
	@Story("Preparing")
	@org.testng.annotations.Test(priority = 0, description = "Set up environment")
	@BeforeClass
	public void setup(){
		Assert.assertEquals(2, 2);
	}


	@Feature("Install & Configuration")
	@Story("Installation")
	@org.testng.annotations.Test(priority = 1, description = "Installation test")
	public void Checking1(){
		System.out.println("This is our test scenario 1");
		Assert.assertEquals(2, 2);
	}


	@Feature("Install & Configuration")
	@Story("Configuration")
	@org.testng.annotations.Test(priority = 2, description = "Configuration test")
	public void Checking2(){
		System.out.println("This is our test scenario 2");
		Assert.assertEquals(2, 2);
	}


	@Feature("Check Adapter Status")
	@Story("Adapter status")
	@org.testng.annotations.Test(priority = 3, description = "Adapter Check test")
	public void Checking3(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Object Validation")
	@Story("Adapter Instance")
	@org.testng.annotations.Test(priority = 4, description = "Validate Adapter Instance Test")
	public void Checking4(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Object Validation")
	@Story("Adapter Services")
	@org.testng.annotations.Test(priority = 5)
	public void Checking5(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Object Validation")
	@Story("Service Objects")
	@org.testng.annotations.Test(priority = 6)
	public void Checking6(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Remove the Adapter")
	@Story("Remove the Credential")
	@org.testng.annotations.Test(priority = 7)
	public void Checking7(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}

	@Feature("Remove the Adapter")
	@Story("Remove the Adapter")
	@Test(priority = 8)
	public void Checking8(){
		System.out.println("This is our test scenario 3");
		Assert.assertEquals(2, 2);
	}
}
