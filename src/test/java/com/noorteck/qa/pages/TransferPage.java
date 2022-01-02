package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {

	
	@FindBy(xpath="//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-transfers[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	WebElement originalAccountDropdown;
	
	@FindBy(id="mat-option-2")
	WebElement personalOption;
	
	@FindBy(id="mat-option-3")
	WebElement investingOption;
	
	@FindBy(id="mat-option-4")
	WebElement retirementOption;
	
	@FindBy(id="mat-option-5")
	WebElement rainyDayOption;
	
	@FindBy(xpath="//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-transfers[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]")
	WebElement destinationAccoutDropdown;
	
	@FindBy(id="mat-option-6")
	WebElement personalDesOption;
	
	@FindBy(id="mat-option-7")
	WebElement investingDesOption;
	
	@FindBy(id="mat-option-8")
	WebElement retirementDesOption;
	
	@FindBy(id="mat-option-9")
	WebElement rainyDayDesOption;
	
	@FindBy(className= "mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored")
	WebElement amountField;
	
	@FindBy(id="mat-input-1")
	WebElement ssnField;
	
	@FindBy(id="mat-input-2")
	WebElement atmPinField;
	
	@FindBy(xpath="//button[@class='v24DomSyncDenyAgent mat-raised-button mat-primary']")
	WebElement transferFundsButton;
	
	public void transferPage() {
		PageFactory.initElements(driver, this);
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
	
	public void clickPersonalDesAcc() {
		click(personalDesOption);
	}
	
	public void clickInvestingDesAcc() {
		click(investingDesOption);
	}
	
	public void clickRetirementDesAcc() {
		click(retirementDesOption);
	}
	
	public void clickRainyDayDesAcc() {
		click(rainyDayDesOption);
	}
	
	public void enterAmount(String amout) {
		enter(amountField, amout);
	}
	
	public void enterSSN(String ssn) {
		enter(ssnField, ssn);
	}
	
	public void enterPin(String pin) {
		enter(atmPinField, pin);
	}
	
	public void clickTransferFunds() {
		click(transferFundsButton);
	}
	
}
