package Maven2.sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autosuggession2 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("india")) {
			option.click();
			break;
			}
			
		}
		
		driver.findElement(By.xpath("(//input[@name='ctl00$mainContent$rbtnl_Trip'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip'])[2]")).isSelected());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		Select ss = new Select(drop);
		ss.selectByValue("INR");
		Thread.sleep(1000);
		
		
		
		
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[1]")).click();
		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.xpath("(//span[@class='pax-add pax-enabled'])[1]")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		
		
	}
	
}
