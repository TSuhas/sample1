package Maven2.sample1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='increment'])[1]")).click();
		for(int i=0; i<10; i++) {
			driver.findElement(By.xpath("(//a[@class='increment'])[1]")).click();
			
		}
		
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='increment'])[4]")).click();
		for(int i=0; i<5; i++) {
			driver.findElement(By.xpath("(//a[@class='increment'])[4]")).click();
			
		}
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[3]")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='increment'])[15]")).click();
		for(int i=0; i<3; i++) {
			driver.findElement(By.xpath("(//a[@class='increment'])[15]")).click();
			
		}
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[14]")).click();
		//Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(WebElement option: options)
		{
			System.out.print(option.getText()+" ");
		}
		System.out.println();
		
		
		driver.findElement(By.xpath("//img[@class=' ']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='product-remove'])[2]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		//Thread.sleep(2000);
		
		WebElement list = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		
		Select s = new Select(list);
		s.selectByValue("India");
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Thread.sleep(2000);
		
	
		
		// select a single element from multiple
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0; i<products.size(); i++) {
			String name= products.get(i).getText();
			if(name.contains("Beans")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
				
			}
		}
		
		driver.quit();
	}
	
	
	
	
}
