package PagesObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AckPage {
WebDriver driver = null;
	

	By fail_mark = By.xpath("//*[contains(text(),'Transaksi Gagal')]");
	
			
	
	
	
	public AckPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean check_result() {
		boolean result;
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(fail_mark));
		result = false;
		}catch(Exception exp) {
			exp.printStackTrace();
			result = true;
		}
		return result;
	}
	
	

}
