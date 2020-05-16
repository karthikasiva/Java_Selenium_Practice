package org.practice.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeads {

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
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Santhosh");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(1000);
		//first element
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		String title = driver.getTitle();
		if(title.contains("View Lead"))
		{
			System.out.println("Navigated to view lead page");
		}
		
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
		WebElement companyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		companyName.clear();
		companyName.sendKeys("tcs");
		driver.findElementByXPath("//input[@name='submitButton' and @value='Update']").submit();
		String updatedName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		if(updatedName.startsWith("tcs"))
		{
			System.out.println("Company Name updated successfully");
		}
		
		driver.close();
	
	}

}
