package com.kkhindigyan.org.service;

import com.kkhindigyan.org.model.Account;
import com.kkhindigyan.org.service.exception.AccountNotFoundException;

public interface AccountService {
	public abstract Account updateAccountBalance(Account account, Long amount) throws AccountNotFoundException;

}