package Maven2.sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		Thread.sleep(2000);
		
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.xpath("(//span[@id='hrefIncAdt']")).click();
			i++;
		}*/
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		
		
	}
}
