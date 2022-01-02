package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url = "https://usdemo.vee24.com/#/transactions";
	
		CommonUI commonUIObj = new CommonUI();
		
		commonUIObj.openBrowser("chrome");
		commonUIObj.navigate(url);
		
		ObjInitialize initializeObj = new ObjInitialize();
		initializeObj.initializeClassObj();
		BankTest obj = new BankTest();
		
		
	
		
		obj.bankTestOne();
		
		commonUIObj.quitBrowser();
	}
	
	public void bankTestOne() {
		
		homeObj.clickTransfer();
		transferObj.clickRainyDay();
		transferObj.clickInvestingDesAcc();
		transferObj.enterAmount("50000");
		transferObj.enterSSN("123435677");
		transferObj.enterPin("1235");
		transferObj.clickTransferFunds();
		transferTwoObj.displayedText();
		if((transferTwoObj.displayedText()).contains("Success! Funds successfully transferred.")) {
			System.out.println("verified");
		}
		
	}
	
	public void bankTestTwo() {
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
		loanObj.textConfirm();
		if((loanObj.textConfirm()).contains("Submission Success!")) {
			System.out.println("verified text");
		}
		
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