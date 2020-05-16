package org.practice.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class BondButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//Click button
		driver.findElementByXPath("//button[@id='home']").click();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//Get Position
		int x = driver.findElementByXPath("//button[@id='position']").getLocation().x;
		int y = driver.findElementByXPath("//button[@id='position']").getLocation().y;
		System.out.println("Position of button is " + x + ":" + y);
		
		//Get Color 
		String colour  = driver.findElementByXPath("//button[@id='color']").getCssValue("color");
		System.out.println(colour);
		
		//Height & Width
		Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
		System.out.println(size);
		
		driver.close();
		driver.quit();
		

	}

}
