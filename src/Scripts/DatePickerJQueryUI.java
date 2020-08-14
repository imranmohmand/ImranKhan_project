package scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class DatePickerJQueryUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Initialize the web_driver to interact wit the Chrome web page
		driver.manage().window().maximize();//Maximize the window 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait for page full loaded
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[6]/a")).click();
		driver.findElement(By.id("datepicker")).click();
	

	
		Thread.sleep(7000);//this will wait certain amount of time before closing browser 
		driver.quit();//this will close the driver to release memory allocation 

	}

}
