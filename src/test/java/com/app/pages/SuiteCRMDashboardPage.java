package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.step_definitions.CreateTask;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

public class SuiteCRMDashboardPage {
	
	private WebDriver driver;
	
	public SuiteCRMDashboardPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "SALES")
	public WebElement sales;
	
	@FindBy(linkText = "MARKETING")
	public WebElement marketing;
	
	@FindBy(linkText = "SUPPORT")
	public WebElement support;
	
	@FindBy(linkText = "ACTIVITIES")
	public WebElement activities;
	
	@FindBy(linkText = "COLLABORATION")
	public WebElement collaboration;
	
	@FindBy(linkText = "ALL")
	public WebElement all;
	
	@FindBy(xpath = "//input[contains(@title,'Post Status Update')]")
	public WebElement postField;
	
	@FindBy(xpath = "//div[@class='dashletNonTable']//input[@value='Post']")
	public WebElement postButton;
	
	@FindBy(id = "with-label")
	public WebElement profileMenu;
	
	@FindBy(xpath = "(//*[@id=\"logout_link\"])[3]")
	public WebElement logoutLink;
	
	@FindBy(xpath = "(//button[@id='searchbutton'])[3]")
	public WebElement searchbutton;
	
	@FindBy(xpath = "(//input[@id='query_string'])[5]")
	public WebElement searchField;
	
	@FindBy(linkText = "Contacts")
	public WebElement contacts;
	
	@FindBy(linkText = "CREATE")
	public WebElement create;
	
	@FindBy(linkText = "Create Task")
	public WebElement createTask;
	
	public void logout() {
		Actions actions = new Actions(driver);
		actions.moveToElement(profileMenu).perform();
		BrowserUtils.waitForVisibility(logoutLink, 5);
		logoutLink.click();
	}
	
	public void postNote(String note) {
		postField.sendKeys(note);
		postButton.click();
	}

	public void clickCreateTask() {
		Actions actions = new Actions(driver);
		actions.moveToElement(create).perform();
		
		BrowserUtils.waitForVisibility(createTask, 2);
		createTask.click();
	}
	
}
