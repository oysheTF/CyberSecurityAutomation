import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Passwordreset extends BaseDriver{
	@Test(priority = 0)
	public void test_forgetPass() throws InterruptedException {
		driver.get("https://main.techforing.com/accounts/login/");
		WebElement for_pass = driver.findElement(By.cssSelector("[href='/accounts/password/reset/']"));
		for_pass.click();
		Thread.sleep(10000);

		WebElement email = driver.findElement(By.id("id_email"));
		email.sendKeys("zannat.techforing@gmail.com");
		
		WebElement reset_pass = driver.findElement(By.cssSelector(".pro-save"));
		reset_pass.click();
		Thread.sleep(20000);
		
	}

}
