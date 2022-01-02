package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoanPage extends CommonUI {

	@FindBy(id="//input[@id='mat-input-0']")
	WebElement nameField;
	
	@FindBy(id="mat-input-1")
	WebElement addressField;
	
	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	WebElement loanTypeDropdown;
	
	@FindBy(css="#mat-option-1")
	WebElement personalOption;
	
	@FindBy(css="#mat-option-2")
	WebElement investingOption;
	
	@FindBy(css="#mat-option-3")
	WebElement retirementOption;
	
	@FindBy(css="#mat-option-4")
	WebElement rainyDayOption;
	
	@FindBy(id="mat-input-2")
	WebElement yearsField;
	
	@FindBy(xpath="//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/button[1]")
	WebElement nextButton;
	
	@FindBy(id="mat-input-9")
	WebElement amountField;
	
	@FindBy(id="mat-input-10")
	WebElement mothersNameField;
	
	
	@FindBy(id="mat-input-11")
	WebElement ssnField;
	
	@FindBy(css="mat-sidenav-container.all-wrap.mat-drawer-container.mat-sidenav-container mat-sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5) app-loans.ng-star-inserted:nth-child(2) div.content:nth-child(2) div.container:nth-child(2) mat-horizontal-stepper.mat-stepper-horizontal.ng-tns-c11-10 div.mat-horizontal-content-container div.mat-horizontal-stepper-content.ng-trigger.ng-trigger-stepTransition.ng-tns-c11-10.ng-star-inserted:nth-child(2) form.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted div:nth-child(6) > button.mat-button:nth-child(1)")
	WebElement backButton;
	
	@FindBy(css="mat-sidenav-container.all-wrap.mat-drawer-container.mat-sidenav-container mat-sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5) app-loans.ng-star-inserted:nth-child(2) div.content:nth-child(2) div.container:nth-child(2) mat-horizontal-stepper.mat-stepper-horizontal.ng-tns-c11-10 div.mat-horizontal-content-container div.mat-horizontal-stepper-content.ng-trigger.ng-trigger-stepTransition.ng-tns-c11-10.ng-star-inserted:nth-child(2) form.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted div:nth-child(6) > button.mat-button:nth-child(2)")
	WebElement next;
	
	@FindBy(className="//button[@class='v24DomSyncDenyAgent mat-raised-button mat-primary']")
	WebElement confirmButton;
	
	@FindBy(css="mat-sidenav-container.all-wrap.mat-drawer-container.mat-sidenav-container mat-sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5) app-loans.ng-star-inserted:nth-child(2) div.content:nth-child(2) div.container:nth-child(2) mat-horizontal-stepper.mat-stepper-horizontal.ng-tns-c11-10 div.mat-horizontal-content-container div.mat-horizontal-stepper-content.ng-trigger.ng-trigger-stepTransition.ng-tns-c11-10.ng-star-inserted:nth-child(3) div.ng-star-inserted:nth-child(2) > button.mat-button:nth-child(2)")
	WebElement back;
	
	@FindBy(css="mat-sidenav-container.all-wrap.mat-drawer-container.mat-sidenav-container mat-sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5) app-loans.ng-star-inserted:nth-child(2) div.content:nth-child(2) div.container:nth-child(2) mat-horizontal-stepper.mat-stepper-horizontal.ng-tns-c11-10 div.mat-horizontal-content-container div.mat-horizontal-stepper-content.ng-trigger.ng-trigger-stepTransition.ng-tns-c11-10.ng-star-inserted:nth-child(3) div.ng-star-inserted:nth-child(2) > button.mat-button:nth-child(3)")
	WebElement resetButton;
	
	@FindBy(css="mat-sidenav-container.all-wrap.mat-drawer-container.mat-sidenav-container mat-sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5) app-loan-success.ng-star-inserted:nth-child(2) div.container:nth-child(2) div.container div.content mat-card.card.mat-card > mat-card-title.mat-card-title")
	WebElement textTitle;
	
	
	
	
	public void loanPage() {

		PageFactory.initElements(driver, this);
		}
	
	public void enterName(String name) {
		enter(nameField, name);
	}
	
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	
	public void selectLoanType() {
		click(loanTypeDropdown);
	}
	
	public void clickPersonal() {
		click(personalOption);
	}
	
	public void clickInvesting() {
		click(investingOption);
	}
	
	public void clickRetirement() {
		click(retirementOption);
	}
	
	public void clickRainyDay() {
		click(rainyDayOption);
	}
	
	public void enterYearsField(String year) {
		enter(yearsField,year);
	}
	
	public void clickNext() {
		click(nextButton);
	}
	
	public void enterAmount(String amount) {
		enter(amountField, amount);
	}
	
	public void enterMotherName(String motherName) {
		enter(mothersNameField, motherName);
	}
	
	public void enterSSN(String ssn) {
		enter(ssnField, ssn);
	}
	
	public void clickBack() {
		click(backButton);
	}
	
	public void clickNextButton() {
		click(next);
	}
	
	public void clickConfirm() {
		click(confirmButton);
	}
	
	public void clickBackButton() {
		click(back);
	}
	
	public void clickReset() {
		click(resetButton);
	}
	
	public String textConfirm() {
		return textTitle.getText();
	}
}
