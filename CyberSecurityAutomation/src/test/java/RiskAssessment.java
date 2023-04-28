import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RiskAssessment extends BaseDriver {
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void test_business() throws InterruptedException {
		WebElement id = driver.findElement(By.cssSelector(".menu-link[href='//main.techforing.com/enterprise_cybersecurity/']"));
		id.click();
		Thread.sleep(20000);
		//for window handling
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));
				Thread.sleep(9000);
				
        WebElement req_call = driver.findElement(By.linkText("before"));
		req_call.click();

		WebElement firstName = driver.findElement(By.cssSelector("[name='first_name']"));
		firstName.sendKeys("Zannatunnesha");

		WebElement email = driver.findElement(By.cssSelector("[name='email']"));
		email.sendKeys("Zannat.techforing@gmail.com");

		WebElement download = driver.findElement(By.cssSelector(".kartra_optin_submit_btn"));
		download.click();

		driver.navigate().back();
		Thread.sleep(20000);

		driver.navigate().forward();
		Thread.sleep(20000);

		driver.navigate().refresh();
		Thread.sleep(20000);

		WebElement success = driver.findElement(By.cssSelector("[href='/testimonial/']"));
		success.click();

		WebElement service = driver.findElement(By.cssSelector(".fa-arrow-right"));
		service.click();

		WebElement req_call1 = driver.findElement(By.cssSelector("#request-btn"));
		req_call1.click();

		WebElement full_name = driver.findElement(By.cssSelector(".b24-form-field-string .b24-form-control"));
		full_name.sendKeys("Zannatunnesha");

		WebElement flag = driver.findElement(By.cssSelector(".iti__highlight"));
		flag.click();

		WebElement ph_no = driver.findElement(By.cssSelector("[name='phone']"));
		ph_no.sendKeys("01706377316");

		WebElement email1 = driver.findElement(By.cssSelector("[name='email']"));
		email1.sendKeys("01706377316");

	}

}
