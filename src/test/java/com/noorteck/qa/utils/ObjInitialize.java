package com.noorteck.qa.utils;


import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoanPage;
import com.noorteck.qa.pages.TransferPage;


public class ObjInitialize extends Constants {
	
	 
	
	public static void initializeClassObj() {
		//initialize each page class objects here..
		
		homeObj = new HomePage();
		transferObj= new TransferPage();
		loanObj = new LoanPage();
		
	}

}
