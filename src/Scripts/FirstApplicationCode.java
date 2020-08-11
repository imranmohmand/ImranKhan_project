package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstApplicationCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Initialize the web_driver to interact wit the Chrome web page
		driver.manage().window().maximize();//Maximize the window 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait for page full loaded 
		
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium webdriver");
		// actual path has space "search icon tooltip" so i used cssSelector and to cover space we used dot at the
		//Begging as well as in the space
		driver.findElement(By.cssSelector(".search.icon.tooltip")).click();
		
		
		
		driver.quit();

	}

}
