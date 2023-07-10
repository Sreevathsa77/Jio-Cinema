package Sree.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sree.AbstractComponents.AbstractComponent;

public class SearchBar extends AbstractComponent {
	WebDriver driver;

	public SearchBar(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchInputBox")
	WebElement searchInputBox;
	
	@FindBy(className = "mui-style-dqy2kp-gradient")
	WebElement searchedElement;

	public void searchInputBox(String ele) {
		searchInputBox.sendKeys(ele);
     //   WebElement card = null;
		waitForElementToAppear1(searchInputBox);
		List<WebElement> searchelements = driver.findElements(By.xpath("//div[@class='mui-style-a2m20q-dropdown']"));
		for (WebElement searchelement : searchelements) {
			if (searchelement.getText().equalsIgnoreCase(ele)) {
				searchelement.click();
			//	card = searchelement;
			}
			else 
			{
				System.out.println("Invalid Input");
			}
		}
	}
	
		public void searchedElement() 
		{
			waitForElementToAppear1(searchedElement);
			searchedElement.click();
			
		}

	}


