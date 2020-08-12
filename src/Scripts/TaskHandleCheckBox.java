package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskHandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Initialize the web_driver to interact wit the Chrome web page
		driver.manage().window().maximize();//Maximize the window 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait for page full loaded 
		
		driver.get("https://www.bing.com/account/general?ru");
		boolean statucOfCheckBoxVoicSearch=driver.findElement(By.id("vsread")).isEnabled();
		if(statucOfCheckBoxVoicSearch) {
			System.out.println("by default the checkBox is select ");
		}else {
			driver.findElement(By.id("vsread")).click();
			System.out.println("the checkbox is successfully selected");
		}
		
		
		Thread.sleep(7000);
		driver.quit();

	}

}
