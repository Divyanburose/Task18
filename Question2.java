package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch web driver
WebDriver driver = new ChromeDriver();
//Load the URL
driver.navigate().to("https://jqueryui.com/droppable/");
//Maximize the window
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//switch to frame by index
driver.switchTo().frame(0);
//find source 
WebElement source = driver.findElement(By.id("draggable"));
//find destination
WebElement destin = driver.findElement(By.id("droppable"));
//actions class to perform drag and drop
Actions mouse = new Actions(driver);
mouse.dragAndDrop(source, destin).perform();
//print the text of destination
System.out.println(destin.getText());
//print the background color
System.out.println(destin.getCssValue("background"));
//close the window
//driver.close();


	
	
	
	
	
	
	
	
	
	
	
	}

}
