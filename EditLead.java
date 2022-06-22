package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement clickButton = driver.findElement(By.className("decorativeSubmit"));
		clickButton.click();	
		WebElement clickLeads = driver.findElement(By.linkText("CRM/SFA"));
		clickLeads.click();
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
		WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocalElement.sendKeys("NaliniP");
		WebElement departmentElement = driver.findElement(By.name("departmentName"));
		departmentElement.sendKeys("sociology");
		WebElement descriptionElement = driver.findElement(By.name("description"));
		descriptionElement.sendKeys("Hello World");
		WebElement emailIdEleement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailIdEleement.sendKeys("nalini.pattabiram@gmail.com");
		
		WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stategdd = new Select(stateDropDown);
		stategdd.selectByIndex(16);
		
		WebElement submitElement =  driver.findElement(By.name("submitButton"));
		submitElement.click();
		
		WebElement editElement = driver.findElement(By.linkText("Edit"));
		editElement.click();
		
		WebElement clearTextElement = driver.findElement(By.id("updateLeadForm_description"));
		clearTextElement.clear();
		
		WebElement importantNoteElement = driver.findElement(By.id("updateLeadForm_importantNote"));
		importantNoteElement.sendKeys("Hello Important Note tab");
		
		WebElement updateElement = driver.findElement(By.name("submitButton"));
		updateElement.click();

		System.out.println("The Tile is: " + driver.getTitle());
		driver.close();
		}	
		
		
	}


