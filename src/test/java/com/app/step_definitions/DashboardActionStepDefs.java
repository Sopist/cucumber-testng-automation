package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import com.app.pages.SuiteCRMContactsPage;
import com.app.pages.SuiteCRMDashboardPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardActionStepDefs {
	
	SuiteCRMDashboardPage dashboardPage = new SuiteCRMDashboardPage();
	SuiteCRMContactsPage contactsPage = new SuiteCRMContactsPage();
	
	@When("^I post \"([^\"]*)\"$")
	public void i_post(String note) {
		dashboardPage.postNote(note);
	}

	@Then("^Post should be displayed$")
	public void post_should_be_displayed() {
		
	}
	
	@Then("^I logout from application$")
	public void i_logout_from_application() {
	    dashboardPage.logout();
	}
	
	@Given("^duplicated contact \"([^\"]*)\" exists$")
	public void duplicated_contact_exists(String arg1) {
	    dashboardPage.sales.click();
	    dashboardPage.contacts.click();
	    contactsPage.crateVCard.click();
	    contactsPage.uploadFile();
	    contactsPage.importVcardButton.click();
	}

	

}
