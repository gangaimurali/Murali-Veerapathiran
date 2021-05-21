package week2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();		
		driver.findElementByXPath("//span[text()='Name and ID']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Dhilip");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
		//String LeadName=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		//System.out.println(LeadName);
		
		String title=driver.getTitle();
				driver.findElementByXPath("//a[text()='Edit']").click();
				if(title=="opentaps CRM");{
				driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
				driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("XYZ Company (P) Ltd");
				driver.findElementByXPath("//input[@value='Update']").click();
		

	}

}
}
