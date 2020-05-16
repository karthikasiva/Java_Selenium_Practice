package org.practice.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		//Input email
		driver.findElementById("email").sendKeys("karthikasiva1995@gmail.com");
		
		//Append text
		WebElement appendElement = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[2]/input");
		appendElement.sendKeys("test");
		appendElement.sendKeys(Keys.TAB);
		
		//Get Value
		String value=null;
		value = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[3]/input").getAttribute("value");
		System.out.println("Present value is " + value );
		
		//Clear box
		driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[4]/input[@name=\"username\"]").clear();
		
		//Check box enabled or not
		boolean isEnabled = driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[5]/input").isEnabled();
		if(isEnabled)
			System.out.println("Check box Enabled");
		else
			System.out.println("Check box Disabled");
		
		
		driver.close();
	}

}
