package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	
	@FindBy(xpath="//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/mat-toolbar[1]/div[3]/ul[1]/li[2]/a[1]")
	WebElement transferTab;
	
	@FindBy(xpath="//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/mat-toolbar[1]/div[3]/ul[1]/li[4]/a[1]")
	WebElement loanTab;
	
	@FindBy(xpath="//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/mat-toolbar[1]/div[3]/ul[1]/li[5]/a[1]")
	WebElement logOutTab;
	
	public void homePage() {
		PageFactory.initElements(driver, this);
		}
	
	public void clickTransfer() {
		click(transferTab);
	}
	
	public void clickLoan() {
		click(loanTab);
	}
	
	public void clickLogOut() {
		click(logOutTab);
	}
	
	
	
	
}
