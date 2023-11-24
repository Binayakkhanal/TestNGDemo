package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {

	@Test(groups= {"Smoke"})
	public void hello() {
		
		System.out.println("Hello Test 2");
	}
	
	@BeforeTest
	public void prequiste() {
		
		System.out.println("I will execute first");
	}

}
