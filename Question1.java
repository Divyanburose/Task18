package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
//Launch web browser
	WebDriver driver = new ChromeDriver();
//load the URL
	driver.navigate().to("https://www.facebook.com/");
//Maximize the window
	driver.manage().window().maximize();
//Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//Inspect create new account using xpath data test id attribute
	driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
//Inspect and Enter first name
	driver.findElement(By.name("firstname")).sendKeys("divya");
//Inspect and Enter SAR name
	driver.findElement(By.name("lastname")).sendKeys("ganeshwathi");
//Inspect and Enter email id
	driver.findElement(By.name("reg_email__")).sendKeys("divyaganeshwathi@gmail.com");
//Inspect and Enter reenter password
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("divyaganeshwathi@gmail.com");
//Inspect and Enter new password
	driver.findElement(By.id("password_step_input")).sendKeys("dhan@sekar");
//Inspect and enter date of birth
	WebElement day =driver.findElement(By.id("day"));
//Create an object for select class
	Select sel = new Select(day);
	sel.selectByValue("11");
//Inspect and enter month of birth
	WebElement month = driver.findElement(By.name("birthday_month"));
//Create an object for select class	
	Select sel1 = new Select(month);
	sel1.selectByIndex(4);
//Inspect and enter month of birth
	WebElement year = driver.findElement(By.id("year"));
//Create an object for select class	
	Select sel2 = new Select(year);
	sel2.selectByVisibleText("1985");
//Select radio button
driver.findElement(By.xpath("//label[text() = \"Female\"]")).click();
//select sign in button
driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
Thread.sleep(3000);
//Compares the title of registration page and home page
String ActualTitle = driver.getTitle();
System.out.println("Actual Title:"+ActualTitle);
if (ActualTitle.equalsIgnoreCase("Facebook")) {
	System.out.println("Registration failed");
} else {
	System.out.println("User successfully registered and redirectd to facebook homepage");
}	
	}

}
