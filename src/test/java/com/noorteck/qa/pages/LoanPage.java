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
	
	@FindBy(id="mat-input-6")
	WebElement amountField;
	
	@FindBy(id="mat-input-7")
	WebElement mothersNameField;
	
	
	@FindBy(id="mat-input-8")
	WebElement ssnField;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement backButton;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement next;
	
	@FindBy(css=".v24DomSyncDenyAgent.mat-raised-button.mat-primary")
	WebElement confirmButton;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement back;
	
	@FindBy(xpath="(//button[@class='mat-button'])[5]")
	WebElement resetButton;
	
	@FindBy(xpath="//mat-card-title[@class='mat-card-title']")
	WebElement textTitle;
	
	
	public LoanPage() {

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
		moveToElementAndClick(personalOption);
	}
	
	public void clickInvesting() {
		moveToElementAndClick(investingOption);
	}
	
	public void clickRetirement() {
		moveToElementAndClick(retirementOption);
	}
	
	public void clickRainyDay() {
		moveToElementAndClick(rainyDayOption);
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
