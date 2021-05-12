package com.kkhindigyan.org.model;

public class Account {

	private String accountNumber;
	private String accountDescription;
	
	public Account(String accountNumber, String accountDescription) {
		this.accountNumber = accountNumber;
		this.accountDescription = accountDescription;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountDescription() {
		return accountDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountDescription == null) ? 0 : accountDescription.hashCode());
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountDescription == null) {
			if (other.accountDescription != null)
				return false;
		} else if (!accountDescription.equals(other.accountDescription))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountDescription=" + accountDescription + "]";
	}
}