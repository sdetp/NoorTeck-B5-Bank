package com.noorteck.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
String url = "https://usdemo.vee24.com/#/transactions";
	
		
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		
		
		initializeClassObj();
		
		bankTestOne();
		bankTestTwo();
		
		CommonUI.quitBrowser();
	}
	
	public static void bankTestOne()  {
		homeObj.clickTransfer();
		transferObj.clickOriginalAccount();
		transferObj.selectRainyDay();
	    
	    transferObj.clickDesAccout();
		transferObj.selectInvestingDesAcc();
		transferObj.enterAmount("1000");
		transferObj.enterSSN("12345677");
		transferObj.enterPin("1235");
		transferObj.clickTransferFunds();
	    System.out.println(transferObj.displayedText());
		
		}
		
	
	
	public static void bankTestTwo() {
		homeObj.clickLoan();
		loanObj.enterName("John Cene");
		loanObj.enterAddress("123 Java drive");
		loanObj.selectLoanType();
		loanObj.clickRetirement();
		loanObj.enterYearsField("2");
		loanObj.clickNext();
		loanObj.enterAmount("5000");
		loanObj.enterMotherName("Kim");
		loanObj.enterSSN("123456778");
		loanObj.clickNextButton();
		loanObj.clickConfirm();
	 //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(loanObj.textConfirm());
		
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/