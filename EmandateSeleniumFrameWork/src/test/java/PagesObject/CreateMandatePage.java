package PagesObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateMandatePage {
	
WebDriver driver = null;
	
	By merchantid = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]");
	By merchatname = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/input[1]");
	By accountname = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[4]/input[1]");
	By accountno = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[6]/input[1]");
	By acctype = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[1]");
	By acctypeselect = By.xpath("//*[@id=\"holder\"]/e-mandate-create/div[1]/div/form/div[2]/div/div[5]/div[2]/div/div[1]/div/div/div/ul/li[6]/a/span[2]");
	By agentid = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[7]/input[1]");
	By merchtype = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[8]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]");
	By merchtypeselect = By.xpath("//*[@id=\"holder\"]/e-mandate-create/div[1]/div/form/div[2]/div/div[8]/div[2]/div/div[1]/div/div/div/ul/li[2]/a/span[2]");
	By amounttype = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[9]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]");
	By amounttypeselect = By.xpath("//*[@id=\"holder\"]/e-mandate-create/div[1]/div/form/div[2]/div/div[9]/div[2]/div/div[1]/div/div/div/ul/li[2]/a/span[2]");
	By amount = By.xpath("//input[@id='amount']");
	By reason = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[14]/input[1]");
	By next_button = By.xpath("//button[contains(text(),'Lanjut')]");
	
			
	
	
	
	public CreateMandatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void setMechantId(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(merchantid));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void setMerchantName(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(merchatname));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void setMerchantAcountName(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(accountname));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void setAccountMerchant(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(accountno));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void clickAccountTypeDD() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(acctype));
		element.click();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.RETURN)
		.perform();
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}

	
	public void clickAccountTypeSelect() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(acctypeselect));
		element.click();
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void setAgentId(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(agentid));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void clickMerchTypeDD() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(merchtype));
		element.click();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.RETURN)
		.perform();
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}

	
	public void clickMerchTypeSelect() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(merchtypeselect));
		element.click();
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void clickAmmountTypeDD() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(amounttype));
		element.click();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.RETURN)
		.perform();
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}

	
	public void clickAmmountTypeSelect() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(amounttypeselect));
		element.click();
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void setAmmount(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(amount));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void setReason(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(reason));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void clickNextButton() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(next_button));
		element.click();
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	

}