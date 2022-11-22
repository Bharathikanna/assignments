package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailTest {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://erail.in/");
		driver.manage().window().maximize();
		WebElement sourceStation = driver.findElement(By.id("txtStationFrom"));
		sourceStation.clear();
		sourceStation.sendKeys("Mas");
		sourceStation.sendKeys(Keys.TAB);
		
		WebElement destination = driver.findElement(By.id("txtStationTo"));
		destination.clear();
		destination.sendKeys("Sa");
		destination.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("buttonFromTo")).click();
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[1]"));
		System.out.println("Number of trains  :"+table.size());
		
		for (int i = 0; i < table.size(); i++) {
			String blah = table.get(i).getText();
			System.out.println(blah);
		
		
		
		
		
		
		
	}

	}}
