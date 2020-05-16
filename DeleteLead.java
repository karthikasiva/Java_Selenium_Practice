package org.practice.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99999");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(1000);
		//first element
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.findElementByXPath("//a[contains(text(),'Delete')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99999");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		//No element check
		Thread.sleep(1000);
		boolean noElement = driver.findElementByXPath("//div[contains(text(),'No records to display')]").isDisplayed();
		if(noElement)
			System.out.println("Lead deleted successfully");
		else
			System.out.println("Lead not deleted");
		
		driver.close();

	}

}
