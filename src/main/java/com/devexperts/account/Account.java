package com.devexperts.account;

public class Account {

    private final AccountKey accountKey;
    private final String firstName;
    private final String lastName;
    private volatile Double balance;

    public Account(AccountKey accountKey, String firstName, String lastName, Double balance) {
        this.accountKey = accountKey;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public AccountKey getAccountKey() {
        return accountKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double addedBalance) {
        this.balance += addedBalance;
    }
    
    public void withdraw(Double removedBalance) {
        this.balance -= removedBalance;
    }
}
