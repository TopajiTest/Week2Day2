package week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the URL and editlead page 
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		// user login 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
	
		// click CRMSFA link 
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// home page 
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sowmiya");
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[3]")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='companyName']")).sendKeys("IBM");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).isDisplayed();
		
		if(driver.getPageSource().contains("ibm (10035)"))
		{
		System.out.print("ibm (10035)");

		}
		else {
			
		System.out.print("Not Present");

		}
		
		driver.close();
			
		

	}

}
