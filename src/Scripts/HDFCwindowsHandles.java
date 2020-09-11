package scripts;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCwindowsHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")).click();
		String current_windowHandleString=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"secondary-menu\"]/li[1]/a")).click();
		Set<String>AllwindowHanldes=driver.getWindowHandles();
		for(String window:AllwindowHanldes) {
			driver.switchTo().window(window);
			String urlString=driver.getCurrentUrl();
			System.out.println(urlString);
			
			
		}
		
		List<WebElement>elements=driver.findElements(By.tagName("iframe"));
		int size=elements.size();
		System.out.println("the total number of frame are "+ size);
		
	
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
//		WebElement DOB=driver.findElement(By.id("dob"));
//		DOB.sendKeys("27/02/1998");
//		DOB.click();
//		driver.findElement(By.xpath("//*[@id='frmLoginAccount']/div/div[4]/button")).click();
//		
		
		
		driver.switchTo().window(current_windowHandleString);
		
		
		
		
		
		
		//driver.quit();
		

	}

}
