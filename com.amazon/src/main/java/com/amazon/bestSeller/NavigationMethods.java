package com.amazon.bestSeller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		
		
		/*difference between get(); and navigation();
		 * navigation will allow you to go forward, backward and refresh
		 * navigation by default will not wait until page load. It is recommended
		 * to use page load time out with navigation command.
		 * 
		 * get will wait until page load, but does not have forward, backward option
		 * get is the preferred method to open application
		 */
		

	}

}
