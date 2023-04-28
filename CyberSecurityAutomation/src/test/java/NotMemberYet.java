import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NotMemberYet extends BaseDriver{
	@Test(priority = 0)
	public void test_notMember() throws InterruptedException{
	driver.get("https://main.techforing.com/accounts/login/");
	WebElement not_member = driver.findElement(By.cssSelector("[href='/accounts/signup/'] > span"));
	not_member.click();

	WebElement full_Name = driver.findElement(By.cssSelector("#id_full_name"));
	full_Name.sendKeys("Zannatunnesha");

	WebElement email = driver.findElement(By.cssSelector("#id_email"));
	email.sendKeys("oyshetasnim123@gmail.com");

	WebElement password = driver.findElement(By.cssSelector("#signup-form div:nth-of-type(3) .textinput"));
	password.sendKeys("oyshe1234");

	WebElement con_password = driver.findElement(By.cssSelector("#signup-form div:nth-of-type(4) .textinput"));
	con_password.sendKeys("oyshe1234");

	WebElement news_letter = driver.findElement(By.cssSelector("#id_newsletter"));
	news_letter.click();
	WebElement signup_btn = driver.findElement(By.cssSelector(".submit"));
	signup_btn.click();
	
	}

}
