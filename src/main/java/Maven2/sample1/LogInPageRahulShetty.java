package Maven2.sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPageRahulShetty {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("suhastupake");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='password']")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("rahul");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}
	
}
