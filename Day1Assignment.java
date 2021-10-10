package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Assignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
		WebElement fName = driver.findElement(By.id("createLeadForm_firstName"));
		fName.sendKeys("Tamilselvi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raghupathy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Selvi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Raghu");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("testtt");
		driver.findElement(By.name("personalTitle")).sendKeys("MRS");
		driver.findElement(By.name("birthDate")).sendKeys("12/21/87");
		driver.findElement(By.name("generalProfTitle")).sendKeys("MRS");
		driver.findElement(By.name("departmentName")).sendKeys("Technology");
		driver.findElement(By.name("annualRevenue")).sendKeys("2500000");
		driver.findElement(By.name("numberEmployees")).sendKeys("100");
		driver.findElement(By.name("sicCode")).sendKeys("1234");
		driver.findElement(By.name("description")).sendKeys("This is practice assignment");
		driver.findElement(By.name("importantNote")).sendKeys("No important news as of now");
		driver.findElement(By.name("tickerSymbol")).sendKeys("PDDD");
		
		//Contact Information//
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("23782052");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Tamilselvi");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.gmail.com");
		
		//Primary Address//
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Raghupathy");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("DOCTOR");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("FC1/6 Jains Abhineet");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Rajamangalam, Villivakkam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600047");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("3434");
		String firstname = fName.getText();
		System.out.println("FirstName is"+ firstname);
		driver.findElement(By.name("submitButton")).click();
		String i = driver.getTitle();
		System.out.println("Page title is:" +i);
	}

}
