package test;


import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener interface which implements Testing listener

public class listeners implements ITestListener {
	
	public void onTestSucess(ITestResult result) {
		
		System.out.println("Test is Sucess");
		
	}

}
