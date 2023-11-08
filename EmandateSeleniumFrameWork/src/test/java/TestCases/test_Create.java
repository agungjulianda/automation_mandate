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

import PagesObject.AckPage;
import PagesObject.ConfirmPage;
import PagesObject.CreateMandatePage;
import PagesObject.EmandatePage;
import PagesObject.HomePage;
import PagesObject.LoginPage;

public class test_Create {
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
		EmandatePage emandatePageObj = new EmandatePage (driver);
		CreateMandatePage CreatePageObj = new CreateMandatePage (driver);
		ConfirmPage confirmPageObj = new ConfirmPage (driver);
		AckPage ackPageObj = new AckPage (driver);
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
		emandatePageObj.clickOnCreateButton();
		TimeUnit.SECONDS.sleep(5);
		CreatePageObj.setMechantId("PERSONAL01");
		CreatePageObj.setMerchantName("PERSONAL SHAREHOLDER ONLY");
		CreatePageObj.setMerchantAcountName("PERSONAL SHAREHOLDER ONLY");
		CreatePageObj.clickAccountTypeDD();
		TimeUnit.SECONDS.sleep(5);
		//emandatePageObj.clickAccountTypeSelect();
		//TimeUnit.SECONDS.sleep(2);
		CreatePageObj.setAccountMerchant("771558816911");
		CreatePageObj.setAgentId("BBLUIDJA");
		CreatePageObj.clickMerchTypeDD();
		TimeUnit.SECONDS.sleep(5);
		//emandatePageObj.clickMerchTypeSelect();
		//TimeUnit.SECONDS.sleep(2);
		CreatePageObj.clickAmmountTypeDD();
		TimeUnit.SECONDS.sleep(5);
		//emandatePageObj.clickAmmountTypeSelect();
		CreatePageObj.setAmmount("1000000");
		CreatePageObj.setReason("Automation Testing");
		TimeUnit.SECONDS.sleep(5);
		CreatePageObj.clickNextButton();
		TimeUnit.SECONDS.sleep(5);
		confirmPageObj.setOTP("12341234");
		TimeUnit.SECONDS.sleep(2);
		confirmPageObj.clickSendButton();
		TimeUnit.SECONDS.sleep(5);
		
		if (ackPageObj.check_result() == true) {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File(".//test-output/result_evidences/test01_pass.jpg"));
		Assert.assertTrue(true);
		}else {
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File(".//test-output/result_evidences/test01_fail.jpg"));
			Assert.assertTrue(false);
		}
		}catch(Exception exp) {
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
