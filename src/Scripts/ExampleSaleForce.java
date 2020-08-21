package scripts;



import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		Thread.sleep(20000);
		
		//click on create account tab
		driver.findElement(By.xpath("//*[@title='Create Menu']")).click();
		//loop until click on "user"
		List<WebElement>listele=driver.findElements(By.xpath("//span[@class='slds-align-middle']"));
	    for(int i=0;i<listele.size();i++) {
		String text=listele.get(i).getText();
		if(text.equalsIgnoreCase("User")) {
			listele.get(i).click();
			break;
		}
	}
	    //to add user we need to switch first because our desired object is inside in frame
		WebElement UserFrame=driver.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
		driver.switchTo().frame(UserFrame);
	    for(int y=0;y<5;y++) {
	    	//enter First_name
	    driver.findElement(By.id("name_firstName")).clear();
		driver.findElement(By.id("name_firstName")).sendKeys("Jabir"+y);
		//enter Last_name
		driver.findElement(By.id("name_lastName")).clear();
		driver.findElement(By.id("name_lastName")).sendKeys("mohmand"+y);
		//enter Email
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("JM@yahoo.com"+y);
		/*
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).sendKeys("");
		*/
		//enter User_name
		driver.findElement(By.id("Username")).clear();
		driver.findElement(By.id("Username")).sendKeys("JMOhmand"+y);
		 
		//enter Nick_name
		driver.findElement(By.id("CommunityNickname")).clear();
		driver.findElement(By.id("CommunityNickname")).sendKeys("chasmish"+y);
		
		//enter Title
		
		driver.findElement(By.id("maxlength")).clear();
		driver.findElement(By.id("maxlength")).sendKeys("QA Engineer");
		//select Rol
		//role
		driver.findElement(By.id("role")).clear();
		WebElement eleRol=driver.findElement(By.id("role"));
		Select select=new Select(eleRol);
		select.selectByVisibleText("Marketing Team");
		
		
		}
		
		//driver.quit();

	}

}
