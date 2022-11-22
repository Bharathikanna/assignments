package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {
	
	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Bharathi");
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.sendKeys("bharathi");
		driver.findElement(By.id("input-lastname")).sendKeys("Kanna");
		driver.findElement(By.id("input-email")).sendKeys("bharathikanna2410@gmail.com");
		WebElement dropdown = driver.findElement(By.id("input-country"));
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("Afghanistan");
		driver.findElement(By.id("input-password")).sendKeys("abdhdhd");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
