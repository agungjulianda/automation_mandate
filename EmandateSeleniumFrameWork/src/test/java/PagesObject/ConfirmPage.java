package PagesObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmPage {
WebDriver driver = null;
	
	By otp_box = By.xpath("//input[@id='otp']");
	By send_button = By.xpath("//button[contains(text(),'Kirim')]");
	
			
	
	
	
	public ConfirmPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setOTP(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(otp_box));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void clickSendButton() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(send_button));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		}catch(Exception exp) {
		exp.printStackTrace();
	}
	}

}
