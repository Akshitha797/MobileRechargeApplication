package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.EnquiryException;
import com.cg.mra.exception.MobileNoException;
import com.cg.mra.exception.RechargeException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
	
	static AccountService accountService=new AccountServiceImpl();
		
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
	
		while(true) {
			System.out.println("Enter your choice :");
			System.out.println("1.Account Balance Enquiry \n 2.Recharge Amount \n 3.Exit ");
			int ch=s.nextInt();
			
		switch(ch) {
		
		case 1 :System.out.println("Enter Mobile Number :");
		String mobileNo=s.next();
		if(mobileNo.length()==10) {
			Account account=accountService.getAccountDetails(mobileNo);
			if(account!=null)
				System.out.println("Your Current balance is Rs. "+account.getAccountBalance());
			else {
				try {
					throw new EnquiryException();
				} catch (EnquiryException e) {
				
				}			
			}	
		}
		else {
			try {
				throw new MobileNoException();
			} catch (MobileNoException e) {
				
			}
		}
			break;
			
		case 2 : System.out.println("Enter Mobile Number :");
		String mobileNo1=s.next();
		if(mobileNo1.length()==10) {
			Account account1=accountService.getAccountDetails(mobileNo1);
			if(account1!=null) {
				System.out.println("Enter RechargeAmount");
				double rechargeAmount=s.nextDouble();
				int balance=accountService.rechargeAccount(mobileNo1, rechargeAmount);
				System.out.println("Your Account Recharged Successfully");
				System.out.println("Hello "+account1.getCustomerName()+" Available Balance is "+balance);
			}
			else {
				try {
					throw new RechargeException();
				} catch (RechargeException e) {
					
				}	
			}	
		}
		else {
			try {
				throw new MobileNoException();
			} catch (MobileNoException e) {
				
			}
		}
			break;
			
		case 3 : System.exit(0);
						
		default : System.out.println("wrong choice");
		}
		}
		
		}
	
	}


