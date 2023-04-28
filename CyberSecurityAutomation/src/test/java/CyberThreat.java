import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CyberThreat extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
	@Test(priority = 1)
	public void concieregecybersecurity() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement business_cybersecurity = driver.findElement(By.cssSelector(".menu-link[href='//main.techforing.com/enterprise_cybersecurity/']"));
		WebElement cyber_threat = driver.findElement(By.cssSelector("[href='//main.techforing.com/cyber_threat_intelligence/'][comment]"));
		action.moveToElement(business_cybersecurity).perform();
		Thread.sleep(2000);
		cyber_threat.click();
		Thread.sleep(10000);	
		//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(90000);
		//stay ahead of cyberthreat 
		WebElement cyber_threat_btn = driver.findElement(By.cssSelector(".igbr-btn"));
		cyber_threat_btn.click();
		Thread.sleep(10000);
		//request a call back
		WebElement req_call = driver.findElement(By.cssSelector("#request-btn"));
		req_call.click();
		Thread.sleep(20000);
//		WebElement phone = driver.findElement(By.cssSelector("[name='phone']"));
//	phone.sendKeys("0170637716");
//		Thread.sleep(2000);
//		WebElement email = driver.findElement(By.cssSelector("[name='email']"));
//		email.sendKeys("oyshetasniim123@gmail.com");
//		Thread.sleep(2000);
//		WebElement messages = driver.findElement(By.cssSelector("textarea"));
//		messages.sendKeys("We are ok with your services");
//		Thread.sleep(20000);
//		WebElement submit_btn = driver.findElement(By.cssSelector("[method='post']"));
//		submit_btn.click();
//		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//virtual meeting
//		WebElement virtual_meeting = driver.findElement(By.cssSelector("#virtual-btn"));
//		virtual_meeting.click();
//		Thread.sleep(20000);
		//download book
		WebElement download_books = driver.findElement(By.cssSelector(".glide__slides > li:nth-of-type(2) .rs-btn"));
		download_books.click();
		Thread.sleep(20000);
		// all stories
		WebElement all_stories = driver.findElement(By.cssSelector("[href='/testimonial/']"));
		all_stories.click();
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//secure now
		WebElement secure_now = driver.findElement(By.cssSelector(".ptc-box > [href='//main.techforing.com/get_start/']"));
		secure_now.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
//important case studies
		WebElement link1 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/cyber-attacks-on-financial-services/']"));
		link1.click();
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//req call back
		WebElement link2 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/cybersecurity-tips-for-work-from-home/']"));
		link2.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//fill up
		WebElement link3 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/how-to-design-a-secure-office-network/']"));
		link3.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	
		
		}}
