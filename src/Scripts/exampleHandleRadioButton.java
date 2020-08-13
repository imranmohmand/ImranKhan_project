package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleHandleRadioButton {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Initialize the web_driver to interact wit the Chrome web page
		driver.manage().window().maximize();//Maximize the window 
		// also called "method chaining" in java means in one method output (driver)we are performing some other operation 
		//means we can called multiple methods in a single line of code using method chaining concept in java 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait for page full loaded 
		
		driver.get("https://www.bing.com/account/general?ru");
		//check the radio_button "moderate" is select by default  or 
		boolean statusOfRadioButtonModerate=driver.findElement(By.id("adlt_set_moderate")).isSelected();
		if(statusOfRadioButtonModerate) {
			System.out.println("Moderate Radio_button is selected by default");
		}else {
			System.out.println("the Moderate Radio_button handle succesfully");
			driver.findElement(By.id("adlt_set_moderate")).click();
		}
		
		//check the radio_button "strict" is select or not if not than select it
		boolean statusOfRadioButtonStrict=driver.findElement(By.id("adlt_set_strict")).isSelected();
		if(statusOfRadioButtonStrict) {
			System.out.println("Radio button is already selected");
		}else {
			driver.findElement(By.id("adlt_set_strict")).click();
			System.out.println("successfully handle the radio button");
		}
		
		
		
		
		Thread.sleep(6000);//wait certain amount of time before closing the browser 
		driver.quit();//is a command which will terminate the browser instance 
					// whatever the memory is allocated for the program  it will release that memory
					// if we are not releasing  that memory at the end of the script 
					// than after 5 or 6 execution you system performance will come down
		//for this purpose we will be using quite command to release the memory 
		
	}

}
