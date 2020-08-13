package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class GetAllTextElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Initialize the web_driver to interact wit the Chrome web page
		driver.manage().window().maximize();//Maximize the window 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait for page full loaded 
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6n");
	
		//enter Role
		WebElement Job_Role=driver.findElement(By.id("job_role"));
		//Job_Role.click();
		//there are two way 1 by send_key and other
		Select select_Role_From_drop_down=new Select(Job_Role);
		select_Role_From_drop_down.selectByIndex(3);
		List<WebElement>ddOptions=select_Role_From_drop_down.getOptions();
		int size=ddOptions.size();
		System.out.println(size);
		for(int i=1;i<size;i++) {
			String text=ddOptions.get(i).getText();
			System.out.println(text);
		}
		
		
		//select country from the drop_down 
		WebElement country=driver.findElement(By.id("country"));
		Select select_Country_From_drop_down=new Select(country);
		select_Country_From_drop_down.selectByIndex(0);
		List<WebElement>ddOfCountry=select_Country_From_drop_down.getOptions();
		int countrySize=ddOfCountry.size();
		System.out.println(countrySize);
		for(int y=1;y<countrySize;y++) {
			String countryText=ddOfCountry.get(y).getText();
			System.out.println(countryText);
		}
		
	
		Thread.sleep(7000);//this will wait certain amount of time before closing browser 
		driver.quit();//this will close the driver to release memory allocation 

	}

}
