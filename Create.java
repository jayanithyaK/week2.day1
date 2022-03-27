package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create {
	
	public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();			
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
						
				driver.findElement(By.xpath("//password[@id='password']")).sendKeys("crmsfa");
				
				driver.findElement(By.xpath("//input[@value='Login']")).click();
			
				
				//driver.findElement(By.linkText("CRM/SFA")).click();
				
				//driver.findElement(By.linkText("Leads")).click();
				
				//driver.findElement(By.linkText("Create Lead")).click();
				
				//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abcd");
				
			//	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("jayanithya");
				
				//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
				
				//driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nithya");
				
				//driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				
				//driver.findElement(By.id("createLeadForm_description")).sendKeys("this is testleaf assignment");
				
				//driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithya301192@gmail.com");
				
				
			 //WebElement eledropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				//Select dd = new Select(eledropdown);
				
				//dd.selectByVisibleText("New York");
				
				
				//driver.findElement(By.className("smallSubmit")).click();
				
				//String title=driver.getTitle();
				//System.out.println(title);
		}

}	




























	

