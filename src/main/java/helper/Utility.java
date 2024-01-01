package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class Utility {

	public static void clickElement(WebDriver driver, By locator) {
		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			try {
				System.out.println("Trying with action class click");
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(locator)).click().build().perform();
			} catch (Exception e1) {
				System.out.println("Trying with js click");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("argument[0].click()", driver.findElement(locator));
			}
		}
	}
	
//	public static WebElement highlightElement(WebDriver driver, WebElement element) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("argument[0].setAttribute('style', 'background: yellow; border:2px solid red;')", element);
//	
//		
//		
//	}
}
