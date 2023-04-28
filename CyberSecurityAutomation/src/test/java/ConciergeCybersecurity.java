import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ConciergeCybersecurity extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
	@Test(priority = 1)
	public void concieregecybersecurity() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement personal_cybersecurity = driver.findElement(By.cssSelector(".menu-link[href='//main.techforing.com/mysecurity/']"));
		WebElement Concierge_Cybersecurity = driver.findElement(By.cssSelector(".menu-list-lg [href='//main.techforing.com/mysecurity/concierge_cybersecurity/']"));
		action.moveToElement(personal_cybersecurity).perform();
		Thread.sleep(2000);
		Concierge_Cybersecurity.click();
		Thread.sleep(10000);	
		//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(90000);
		//start a memebership
		WebElement memebership = driver.findElement(By.cssSelector(".igbr-btn"));
		memebership.click();
		Thread.sleep(10000);
		//request a call back
		WebElement req_call = driver.findElement(By.cssSelector("#request-btn"));
		req_call.click();
		Thread.sleep(20000);
		WebElement phone = driver.findElement(By.cssSelector("[name='phone']"));
	phone.sendKeys("0170637716");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.cssSelector("[name='email']"));
		email.sendKeys("oyshetasniim123@gmail.com");
		Thread.sleep(2000);
		WebElement messages = driver.findElement(By.cssSelector("textarea"));
		messages.sendKeys("We are ok with your services");
		Thread.sleep(20000);
		WebElement submit_btn = driver.findElement(By.cssSelector("[method='post']"));
		submit_btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//virtual meeting
		WebElement virtual_meeting = driver.findElement(By.cssSelector("#virtual-btn"));
		virtual_meeting.click();
		Thread.sleep(20000);
		
		// all stories
		WebElement all_stories = driver.findElement(By.cssSelector(".cc-btn"));
		all_stories.click();
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//a lot of services
		
		WebElement talk_to_experts = driver.findElement(By.cssSelector(".ptc-box > .bg-g"));
		talk_to_experts.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
//important case studies
		WebElement book_us = driver.findElement(By.cssSelector(".ccsp-cta-box > [href='//main.techforing.com/get_start/']"));
		book_us.click();
		Thread.sleep(20000);
		//req call back
		WebElement req_call1 = driver.findElement(By.cssSelector("#request-btn"));
		req_call1.click();
		Thread.sleep(2000);
		//fill up
		WebElement credit_card = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/top-10-ways-of-credit-card-hacking/']"));
		credit_card.click();
		Thread.sleep(2000);
		WebElement prevent_trojan = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/what-is-trojan-horse-virus/']"));
		prevent_trojan.click();
		Thread.sleep(2000);
		WebElement social_hack = driver.findElement(By.cssSelector("//a[@href='https://main.techforing.com/resources/articles/how-hackers-are-using-social-engineering/']"));
		social_hack.click();
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
		submit.click();
		Thread.sleep(2000);
		}

}
