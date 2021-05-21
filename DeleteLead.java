package week2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneCountryCode").sendKeys("91");
		driver.findElementByName("phoneAreaCode").sendKeys("044");
		driver.findElementByName("phoneNumber").sendKeys("9941453278");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		String LeadID=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		int len=LeadID.length();
		String NewID=LeadID.substring(len-6, len-1);
		System.out.println(NewID);
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(NewID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		


	}

}
