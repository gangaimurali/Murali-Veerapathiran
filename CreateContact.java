package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Murali");
		driver.findElementById("lastNameField").sendKeys("Veerapathiran");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Murali");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Veerapathiran");
		driver.findElementById("createContactForm_departmentName").sendKeys("Testing");
		driver.findElementById("createContactForm_description").sendKeys("Sample Description");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("abc@xyz.com");
			WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
			Select st=new Select(state);
			st.selectByVisibleText("New York");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateContactForm_description").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("Sample Important Note");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		String title =driver.getTitle();
		System.out.println(title);
			

	}

}
