package com.amazon.bestSeller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAmazonTitle {

	public static void main(String[] args) {
	
		// This is how we open chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//This is how we open firefox browser
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver1 = new FirefoxDriver();
				
		//This is how we open edge browser
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver2 = new EdgeDriver();
		
		
		
		
		String amazonTitile = driver.getTitle();
		//String is a datatype equal is an operator 
		//driver.getTitle is a  amazon title is the variable name
		//selenium webdriver interface method also variable value
		System.out.println("This is amazon title "+amazonTitile);
		//We are printing the title
		
		//This is how to kill a browser
		driver.quit();
		
		
		
		
		
		
		


	}

}
