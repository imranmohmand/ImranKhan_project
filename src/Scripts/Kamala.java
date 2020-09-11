package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kamala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement searchbar=driver.findElement(By.name("q"));
		searchbar.sendKeys("selenium");
		searchbar.submit();
		
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<=10;i++) {
			
			if(ele.contains("selenium")) {
				String text=ele.get(i).getAttribute("a");
				System.out.println(text);
			}
			
			
		}
	
		
	
		
		
		driver.close();
		
		

	}

}
