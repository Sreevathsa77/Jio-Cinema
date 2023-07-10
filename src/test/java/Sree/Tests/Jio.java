package Sree.Tests;

import javax.xml.xpath.XPath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import Sree.pageobjects.Base_Class;
import Sree.pageobjects.Base_Class1;
import Sree.pageobjects.Content_Play;
import Sree.pageobjects.Registration_Page;
import Sree.pageobjects.SearchBar;
import Sree.pageobjects.Subscribe;
import Sree.pageobjects.contentCard;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Jio extends Base_Class{

	@Test(priority = 0)
	public void subscriberPage() throws InterruptedException{	
		Subscribe sub = new Subscribe(driver);	
		sub.click_subscribe();
		sub.promocode();
		sub.continueAndPay();
		sub.login();
	 
	}
	
	@Test(priority = 1)
	public void registration_page() throws InterruptedException {
		Registration_Page regPage = new Registration_Page(driver);
		regPage.Enter_Mobile_No(mobile);
		regPage.goTo();
	}
	
	@Test(priority = 2)
	public void search() {
		SearchBar search = new SearchBar(driver);
		search.searchInputBox(searchItem);
		search.searchedElement();
		
	}
	
	@Test(priority = 3)
	public void contentCard() {
		contentCard cantentCard = new contentCard(driver);
		cantentCard.contentPage();
		cantentCard.watch();
		
	}
	
	@Test(priority = 4)
	public void contentPlay(){
		Content_Play contentPlay = new Content_Play(driver);
		contentPlay.Jonner();
		contentPlay.Play();
		
	}
}
