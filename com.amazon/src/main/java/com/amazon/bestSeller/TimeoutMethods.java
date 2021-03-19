package com.amazon.bestSeller;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeoutMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:amazon.com");
		driver.navigate().to("https://www.amazon.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//this is to page load specially for navigation method
		driver.manage().window().maximize();
		
		/* with method chaining we will get to implicitlyWait()
		 * driver is coming from window interface
		 * manage is coming from Options interface
		 * timeout is an interface
		 * implicitlyWait method is coming from timeouts interface
		 * */
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//10 is the duration of time you desire
		//TimeUnit is the time you want such as second or minute
		//implicitlyWait are only working for findElement() and findElements() methods
		//implicitlyWait working globally
		//if elements is not ready desired seconds, it will throw timeout exceptions
		driver.findElement(By.linkText("Best Sellers")).click();
		
		
			
	}

}
