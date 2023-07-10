package Sree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sree.AbstractComponents.AbstractComponent;

public class contentCard extends AbstractComponent {
	WebDriver driver;

	public contentCard(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='mui-style-m2ve6n-aboutContainer1']//h1[@class='MuiTypography-root MuiTypography-heading1Black mui-style-4d5b02-title']")
	WebElement Title;

	@FindBy(xpath = "//p[@cursor='pointer']")
	WebElement watch;

	public void contentPage() {
		waitForElementToAppear1(Title);
		System.out.println(Title.getText());
	}

	public void watch() {
		waitForElementToAppear1(watch);
		watch.click();
	}

}
