package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPageTwo extends CommonUI{

	
	@FindBy(xpath="//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-success[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-title[1])")
	WebElement textMessage;
	
	public void transferPageTwo() {
		PageFactory.initElements(driver, this);
	}
	
	public String displayedText() {
		return getText(textMessage);
	}
	
	
}
