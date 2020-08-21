package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		//send the text in the search filed 
		driver.findElement(By.id("sb_form_q")).sendKeys("JavaLearning");
		
		Thread.sleep(6500);
		
		//inspect the text and identified the common property 
		List<WebElement>autsuggest =driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
		System.out.println("the size are ---->"+autsuggest.size());
		/*
		for(int i=0;i<autsuggest.size();i++) {
			String aut_dropDown_Text=autsuggest.get(i).getText();
			System.out.println(aut_dropDown_Text);
		}
		*/
		//if i want to select one value in the drop down suggestion than the code will be
		for(int i=0;i<autsuggest.size();i++) {
			if(autsuggest.get(i).getText().contains("java learning code")) {
				autsuggest.get(i).click();
				break;
			}
			}
		
		
		//driver.quit();

	}

}
