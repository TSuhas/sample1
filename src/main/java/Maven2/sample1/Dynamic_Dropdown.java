package Maven2.sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='SAG'])[2]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@class='custom_date_pic required picker-first home-date-pick valid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='21'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='21'])[1]")).click();
		
	}
	
}
