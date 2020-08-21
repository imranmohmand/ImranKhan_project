package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		//toolTips is when you hower_over the cursor on text field and the message shows 
		
		driver.findElement(By.xpath("//a[contains(text(),'Tooltip')]")).click();
		
		//as we know the desire element is inside the frame so first need switch to frame
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		String tooltipString=driver.findElement(By.id("age")).getAttribute("title");
		
		System.out.println("the tooltip display message is ---->   "+tooltipString);
		
		driver.quit();

	}

}
