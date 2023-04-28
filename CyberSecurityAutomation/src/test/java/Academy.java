import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Academy extends BaseDriver{
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
	@Test(priority = 1)
	public void test_academy() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement academy = driver.findElement(By.cssSelector(".menu-link[href='//main.techforing.com/academy/']"));
		WebElement professional = driver.findElement(By.cssSelector(".menu-list-lg [href='//main.techforing.com/academy/ccsp/']"));
		action.moveToElement(academy).perform();
		Thread.sleep(2000);
		professional.click();
		Thread.sleep(10000);	
		//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(90000);
		//download curriculum
		WebElement curriculum = driver.findElement(By.cssSelector("[href='/academy/download/']"));
		curriculum.click();
		Thread.sleep(20000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//read all
		WebElement read_all = driver.findElement(By.cssSelector(".px-5"));
		read_all.click();
		Thread.sleep(20000);
		//get out service
		WebElement get_our_service = driver.findElement(By.cssSelector(".fa-arrow-right"));
		//for scrolling
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", get_our_service);
		get_our_service.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//enroll now

		WebElement enroll_now = driver.findElement(By.cssSelector(".ccsp-cta-box > [href='//main.techforing.com/get_start/']"));
		enroll_now.click();
		Thread.sleep(20000);
		//req call back
		WebElement req_call = driver.findElement(By.cssSelector("#request-btn"));
		req_call.click();
		Thread.sleep(2000);
		//fill up
		WebElement phone = driver.findElement(By.cssSelector("[name='phone']"));
		phone.sendKeys("+8801706377316");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.cssSelector("#request-btn"));
		email.sendKeys("Zannat.techforing@gmail.com");
		Thread.sleep(2000);
		WebElement message = driver.findElement(By.cssSelector("#request-btn"));
		message.sendKeys("I can send message for your service");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.cssSelector("#request-btn"));
		submit.click();
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
		Thread.sleep(2000);
	//important resources
		WebElement faq_learn_more = driver.findElement(By.cssSelector("[href='/academy/academy_faq/']"));
		faq_learn_more.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement youtube_channel = driver.findElement(By.cssSelector(".ccspr-btn[href='https://www.youtube.com/channel/UCBP7xegSjtVXulfywJ2kPvQ']"));
		youtube_channel.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement security_mania = driver.findElement(By.cssSelector("[href='//main.techforing.com/resources/']"));
		security_mania.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//want to learn more about the course
		WebElement gmail = driver.findElement(By.cssSelector("[name='email']"));
		gmail.sendKeys("Zannat.techforing@gmail.com");
		WebElement subscribe_now = driver.findElement(By.cssSelector(".aca-input-btn"));
		subscribe_now.click();
		Thread.sleep(2000);
		}
}
