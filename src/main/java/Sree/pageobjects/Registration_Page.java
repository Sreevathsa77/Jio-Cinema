package Sree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sree.AbstractComponents.AbstractComponent;

public class Registration_Page extends AbstractComponent {
	
	WebDriver driver;

	public Registration_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@placeholder='Your mobile number'])[2]")
	WebElement inputNo;
	
	@FindBy(xpath = "(//div[@class='mui-style-1ja1tam-submit'])[2]")
	WebElement cont;
	
	public void Enter_Mobile_No(String no) throws InterruptedException {
		waitForElementToAppear1(inputNo);
		Thread.sleep(2000);
		inputNo.sendKeys(no);
		cont.click();
	}
	
	public void goTo() {
		driver.navigate().to("https://www.jiocinema.com/");
	}
	
	
	
	

}
