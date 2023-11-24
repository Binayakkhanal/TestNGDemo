package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test3 {

	@BeforeClass
	public void Bfclass() {
		
		System.out.println("Before Test 3 class");
		
	}
	
	@AfterClass
	public void Afclass() {
		
		System.out.println("After Test 3 class");
		
	}
	
	@Test(enabled=false)	// Skipped
	public void ThirdPartylogin() {
		
		
		System.out.println("ThirdPartylogin");
		
	}
	
	@Test(dataProvider="getData")
	public void Waitlogin(String username, String password) {
		
		
		System.out.println("Waitlogin");
		System.out.println(username);
		System.out.println(password);
		
		
	}
	
	
	@Test(groups= {"Smoke"})
	public void Weblogin() {
		
		// Selenium
		System.out.println("Weblogin");
		
	}
	
	@BeforeSuite
	public void Bfsuite() {
		
		System.out.println("I am number one");
		
	}
	
	@Test(groups= {"Smoke"})
	public void Mobilelogin() {
		
		// Appium
		System.out.println("Mobilelogin");
		
	}
	
	@Test(dependsOnMethods={"Verifylogin","Islogin"})
	public void APIlogin() {
		
		// REST API Automation
		System.out.println("APIlogin");
		
	}
	
	@Test
	public void Islogin() {
		
		
		System.out.println("Islogin");
		
	}
	
	@Test
	public void Verifylogin() {
		
		
		System.out.println("Verifylogin");
		
	}
	
	@BeforeMethod
	public void Bfmethod() {
		
		System.out.println("I will execute before every test in Test 3");
		
	}
	
	@AfterMethod
	public void Afmethod() {
		
		System.out.println("I will execute after every test in Test 3");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
		
		
	}

}
