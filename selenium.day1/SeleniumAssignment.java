package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kanna M");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("BK");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Civil");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("There's nothing in here!");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bharathikanna2410@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("There's nothing here either!");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
	}
}
