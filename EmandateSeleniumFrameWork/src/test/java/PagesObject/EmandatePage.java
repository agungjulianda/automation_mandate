package PagesObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmandatePage {
	
WebDriver driver = null;
	
	By create_button = By.xpath("//button[contains(text(),'Buat e-Mandate Baru')]");
	
			
	
	
	
	public EmandatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnCreateButton() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(create_button ));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		}catch(Exception exp) {
		exp.printStackTrace();
	}
	}
	
	
	

}