package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class CreateSFAccout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Initialize the web_driver to interact wit the Chrome web page
		driver.manage().window().maximize();//Maximize the window 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// wait for page full loaded 
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6n");
		//enter firstName
		WebElement First_name=driver.findElement(By.id("first_name"));
		First_name.sendKeys("imran");
		//enter lastName
		WebElement Last_name=driver.findElement(By.id("last_name"));
		Last_name.sendKeys("khan");
		//enter email address
		WebElement Email_address=driver.findElement(By.id("email"));
		Email_address.sendKeys("imranmohmand@yahoo.com");
		//enter Role
		WebElement Job_Role=driver.findElement(By.id("job_role"));
		//Job_Role.click();
		//there are two way 1 by send_key and oth
		Select select_Role_From_drop_down=new Select(Job_Role);
		select_Role_From_drop_down.selectByIndex(3);
		List<WebElement>ddOptions=select_Role_From_drop_down.getOptions();
		int size=ddOptions.size();
		System.out.println(size);
		for(int i=1;i<size;i++) {
			String text=ddOptions.get(i).getText();
			System.out.println(text);
		}
		//enter your company
		WebElement company=driver.findElement(By.id("company"));
		company.sendKeys("imran&Co");
		
		//select country from the drop_down 
		WebElement country=driver.findElement(By.id("country"));
		Select select_Country_From_drop_down=new Select(country);
		select_Country_From_drop_down.selectByIndex(0);
		
		//enter postal_code
		WebElement postal_code=driver.findElement(By.id("postal_code"));
		postal_code.sendKeys("22153");
		
		//enter your userName
		WebElement user_name=driver.findElement(By.id("username"));
		user_name.sendKeys("imran@imranco.com");
		
		//click on the check_box to accept the terms of conditions
	boolean statusOfCheckBox=driver.findElement(By.xpath("//*[@id='eula_container']/label[1]")).isSelected();
	if(statusOfCheckBox) {
		System.out.println("by default selected ");
	}else {
		driver.findElement(By.xpath("//*[@id='eula_container']/label[1]")).click();
		System.out.println("the check_box is successfully selected ");
	}
	
	// click on sign me up
	WebElement sign_me_up=driver.findElement(By.id("submit_btn"));
	sign_me_up.click();
		
		
		
		
		
		Thread.sleep(7000);//this will wait certain amount of time before closing browser 
		//driver.quit();//this will close the driver to release memory allocation 

	}

}
