import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AboutUs extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
	@Test(priority = 1)
	public void test_aboutus() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement more = driver.findElement(By.cssSelector(".menu-list-lg [href='#']"));
		WebElement about_us = driver.findElement(By.cssSelector(".menu-list-lg [href='//main.techforing.com/aboutus/']"));
		action.moveToElement(more).perform();
		Thread.sleep(2000);
		about_us.click();
		Thread.sleep(10000);	
		//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(9000);	
	//get protected
		WebElement get_protected = driver.findElement(By.cssSelector(".fa-arrow-right"));
		//for scrolling
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", get_protected);
				get_protected.click();
				Thread.sleep(2000);
	//breach prevention
WebElement get_protected1 = driver.findElement(By.cssSelector(".fa-arrow-right"));			
get_protected1.click();
Thread.sleep(3000);
}

}
