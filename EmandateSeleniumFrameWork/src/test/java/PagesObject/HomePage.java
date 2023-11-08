package PagesObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver = null;
	
	By transaction_button = By.xpath("//li[contains(text(),'Transaksi')]");
	By emandate_button = By.xpath("//body/div[@id='holder']/landing[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[8]/div[1]/div[1]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnTransaction() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(transaction_button));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		}catch(Exception exp) {
		exp.printStackTrace();
	}
	}
	
	public void clickOnEmadnate() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(emandate_button));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		}catch(Exception exp) {
		exp.printStackTrace();
	}
	}

}
