package org.practice.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Initial {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Login
//		driver.findElementById("username").sendKeys("DemosalesManager");
//		driver.findElementById("password").sendKeys("crmsfa");
//		driver.findElementByClassName("decorativeSubmit").submit();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemosalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").submit();


		
		//Create Lead
//		driver.findElementByLinkText("CRM/SFA").click();
//		driver.findElementByLinkText("Leads").click();
//		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM/')]").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();

		Thread.sleep(2000);
//
////		driver.findElementByName("companyName").sendKeys("TestLeaf");
////		driver.findElementByName("firstName").sendKeys("Karthika");
////		driver.findElementByName("lastName").sendKeys("S");
//		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
//		driver.findElementById("createLeadForm_firstName").sendKeys("Test");
//		driver.findElementById("createLeadForm_lastName").sendKeys("Leaf");
//		
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TestLeaf");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("karthika");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("siva");
	
//		//DropDown
//		WebElement sourceElement = driver.findElementById("createLeadForm_dataSourceId");
		WebElement sourceElement = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dropDown1 = new Select(sourceElement);
		dropDown1.selectByVisibleText("Conference");
		Thread.sleep(2000);

//		WebElement industryElement = driver.findElementById("createLeadForm_industryEnumId");
		WebElement industryElement = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select dropDown2 = new Select(industryElement);
		dropDown2.selectByValue("IND_DISTRIBUTION");
		Thread.sleep(2000);

//		WebElement ownershipElement = driver.findElementById("createLeadForm_ownershipEnumId");
		WebElement ownershipElement = driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select dropDown3 = new Select(ownershipElement);
		dropDown3.selectByIndex(2);
		Thread.sleep(2000);

//		driver.findElementByClassName("smallSubmit").submit();	
		driver.findElementByXPath("//input[@name='submitButton']").submit();
		Thread.sleep(5000);
//		
		//View Lead
				String title = driver.getTitle();
				if(title.contains("View Lead"))
				{
					System.out.println("Title verified");
				}
				else
				{
					System.out.println("Title wrong :" + title);
				}
				
				//Check Lead name created
				//String companyName = driver.findElementById("viewLead_companyName_sp").getText();
				String companyName = driver.findElementByXPath("//span[@id=\"viewLead_companyName_sp\"]").getText();

				if(companyName.contains("TestLeaf"))
				{
					System.out.println("CompanyName created properly");
				}

		driver.close();
		driver.quit();
	}

}
