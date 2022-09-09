package Maven2.sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Delhi");
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']")).click();
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		driver.findElement(By.xpath("(//p[text()='21'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		driver.findElement(By.xpath("(//p[text()='25'])[2]")).click();
		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-cy='adults-5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-cy='children-5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-cy='infants-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-cy='travelClass-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='font12 blackText latoBold wrapFilter  '][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(3000);
	  /*  driver.findElement(By.xpath("//div[@class='clusterTabHeadList makeFlex active']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class='inner'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		Thread.sleep(5000);*/
		
		
	}

}
