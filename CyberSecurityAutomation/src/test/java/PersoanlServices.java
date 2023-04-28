import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PersoanlServices extends BaseDriver {
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/mysecurity/pcs_user_services/");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@id='id_login']")).sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("ZannatTF@2023");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='id_remember']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(20000);
	}

	@Test(priority = 1)
	public void test_personalservices() throws InterruptedException {
		WebElement personal_service = driver
				.findElement(By.xpath("[href='//main.techforing.com/mysecurity/pcs_user_services/']"));
		personal_service.click();
		Thread.sleep(2000);
		// data and privacy protection
//		WebElement concierge_cybersecurity = driver.findElement(By.xpath(".btn.concierge_cybersecurity-pcs"));
//		concierge_cybersecurity.click();
//		Thread.sleep(2000);

		// for window handling
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(10000);

		WebElement crypto_investment = driver.findElement(By.xpath(".btn.crypto_investment_protection-pcs"));
		crypto_investment.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

}
