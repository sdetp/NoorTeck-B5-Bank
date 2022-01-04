package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {

	
	@FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[1]")
	WebElement originalAccountDropdown;
	
	@FindBy(id="mat-option-2")
	WebElement personalOption;
	
	@FindBy(id="mat-option-3")
	WebElement investingOption;
	
	@FindBy(id="mat-option-4")
	WebElement retirementOption;
	
	@FindBy(xpath="(//mat-option[@id='mat-option-5'])[1]")
	WebElement rainyDayOption;
	
	@FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[2]")
	WebElement destinationAccoutDropdown;
	
	@FindBy(id="mat-option-6")
	WebElement personalDesOption;
	
	@FindBy(id="mat-option-7")
	WebElement investingDesOption;
	
	@FindBy(id="mat-option-8")
	WebElement retirementDesOption;
	
	@FindBy(id="mat-option-9")
	WebElement rainyDayDesOption;
	
	@FindBy(id="mat-input-0")
	WebElement amountField;
	
	@FindBy(id="mat-input-1")
	WebElement ssnField;
	
	@FindBy(id="mat-input-2")
	WebElement atmPinField;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement transferFundsButton;
	
	@FindBy(xpath="//mat-card-title[@class='mat-card-title']")
	WebElement textMessage;
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOriginalAccount() {
		click(originalAccountDropdown);
	}
	
	
	public void selectPersonal() {
		moveToElementAndClick( personalOption);
	}
	
	public void selectInvesting() {
		moveToElementAndClick(investingOption);
	}
	
	public void selectRetirement() {
		moveToElementAndClick(retirementOption);
	}
	
	public void selectRainyDay() {
		moveToElementAndClick(rainyDayOption);
	}
	
	public void clickDesAccout() {
		click(destinationAccoutDropdown);
	}
	public void selectPersonalDesAcc() {
		moveToElementAndClick(personalDesOption);
	}
	
	public void selectInvestingDesAcc() {
		moveToElementAndClick(investingDesOption);
	}
	
	public void selectRetirementDesAcc() {
		moveToElementAndClick(retirementDesOption);
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
	
	public String displayedText() {
		return getText(textMessage);
		
	}
	
}
