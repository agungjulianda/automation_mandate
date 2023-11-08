package PagesObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver = null;
	
	By textbox_username = By.id("username");
	By textbox_password = By.id("password");
	By textbox_error = By.id("error-message-box");
	By button_login = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[2]");
	
	

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(textbox_username));
		element.sendKeys(text);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void setPassword(String text) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(textbox_password));
		element.sendKeys(text);
		}catch(Exception exp) {
		exp.printStackTrace();
	}
	}
	
	public void clickBtnLogin() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(button_login));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		}catch(Exception exp) {
		exp.printStackTrace();
	}
	}
	

	
}
