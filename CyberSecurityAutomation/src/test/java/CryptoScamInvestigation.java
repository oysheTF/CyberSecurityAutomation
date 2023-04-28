import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CryptoScamInvestigation extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
@Test(priority = 1)
public void test_CryptoScamInvestigation() throws InterruptedException{
	Actions action = new Actions(driver);
	WebElement personal_cybersecurity = driver.findElement(By.cssSelector(".menu-link-lg"));
	WebElement cryptoscam = driver.findElement(By.cssSelector("[href='//main.techforing.com/mysecurity/crypto_scam_investigation/']"));
	action.moveToElement(personal_cybersecurity).perform();
	Thread.sleep(2000);
	cryptoscam.click();
	Thread.sleep(10000);
	
	//for window handling
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(90000);
	//recover last crypto
	WebElement recover_last_crypto = driver.findElement(By.cssSelector(".igbr-btn"));
	recover_last_crypto.click();
	Thread.sleep(1000);
	//get started
	WebElement request_call = driver.findElement(By.cssSelector("#request-btn"));
	request_call.click();
	Thread.sleep(1000);
	WebElement phone = driver.findElement(By.cssSelector("[name='phone']"));
	phone.sendKeys("01706377316");
	Thread.sleep(1000);
	WebElement email = driver.findElement(By.cssSelector("[name='email']"));
	email.sendKeys("zannat.techforing@gmail.com");
	Thread.sleep(1000);
	WebElement message = driver.findElement(By.cssSelector("textarea"));
	message.sendKeys("We are hapy to get your services");
	Thread.sleep(1000);
	WebElement submit_btn = driver.findElement(By.cssSelector("[type='submit']"));
	submit_btn.click();
	Thread.sleep(1000);
	
	driver.navigate().back();
	Thread.sleep(2000);
    driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	//download now
	WebElement download_now = driver.findElement(By.cssSelector(".con-btn"));
	download_now.click();
	Thread.sleep(20000);
	//claim your copy right now
	WebElement name = driver.findElement(By.cssSelector("[name='first_name']"));
	name.sendKeys("Zannatunnesha");
	Thread.sleep(20000);
	WebElement email1 = driver.findElement(By.cssSelector("[name='email']"));
	email1.sendKeys("zannat.techforing@gmail.com");
	Thread.sleep(20000);
	WebElement downloadbtn = driver.findElement(By.cssSelector(".kartra_optin_submit_btn"));
	download_now.click();
	Thread.sleep(20000);
	
	driver.navigate().back();
	Thread.sleep(2000);
    driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	//talk to expert
	WebElement talk_expert = driver.findElement(By.cssSelector(".ptc-box > .bg-g"));
	talk_expert.click();
	Thread.sleep(20000);
	driver.navigate().back();
	Thread.sleep(2000);
    driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	//important resources
	WebElement read_more = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/case_studies/online-dating-scam-love-trap/']"));
	read_more.click();
	Thread.sleep(20000);
	
	
    driver.navigate().back();
	Thread.sleep(2000);
    driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	WebElement read_more1 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/cybersecurity-tips-for-work-from-home/']"));
	read_more1.click();
	Thread.sleep(20000);
	driver.navigate().back();
	Thread.sleep(2000);
    driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	WebElement read_more2 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/how-to-design-a-secure-office-network/']"));
	read_more2.click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
    driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
		}

}
