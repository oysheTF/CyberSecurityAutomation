import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PrivacyPolicy extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
	@Test(priority = 1)
	public void test_PrivacyPolicy() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement more = driver.findElement(By.cssSelector(".menu-list-lg [href='#']"));
		WebElement privacy_policy = driver.findElement(By.cssSelector(".menu-list-lg [href='//main.techforing.com/policy/']"));
		action.moveToElement(more).perform();
		Thread.sleep(2000);
		privacy_policy.click();
		Thread.sleep(10000);	
		//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(90000);
		}	}
