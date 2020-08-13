package scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExampleJqueryFram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Initialize the web_driver to interact wit the Chrome web page
		driver.manage().window().maximize();//Maximize the window 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait for page full loaded 
		
		driver.get("https://jqueryui.com/droppable/");
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		
		WebElement DrageMeToMyTarget=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(DrageMeToMyTarget, droppable).build().perform();
		
		
		
		
		
		
		//driver.quit();

	}

}
