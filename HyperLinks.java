package org.practice.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {
	
	public static void main(String args[]) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		String link = driver.findElementByXPath("//a[@href=\"Button.html\"]").getAttribute("href");
		System.out.println(link);
		
		Thread.sleep(1000);

		WebElement brokenLink = driver.findElementByLinkText("Verify am I broken?");
		brokenLink.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		Thread.sleep(1000);


		driver.findElementByXPath("(//a[contains(text(),'Go to Home Page')])[2]").click();
		driver.navigate().back();

		int size = driver.findElementsByXPath("//a[@href]").size();
		System.out.println(size);
		
		driver.close();
		
		
	}

}
