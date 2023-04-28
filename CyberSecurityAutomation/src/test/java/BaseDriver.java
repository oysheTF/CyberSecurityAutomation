import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	WebDriver driver;
	static String baseurl = "https://main.techforing.com";

	@BeforeSuite
	public void start() {
		String browser = System.getProperty("browser", "chrome");
		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(baseurl);
		} else if (browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	public class Login {
		@Test(priority = 0)
		public void openUrl() {
			driver.get(baseurl);
			try {
				Thread.sleep(30000);
			} catch (Exception e) {
			}
		}

		@AfterSuite
		public void end() {
			driver.quit();
		}

	}

}
