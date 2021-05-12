package com.kkhindigyan.org.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kkhindigyan.org.model.Account;
import com.kkhindigyan.org.service.AccountService;
import com.kkhindigyan.org.service.exception.AccountNotFoundException;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	private static List<Account> accountList = null;
	static {
		accountList = new ArrayList<Account>();
		accountList.add(new Account("6770865432", "Money tranfer"));
		accountList.add(new Account("6770865400", "Money tranfer"));
	}
	
	@Override
	public Account updateAccountBalance(Account account,Long amount) throws AccountNotFoundException{
		if(accountList.contains(account)) {
			System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
			return account;
		}else {
			throw new AccountNotFoundException("Account Not Found!!");
		}
	}
}
