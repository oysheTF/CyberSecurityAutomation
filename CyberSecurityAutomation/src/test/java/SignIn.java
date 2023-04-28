import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class SignIn extends BaseDriver {

	public void openUrl() throws InterruptedException {
		driver.get("https://main.techforing.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	public void test_login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='id_login']")).sendKeys("zannat.techforing@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("ZannatTF@2023");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='id_remember']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(20000);
		// window handle
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(5000);

		driver.findElement(By.cssSelector("[href='//main.techforing.com/account/profile_edit/']")).click();
		Thread.sleep(20000);
		WebElement full_name = driver.findElement(By.cssSelector("#id_full_name"));
		full_name.clear();
		full_name.sendKeys("Zannatunnnesha");
		Thread.sleep(2000);
		WebElement ph_no = driver.findElement(By.cssSelector("#id_phone_number"));
		ph_no.clear();
		ph_no.sendKeys("+12125552368");
		Thread.sleep(2000);
		WebElement address_one = driver.findElement(By.cssSelector("#id_address_one"));
		address_one.clear();
		address_one.sendKeys("340 Shanakar dhanmondi");
		Thread.sleep(2000);
		WebElement address_two = driver.findElement(By.cssSelector("#id_address_two"));
		address_two.clear();
		address_two.sendKeys("940 Uttar Bogra Road, Barishal");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.cssSelector("#id_city"));
		city.clear();
		city.sendKeys("Dhaka");
		Thread.sleep(2000);
		WebElement zip_code = driver.findElement(By.cssSelector("#id_zipcode"));
		zip_code.clear();
		zip_code.sendKeys("1200");
		Thread.sleep(2000);

		WebElement country = driver.findElement(By.cssSelector("#id_country"));
		country.clear();
		country.sendKeys("Bangladesh");
		Thread.sleep(2000);

		WebElement birth_date = driver.findElement(By.xpath("//input[@id='id_birth_date']"));
		birth_date.click();
		birth_date.sendKeys("03/12/2001");
		birth_date.click();
		Thread.sleep(2000);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//date picker
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.querySelector('id_birth_date').value='02/11/2001'");

		WebElement gender = driver.findElement(By.cssSelector("#id_gender"));
		Select select = new Select(gender);
		select.selectByVisibleText("Female");
		// gender.sendKeys("Female");
		// gender.click();
		Thread.sleep(5000);

		WebElement saveChanges = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		// for scrolling
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveChanges);
		saveChanges.click();
		Thread.sleep(2000);
		// FOR LOGOUT BUTTON
		WebElement logoutButton = driver.findElement(By.cssSelector("[href='//main.techforing.com/account/logout/']"));
		logoutButton.click();
		Thread.sleep(2000);

		// close the browser
		driver.quit();
	}

}
