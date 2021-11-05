package chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		/*
		 * SETUP
		 * 
		 * If you remember from the first chapter, we first need to set up our 
		 * test. Later I'll show you how to just import this instead of cutting
		 * and pasting it into every test. 
		 */
		String driverPath = "path to your driver";
		String urlPath = "https://www.google.com";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(urlPath);
		
		/*
		 * A large part of the work you will do with Selenium will require you to find
		 * and interact with elements on a web page. Selenium has many methods for you
		 * to do this. I am going to cover the basic ones now and cover more advanced
		 * locators later.
		 * 
		 * NOTE: While I will be using lots of different locator examples for this
		 * chapter, the best strategy for choosing the right one to use is simple - 
		 * pick the one that is the most unique. Most developers will provide ids for
		 * important page elements to make life easier for automators, but ids are
		 * not always available or feasible.
		 * 
		 * NOTE: When you download this test, the driver calls will all be commented out.
		 * Uncomment and run each driver line one at a time as a story sort of plays out
		 * to help show you some additional methods for interacting with the page.
		 */
		
		/*
		 * We will once again use google for our test. This time, we are going to focus on
		 * the search box. If you use developer tools and inspect the search element you will
		 * see:
		 * 
		 * <input class="gLFyf gsfi" jsaction="paste:puy29d;" maxlength="2048" 
		 * name="q" type="text" aria-autocomplete="both" aria-haspopup="false" 
		 * autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" 
		 * role="combobox" spellcheck="false" title="Search" value="" 
		 * aria-label="Search" data-ved="0ahUKEwiIluK31IH0AhXYJzQIHZxGBzUQ39UDCAY">
		 * 
		 * There's a lot here to work with, but take note: no ids!
		 * 
		 * To find elements on a page, Selenium scans the page from the upper left of the page
		 * to the bottom right, going right to left along the way. As it scans, it looks for the
		 * object you specify using the findElement method of the WebDriver class. Let's take a
		 * look at an example using the search field's name. We will find the field by it's name
		 * then enter some text into it.
		 */
				
		//Find the search field by name and send text to it
		
		//Uncomment the line below
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		/*
		 * In this example, we used the findElement method then specified how we want to find the 
		 * element - By.name - and provided the name from our input field. Once it is found, we use a chained
		 * method called 'sendKeys' to send text to the text field.
		 */
		
		//Now let's find the search field by class name and some more text to it
		//Uncomment the line below
		//driver.findElement(By.className("gLFyf")).sendKeys(" Automated Testing");
		
		/*
		 * Did you notice anything when you ran the line above? It added text to the search field, didn't it?
		 * We don't always want that, so before we use our next locator, we will clear the text in the search
		 * field.
		 */
		
		//Uncomment the line below
		//driver.findElement(By.name("q")).clear();
		
		//Now we have clear search field to work with!
		
		/*
		 * Next, lets step away from the search field and find some other things on the page. Let's
		 * take a look at the 'About' link at the top of the page. Here's the source for that element:
		 * 
		 * <a class="MV3Tnb" href="https://about.google/?fg=1&amp;utm_source=google-US&amp;utm_medium=referral&amp;utm_campaign=hp-header" 
		 * ping="/url?sa=t&amp;rct=j&amp;source=webhp&amp;url=https://about.google/%3Ffg%3D1%26utm_source%3Dgoogle-US%26utm_medium%3Dreferral%26utm_campaign%3Dhp-header&amp;ved=0ahUKEwiIluK31IH0AhXYJzQIHZxGBzUQkNQCCAI">About</a>
		 * 
		 * Let's see if we can get the text of the about link and log it to the console by looking for it by class
		 */
		
		//Uncomment the line below
		//System.out.println(driver.findElement(By.className("MV3Tnb")).getText());
		
		/*
		 * We passed the driver.findElement method call into the System.out.println method and logged
		 * the text of the element with className MV3Tnb to console. Scrapping text, like usernames, or 
		 * any number of things will be critical to assertions and other actions in your tests.
		 * 
		 * Let's take a look at using link text to find an element next.
		 */
		
		//Uncomment the line below
		//driver.findElement(By.linkText("Store")).click();
		
		/*
		 * In the example above we passed told Selenium to find the button with the text 'About' and click it.
		 * 
		 * But now we are no longer on the search page! 
		 * 
		 * First, lets get the title of the page we are on and the url and log both to the console.
		 */
		
		//Uncomment the lines below
		//String pageTitle = driver.getTitle();
		//String pageUrl = driver.getCurrentUrl();
		//System.out.println("The current page title is: " + pageTitle + ". And it's URL is: " + pageUrl);
		
		/*
		 * You can these methods to validate the page you are on is the correct one and many other things.
		 * 
		 * Now, let's get back to the search page!
		 */
		
		//Uncomment the line below
		//driver.navigate().back();
		
		/*
		 * Here we used the driver's navigate method and chained the back method to it to return to the search page.
		 * 
		 * Let's get the page title and url again and put them in the console to make sure we went back the search page
		 */
		
		//Uncomment the lines below
		//String page2Title = driver.getTitle();
		//String page2Url = driver.getCurrentUrl();
		//System.out.println("The current page title is: " + page2Title + ". And it's URL is: " + page2Url);
		
		/*
		 * Now lets use xpath and css to find elements on the page
		 * 
		 * Css and xpath both use specific kinds of notations. If you are familiar with jquery you'll
		 * be comfortable with the notation. To be honest, I keep a cheatsheet around and you'll find a copy of
		 * it in this chapter folder. It's not comprehensive by any means but helpful.
		 *
		 * Let's use css to find the Images link. Here's the source of that element:
		 * 
		 * <a class="gb_f" data-pid="2" 
		 * href="https://www.google.com/imghp?hl=en&amp;authuser=0&amp;ogbl" 
		 * target="_top">Images</a>
		 */
		
		//Uncomment the line below
		//driver.findElement(By.cssSelector("a[class='gb_f")).click();
		
		/*
		 * css selectors use the following notation inside of the cssSelector method:
		 * 
		 * tag[attribute='value]
		 * 
		 * Now lets try to find the same link with xpath, but first we need to go back to the search page
		 */
		
		//Uncomment the lines below
		//driver.navigate().back();
		//driver.findElement(By.xpath("//a[@class='gb_f']")).click();
		
		/*
		 * xpath notation is pretty similar to css':
		 * 
		 *  //tag[@attribute='value']
		 *  
		 *  So when should you use xpath and when should you use css? I recommend that one or the other is chosen
		 *  to be the dominate method of locating elements in your test suite. Most ideal is ids but failing
		 *  that, choosing a standard approach for finding elements can reduce a lot of confusion for your team.
		 *  
		 *  There are variations on using css and xpath locators. You can provide them an index if there multiple
		 *  similar elements on the page for example or pass it a regular expression. These approaches are
		 *  sometimes necessary, but can be very brittle. Using an element's index is bound to break if the
		 *  page is redesigned and the element changes positions, for example.
		 */
		
		/*
		 * This was a lot to cover! I hope you got the basics of interacting with page elements and browser.
		 * 
		 * We'll cover more selectors in the a future lesson! For now, check out the sheet provided in the chapter2
		 * folder and try these exercises:
		 * 
		 * 1. Find a form on a web page of your favorite site and create locator notation for all of the form
		 * fields.
		 * 
		 * 2. Edit the script above to find the same elements using different methods.
		 */
		
		driver.close();
		driver.quit();
		

	}

}
