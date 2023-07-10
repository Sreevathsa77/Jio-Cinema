package Sree.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sree.AbstractComponents.AbstractComponent;

public class Subscribe extends AbstractComponent {
	WebDriver driver;

	public Subscribe(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".mui-style-6zkkmg-subscribeText")
	static WebElement subscriber;

	@FindBy(xpath = "//h1[text()='JioCinema Premium']")
	static WebElement jio_Premium_Heading;

	@FindBy(xpath = "//u[contains(text(),'Apply Promo Code')]")
	static WebElement applyPromoCode;

	@FindBy(xpath = "//span[contains(text(),'Continue and pay')]")
	static WebElement continueAndPay;

	@FindBy(xpath = "//p[contains(text(),'Login Here')]")
	static WebElement loginHere;

	public  void click_subscribe() throws InterruptedException {
		// waitForElementToClickable(subscriber);
		waitForElementToVisible(subscriber);
		subscriber.click();
		waitForElementToVisible(jio_Premium_Heading);
		System.out.println(jio_Premium_Heading.getText());

	}

	public  void promocode() {

		if (applyPromoCode.isDisplayed()) {
			System.out.println("Apply Promo Code field is displayed");
		} else {
			System.out.println("Apply Promo Code field is not displayed");
		}
	}
	
	public  void continueAndPay() {
		if (continueAndPay.isDisplayed()) {
			System.out.println("Pay button is displayed");
		} else {
			System.out.println("Pay button is not displayed");
		}
	}
	

	public  void login() {
		loginHere.click();
	}


}
