package org.practice.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemosalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").submit();
		
		driver.findElementByXPath("//a[contains(text(),'CRM/')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("test@gmail.com");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(1000);
		//first element
		WebElement firstElement = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a)[1]");
		String leadName = firstElement.getText();
		firstElement.click();
		driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead"))
			System.out.println("Navigated to Duplicate Lead");
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		String duplicatedLead = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(duplicatedLead);
		System.out.println(leadName);
		if(duplicatedLead.contains(leadName))
		{
			System.out.println("Lead duplicated successfully");
		}
		
		driver.close();
	}

}
