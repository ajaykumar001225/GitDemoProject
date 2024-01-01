package browserFactory;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	/*
	 * method will accept browser , url, return WebDriver driver
	 */
	
	public static WebDriver startBrowser(String browserName, String applicationURL)
	{
		WebDriver driver = null;
		if(browserName.contains("Chrome") || browserName.contains("GC") || browserName.contains("Google Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserName.contains("Firefox") || browserName.contains("FF") || browserName.contains("Mozila Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.contains("Edge"))
		{
			driver = new EdgeDriver();
		}
		else 
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		// default timeout for pageLoad = 5 min
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// default timeout for script = 30 sec
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		driver.get(applicationURL);
		// default timeout for implicit wait = 0 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}
}
