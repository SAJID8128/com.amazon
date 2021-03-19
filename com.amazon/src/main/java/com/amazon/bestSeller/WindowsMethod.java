package com.amazon.bestSeller;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		/*method chaining is the mechanism to call maximize method
		 * driver is coming from WebDriver interface
		 * manage method is coming from Options interface
		 * window is itself window interface
		 * maximize method is coming from window interface
		 */
		 
				
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		driver.manage().window().maximize();
		
		// Recommended size is maximize.
		
		driver.manage().window().setPosition(new Point(100,200));

	}

}
