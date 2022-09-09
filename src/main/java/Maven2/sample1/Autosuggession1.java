package Maven2.sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggession1 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[2]")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		
		for(WebElement option :options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
				
			}
				
		}
		
		
	}
	
}
