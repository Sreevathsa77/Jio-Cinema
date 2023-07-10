package Sree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sree.AbstractComponents.AbstractComponent;

public class Content_Play extends AbstractComponent{
	
	WebDriver driver;

	public Content_Play(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='mui-style-43fto2-controlWrapper']/descendant::h5)[1]")
	WebElement ageRating;
	
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item mui-style-1wxaqej']//p[contains(text(),'Crime')]")
	WebElement contentDescriptor;
	
     @FindBy(xpath = "//button[@aria-label='Skip']")
     WebElement maximise;
     
     @FindBy(xpath = "(//button[@class='mui-style-zm1ocy-fullscreenBtn'])[2]")
     WebElement minimise;
     
     @FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-heading3Bold mui-style-18ah6rt']")
     WebElement jioHome;
	
	public void Jonner()
	{
		waitForElementToAppear1(ageRating);
		System.out.println(ageRating.getText() + "\n" + contentDescriptor.getText());
	}
	
	public void Play() {
		maximise.click();
		minimise.click();
		jioHome.click();
	}
}
