package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLaunchPageLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("firstName")).sendKeys("Ankita");
		driver.findElement(By.name("lastName")).sendKeys("Jain");
		driver.findElement(By.name("phone")).sendKeys("2564897551");
		driver.findElement(By.id("userName")).sendKeys("ankitaj2701");		
		driver.findElement(By.name("address1")).sendKeys("44 crescent drive");
		driver.findElement(By.name("city")).sendKeys("Brampton");
		driver.findElement(By.name("state")).sendKeys("Ontario");
		driver.findElement(By.name("postalCode")).sendKeys("L6X4Z5");		
		driver.findElement(By.name("country")).sendKeys("CANADA");
		driver.findElement(By.name("email")).sendKeys("ankitaj270188@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("confirmPassword")).sendKeys("test");
		driver.findElement(By.name("submit")).click();
		driver.close();
			

	}

}
