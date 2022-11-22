package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondScriptAmazon {
	public static void main(String[] args) {
		
		    WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.amazon.in/");
			driver.manage().window().maximize();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
			driver.findElement(By.id("nav-search-submit-button")).click();
			List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

			for (int i = 0; i < findElements.size(); i++) {
				String prize = findElements.get(i).getText();
				System.out.println(prize);
		    
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	}
}
