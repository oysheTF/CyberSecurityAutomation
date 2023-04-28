import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OnBoarding extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
	
	@Test(priority = 1)
	public void test_onBoarding() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement personal_cybersecurity = driver.findElement(By.cssSelector(".menu-link[href='//main.techforing.com/mysecurity/']"));
		WebElement onBoarding = driver.findElement(By.cssSelector(".menu-list-lg [href='//main.techforing.com/mysecurity/on_board/']"));
		action.moveToElement(personal_cybersecurity).perform();
		Thread.sleep(2000);
		onBoarding.click();
		Thread.sleep(10000);	
		//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(9000);	
	//report, penetration and test cases
		WebElement download_book = driver.findElement(By.cssSelector(".psr-btn"));
		download_book.click();
		
		WebElement first_name = driver.findElement(By.cssSelector("[name='first_name']"));
		first_name.sendKeys("Zannatunnesha");
		WebElement email = driver.findElement(By.cssSelector(".psr-btn"));
		email.sendKeys("Zannat.techforing@gmail.com");
		WebElement submit_btn = driver.findElement(By.cssSelector(".kartra_optin_submit_btn"));
		submit_btn.click();
		//for scrolling
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", download_book);
				download_book.click();
				Thread.sleep(2000);
	//connect with us
WebElement connect_us = driver.findElement(By.cssSelector(".og-link > [href='//main.techforing.com/findus/']"));			
connect_us.click();
Thread.sleep(2000);
//want to get in touch
WebElement phone = driver.findElement(By.cssSelector("[name='phone']"));			
phone.sendKeys("01706377316");
Thread.sleep(2000);
WebElement email1 = driver.findElement(By.cssSelector("[name='email']"));			
email.sendKeys("zannnat.techforing@gmail.com");
Thread.sleep(2000);
WebElement messgae = driver.findElement(By.cssSelector("textarea"));			
messgae.sendKeys("We are satisfied with toour services");
Thread.sleep(2000);
WebElement submit_btn1 = driver.findElement(By.cssSelector("[type='submit']"));			
submit_btn.click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
//get started
WebElement get_start = driver.findElement(By.cssSelector(".o-protection [href='//main.techforing.com/get_start/']"));			
get_start.click();
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
//let us secure
WebElement let_secure = driver.findElement(By.cssSelector(".o-cta [href='//main.techforing.com/get_start/']"));			
let_secure.click();
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);

}}
