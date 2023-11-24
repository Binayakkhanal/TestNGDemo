package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	
	
	@AfterTest
	public void demo() {
		
		System.out.println("I will execute last");
		
	}
	
	@AfterSuite
	public void Afsuite() {
		
		System.out.println("I am last one");
		
	}

	@Parameters({"URL", "APIkey"})
	@Test
	public void SecondTest(@Optional("QA.com") String urlname, @Optional("12345") String key) {
		
		System.out.println("Connect");
		System.out.println(urlname);
		System.out.println(key);
		
	}
}