package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		//print all the element cell by cell
		List<WebElement>AllTableElements=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for(WebElement ele:AllTableElements) {
			String allEleText=ele.getText();
			System.out.println(allEleText);
		}
		
		// the number of row are
		List<WebElement> RowsElement= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int RowSize=RowsElement.size();
		System.out.println(RowSize);
		
		//the number of columns are
		List<WebElement>ColElements=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		int columnsSize=ColElements.size();
		System.out.println(columnsSize);
		
		// when we are talking about index than go for regular loop
		for(int i=2;i<RowSize;i++) {
			for(int y=1;y<columnsSize;y++) {
				String text=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+ i+ "]/td["+ y+"]")).getText();
				System.out.println(text);
			}
		}
		
		
		
		
		
		driver.close();

	}

}
