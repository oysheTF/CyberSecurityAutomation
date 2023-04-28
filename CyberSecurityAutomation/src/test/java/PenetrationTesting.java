import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PenetrationTesting  extends BaseDriver {
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
	}
@Test(priority = 1)
	public void test_vulnerability() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement business_cy = driver
				.findElement(By.cssSelector(".menu-link[href='//main.techforing.com/enterprise_cybersecurity/']"));
		WebElement penetration_test = driver
				.findElement(By.cssSelector("[href='//main.techforing.com/red_team_penetration_testing/'][comment]"));

		action.moveToElement(business_cy).perform();
		Thread.sleep(2000);
         penetration_test.click();
	//for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(10000);
		
		//penetration testing your system
	WebElement click_penetration = driver.findElement(By.xpath("//a[.='Click Here To Pen Test Your System']"));
	click_penetration.click();
		Thread.sleep(2000);
		
		WebElement rq_call_back = driver.findElement(By.cssSelector("#request-btn"));
		rq_call_back.click();
		Thread.sleep(50000);

		
		WebElement f_name = driver.findElement(By.cssSelector(".b24-form-field-string .b24-form-control"));
		f_name.sendKeys("Zannnatuneesha");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.cssSelector("[name='email']"));
		email.sendKeys("oyshetasnim123@gmail.com");
		Thread.sleep(5000);
		WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
		submit.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement virtual_meeet = driver.findElement(By.cssSelector("#virtual-btn"));
		virtual_meeet.click();
		Thread.sleep(5000);
		WebElement submit_meeting = driver.findElement(By.cssSelector(".reserve"));
		submit_meeting.click();
		Thread.sleep(5000);
		WebElement call_here = driver.findElement(By.cssSelector("[href='https://techforing.com/pages/findus.php']"));
		call_here.click();
		Thread.sleep(5000);
		WebElement full_name1 = driver.findElement(By.cssSelector("[type='string']"));
		full_name1.sendKeys("Zannatunnesha");
		Thread.sleep(5000);
		WebElement email_1 = driver.findElement(By.cssSelector("[name='email']"));
		email_1.sendKeys("oyshetasnim123@gmail.com");
		Thread.sleep(5000);
		WebElement submit_click = driver.findElement(By.cssSelector("[type='submit']"));
		submit_click.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		//download book
		WebElement down1 = driver.findElement(By.cssSelector(".glide__slides > li:nth-of-type(2) .rs-btn"));
		down1.click();
		Thread.sleep(2000);
		WebElement down2 = driver.findElement(By.cssSelector(".glide__slides > li:nth-of-type(3) .rs-btn"));
		down2.click();
		Thread.sleep(2000);
		//succcess stories
		WebElement success = driver.findElement(By.cssSelector("[href='/testimonial/']"));
		success.click();
		Thread.sleep(2000);

		WebElement get_services = driver.findElement(By.cssSelector(".fa-arrow-right"));
		get_services.click();
		Thread.sleep(2000);
		//req call back
		WebElement req_call = driver.findElement(By.cssSelector("#request-btn"));
		req_call.click();
		Thread.sleep(2000);
		WebElement full_name = driver.findElement(By.cssSelector(".b24-form-field-string .b24-form-control"));
		full_name.sendKeys("Zannatunnesha");
		Thread.sleep(2000);
		WebElement r_email = driver.findElement(By.cssSelector("[name='email']"));
		r_email.sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(2000);
		WebElement message = driver.findElement(By.cssSelector("textarea"));
		message.sendKeys("We are ok with your services");
		Thread.sleep(2000);
		WebElement r_submit = driver.findElement(By.cssSelector("[type='submit']"));
		r_submit.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
		//for virtual meeting
		WebElement vir_meeting = driver.findElement(By.cssSelector("#virtual-btn"));
		vir_meeting.click();
		Thread.sleep(2000);
		WebElement sche_meeting = driver.findElement(By.cssSelector(".reserve"));
		vir_meeting.click();
		Thread.sleep(2000);
		WebElement ph_call = driver.findElement(By.cssSelector("body"));
		ph_call.click();
		Thread.sleep(2000);
		WebElement full_name11 = driver.findElement(By.cssSelector("[type='string']"));
		full_name11.sendKeys("Zannatunnesha");
		Thread.sleep(2000);
		WebElement email1 = driver.findElement(By.cssSelector("[name='email']"));
		email1.sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(2000);
		WebElement message1 = driver.findElement(By.cssSelector("textarea"));
		message1.sendKeys("I want to get yourcyber security service");
		Thread.sleep(2000);
		WebElement sub_btn = driver.findElement(By.cssSelector("[type='submit']"));
		sub_btn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
        driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//secure now 
		WebElement secure = driver.findElement(By.cssSelector(".ptc-box > [href='//main.techforing.com/get_start/']"));
		secure.click();
		Thread.sleep(2000);
		//request call back
		WebElement full_name2 = driver.findElement(By.cssSelector(".b24-form-field-string .b24-form-control"));
		full_name2.sendKeys("Zannatunnesha");
		Thread.sleep(2000);
		WebElement email2 = driver.findElement(By.cssSelector("[name='email']"));
		email2.sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(2000);
		WebElement message2 = driver.findElement(By.cssSelector("textarea"));
		message2.sendKeys("The service ypu provided is very good");
		Thread.sleep(2000);
		WebElement sub_btn1 = driver.findElement(By.cssSelector("[type='submit']"));
		sub_btn1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
        driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//virtual meeting
		WebElement vir_meet = driver.findElement(By.cssSelector("#virtual-btn"));
		vir_meet.click();
		Thread.sleep(2000);
		WebElement sche_meet = driver.findElement(By.cssSelector(".reserve"));
		sche_meet.click();
		Thread.sleep(2000);
		WebElement ph_here = driver.findElement(By.cssSelector("body"));
		ph_here.click();
		Thread.sleep(2000);
		WebElement full_name3 = driver.findElement(By.cssSelector("[type='string']"));
		full_name3.sendKeys("Zannatunnesha");
		Thread.sleep(2000);
		WebElement email3 = driver.findElement(By.cssSelector("[name='email']"));
		email3.sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(2000);
		WebElement message3 = driver.findElement(By.cssSelector("textarea"));
		message3.sendKeys("Your services are very good");
		Thread.sleep(2000);
		WebElement sub_btn3 = driver.findElement(By.cssSelector("[type='submit']"));
		sub_btn3.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
        driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//important resources article 1
		WebElement read_more = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/cyber-attacks-on-financial-services/']"));
		read_more.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
        driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		////important resources article 2
		WebElement read_more1 = driver.findElement(By.cssSelector("[href='https://main.techforing.com/resources/articles/cybersecurity-tips-for-work-from-home/']"));
		read_more1.click();
		Thread.sleep(2000);
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
		
		//closing the browser
		driver.quit();
		}

}
