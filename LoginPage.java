package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement usernameElement =driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");
		
		
		WebElement passwordElement =driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement clickElement = driver.findElement(By.className("decorativeSubmit"));
		clickElement.click();
		
		WebElement textElement = driver.findElement(By.linkText("CRM/SFA"));
		textElement.click();
		

		WebElement tabElement = driver.findElement(By.linkText("Leads"));
		tabElement.click();
		
		WebElement formElement = driver.findElement(By.linkText("Create Lead"));
		formElement.click();
		
		WebElement companytnameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companytnameElement.sendKeys("abco");
		
		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys("Nalini");

		
		WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastnameElement.sendKeys("Pattabiram");
		
		
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		sourceDropDown.sendKeys("Tradeshow");
		
			
		WebElement marketingDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingdd = new Select(marketingDropDown);
		marketingdd.selectByIndex(3);
		
		WebElement industryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrydd = new Select (industryDropDown);
		industrydd.selectByVisibleText("Health Care");
		
		WebElement ownershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipdd = new Select (ownershipDropDown);
		ownershipdd.selectByValue("OWN_CCORP");		
		
		WebElement submitElement =  driver.findElement(By.name("submitButton"));
		submitElement.click();
		
		



		
		
		
	}
	

}
