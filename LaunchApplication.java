package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str="Leaftaps - TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.close();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String title =driver.getTitle();
		if(str==title);
		{
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC Limited");
		driver.findElementById("createLeadForm_firstName").sendKeys("Murali");
		driver.findElementById("createLeadForm_lastName").sendKeys("Veerapathiran");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select src=new Select(source);
		src.selectByIndex(3);
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mc=new Select(market);
		mc.selectByIndex(3);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Murali");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Veerapathiran");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_birthDate").sendKeys("8/3/85");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Tester");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("50000.00");
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select cur=new Select(currency);
		cur.selectByIndex(70);
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select ind=new Select(industry);
		ind.selectByIndex(7);
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
		WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select own=new Select(owner);
		own.selectByIndex(1);
		driver.findElementById("createLeadForm_sicCode").sendKeys("SIC12345");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("SVG");
		driver.findElementById("createLeadForm_description").sendKeys("Sample Description");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Sample Note");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(5000);
		driver.close();
			
		}
		//driver.findElementByClassName("smallSubmit").click();
		
		

	}

}
