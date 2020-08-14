package scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleSaleForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//identify frame in jquery web_page and perform a switch operation on that frame 
		//than use action class click and drag 
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Initialize the web_driver to interact wit the Chrome web page
		driver.manage().window().maximize();//Maximize the window 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait for page full loaded 
		
		
		driver.get("https://login.salesforce.com/?startUR");
		driver.findElement(By.id("username")).sendKeys("imran@imranco.com");
		driver.findElement(By.id("password")).sendKeys("Muhammad5!%");
		driver.findElement(By.id("Login")).click();
		//driver.findElement(By.xpath("//*[@id='editPage']/p[2]")).click();
		Thread.sleep(40000);
	
		driver.findElement(By.xpath("//span[@class='label']")).click();
		driver.findElement(By.xpath("//span[@class='slds-align-middle']")).click();
		
		
		
		
		
		
		//driver.quit();

	}

}
