package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoanPage;
import com.noorteck.qa.pages.TransferPage;
import com.noorteck.qa.pages.TransferPageTwo;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public WebDriver driver;
	
	//declare class objects and common objects
	
	public HomePage homeObj;
	public TransferPage transferObj;
	public LoanPage loanObj;
    public TransferPageTwo transferTwoObj;
}
