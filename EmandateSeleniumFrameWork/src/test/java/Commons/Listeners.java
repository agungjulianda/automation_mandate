package Commons;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class Listeners implements ITestListener{
	
	public void onTestStart (ITestResult result){
		
		System.out.println("Test case is starting");
		Reporter.log("Method name is - " + result.getName());
		}
	
	public void onTestSuccess (ITestResult result){
		
		Reporter.log("Method name is - " + result.getStatus());
		
	}
	
	public void onTestFailure (ITestResult result){
		Reporter.log("Method name is - " + result.getStatus());
		
		
	}
	
}
