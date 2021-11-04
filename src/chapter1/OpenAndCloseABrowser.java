package chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndCloseABrowser {

	public static void main(String[] args) {
		
		/*
		 * 1 - Open and Close a Browser
		 * 
		 * SKILL DEMONSTRATED: Selenium project set up and basics
		 * 
		 * NOTE: for simplicities sake I am going to adopt some "bad habits" in these skills demos and add things like config strings, etc 
		 * directly to the test class' properties so that it is easier for you to run them. In later skills examples I will show you "good"
		 * habits for these things. For now, and for all of these demos, remember it's more important here to show the skill itself.
		 * 
		 * NOTE2: Again, for simplicity I will be using only the Chrome driver for these examples beyond this first example for the most part
		 * but I have included commented out versions of instantiating a driver for Firefox and Edge below.
		 */
		
		//VARS specific to this test - Please feel free to change these and see what happens!
		String driverPath = "path to your driver";
		String urlPath = "https://www.google.com";
		
		/*
		 * RUN CHROME BROWSER
		 * 
		 * String driverPath = "path to chrome driver";
		 * System.setProperty("webdriver.chrome.driver", driverPath);
		 * WebDriver driver = new ChromeDriver();
		 */
		
		//First, we tell Selenium where to find our driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//Once Selenium has our driver, it's time to instantiate our driver.
		WebDriver driver = new ChromeDriver();
		
		/*************** OTHER BROWSER SET UPS *****************/
		
		/*
		 * RUN FIREFOX BROWSER
		 * 
		 * String driverPath = "path to gecko driver";
		 * WebDriver driver = new FirefoxDriver(); 
		 * System.setProperty("webdriver.gecko.driver", driverPath);
		 */
		
		/*
		 * RUN EDGE BROWSER
		 * 
		 * String driverPath = "path to edge driver";
		 * System.setProperty("webdriver.edge.driver",driverPath);
		 * WebDriver driver = new EdgeDriver();
		 */
		
		/* 
		 * A few notes on the "WebDriver" class
		 * 
		 * Webdriver is what is called an "interface". It defines methods that are empty and expects that any class that implements the interface to supply it's own version
		 * of those methods. This is why we can switch the web driver we are using - chrome to gecko - without significant rewrites to our tests because those drivers are
		 * expected to have implemented the same standard methods. Neat, huh? Let's kick the tires on driver in this first test and see what it can do.
		 */
		
		//First, lets open a browser and browse to a page. We do this with driver.get and use the urlPath string we provided above to tell Selenium what page we want
		driver.get(urlPath);
		
		//Later we will use assertions, but for now we'll use driver to tell us some things about the web page we are on
		
		//First, let's get the current URL and print it to the console
		System.out.println(driver.getCurrentUrl());
		
		//Now, lets scrape the whole web page and print that out to the console.
		System.out.println(driver.getPageSource());
		
		//Finally, lets get the title of the page and print it to the console.
		System.out.println(driver.getTitle());
		
		//With just a few commands, you should be able to see how and where Selenium automation capabilities are coming from, but we will explore them in more depth later!
		
		//Our first journey into Selenium is done and now it is time to clean up before calling it a day. 
		
		//First, we can run close() to close the browser window
		driver.close();
		
		//But just in case we opened other windows (that could interfere with other tests and eat up memory) we use quit() to just shut the whole browser down. Which one you use depends
		//on the test requirements.
		driver.quit();
		
		//Go ahead and run this in Eclipse and see what happens, but be sure to update the driverPath and urlPath for the browser you decide to use.
		
		//Exercises:
		
		//1. Set up you own Eclipse Selenium project
		//2. Change the urlPath string and run the script. Did anything change or break?
		//3. Set up and run the script with all of the browser and drivers above.

	}

}
