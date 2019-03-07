package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{

	AccountDao accountDao=new AccountDaoImpl();
	Account account=null;
	@Override
	public Account getAccountDetails(String mobileNo) {
		
		Account account=accountDao.getAccountDetails(mobileNo);
		return account;
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		
		int balance=accountDao.rechargeAmount(mobileNo, rechargeAmount);
		return balance;
	}

}
