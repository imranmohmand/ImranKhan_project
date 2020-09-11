package Practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement sendText=driver.findElement(By.name("q"));
		sendText.sendKeys("selenium");
		sendText.submit();
		
		List<WebElement> eleList=driver.findElements(By.tagName("a"));
		int size=eleList.size();
		System.out.println(size);
		for(int i=1;i<=10;i++) {
			String text=eleList.get(i).getAttribute("href");
		
		}
		
		
		
		//driver.close();
	}

}
