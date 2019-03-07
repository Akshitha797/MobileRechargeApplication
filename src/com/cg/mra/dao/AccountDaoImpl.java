package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao{

	Map<String,Account> accountEntry;
	
	public AccountDaoImpl() {
		accountEntry=new HashMap<>();
		
		accountEntry.put("9010210131",new Account("Prepaid","Vaishali",200));
		accountEntry.put("9823920123",new Account("Prepaid","Megha",453));
		accountEntry.put("9932012345",new Account("Prepaid","Vikas",631));
		accountEntry.put("9010210131",new Account("Prepaid","Anju",521));
		accountEntry.put("9010210131",new Account("Prepaid","Tushar",632));
			
	}
	
		Account account=null;

	public Account getAccountDetails(String mobileNo) {

		int count=0;
		for(Map.Entry<String,Account> m : accountEntry.entrySet()) {

			if(mobileNo.equals(m.getKey())) {
				
				account= m.getValue();
				count++;
				break;
			}
					}
		
		if(count==0) 
			return null;
		else
		return account;
	}

	@Override
	public int rechargeAmount(String mobileNo, double rechargeAmount) {
		int count=0;
		for(Map.Entry<String,Account> m:accountEntry.entrySet()) {
			
			if(mobileNo.equals(m.getKey())) {
				
				account= m.getValue();
				account.setAccountBalance(account.getAccountBalance()+rechargeAmount);
				count++;
				break;
			}
			
		}
		
		accountEntry.put(mobileNo,new Account(account.getAccountType(),account.getCustomerName(),account.getAccountBalance()));
		
		if(count==0)
			return 0;
		else
		return (int)account.getAccountBalance();
	}

}
