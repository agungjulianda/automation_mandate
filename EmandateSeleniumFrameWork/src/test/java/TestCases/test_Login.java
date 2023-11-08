
package TestCases;




import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import PagesObject.HomePage;
import PagesObject.LoginPage;

public class test_Login {
	private static WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
	}
	
	
	@Test
	public static void test_login() throws IOException {
		
		try {
		LoginPage loginPageObj = new LoginPage(driver);
		HomePage homePageObj = new HomePage (driver);
		driver.get("https://omni-pt.dbank.co.id/#/login/");
		driver.manage().window().maximize();
		loginPageObj.setUsername("EMANDATE006");
		loginPageObj.setPassword("Reskin01");
		loginPageObj.clickBtnLogin();
		TimeUnit.SECONDS.sleep(5);
		homePageObj.clickOnTransaction();
		TimeUnit.SECONDS.sleep(5);
		homePageObj.clickOnEmadnate();
		TimeUnit.SECONDS.sleep(10);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File(".//test-output/result_evidences/test01_pass.jpg"));
		Assert.assertTrue(true);
		}catch(Exception exp) {
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);;
			Files.copy(f, new File(".//test-output/result_evidences/test01_fail.jpg"));
			exp.printStackTrace();
		}
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completedd");
	}
	
	
}
