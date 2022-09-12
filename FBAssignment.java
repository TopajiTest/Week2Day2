package week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the FB URL and create a user 
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']")).click();
		
		driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@name= 'firstname']")).sendKeys("Home");
		
		driver.findElement(By.xpath("//input[@name= 'lastname']")).sendKeys("Key");
		
		driver.findElement(By.xpath("//input[@name= 'reg_email__']")).sendKeys("9879879879");
		
		driver.findElement(By.xpath("//input[@id= 'password_step_input']")).sendKeys("Selenium@123");
		
		//Select day via Dropdown
		
		WebElement day =driver.findElement(By.id("day"));
		Select dd = new Select(day);
		dd.selectByIndex(2);
		
		//Select Month via Dropdown
		
		WebElement month = driver.findElement(By.id("month"));
		Select mo = new Select(month);
		mo.selectByVisibleText("Mar");
		
		
		//Select Year via Dropdown
		
		WebElement year = driver.findElement(By.id("year"));
		Select ye = new Select(year);
		ye.selectByValue("1991");
		
		
		
		
		//driver.close();
		
		
		
		
		
		
		

		
		
	
		
		
		
		
	
		
				
		
		
	   
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
