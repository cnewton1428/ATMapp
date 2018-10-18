package com.company;

public class Account{

    private String accountNumber;
    private String userName;
    private Double balance;
    private String PIN;
    private double deposit;
    private double withdrawal;

    public Account() {
    }

    public Account(String accountNumber, String userName, Double balance, String PIN) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = balance;
        this.PIN = PIN;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
//    public double getvalue() {
//        double value = deposit += balance;
//        return value;
//    }
//
//    public double getremainder() {
//        double remainder = balance - withdrawal;
//        return remainder;
//    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }
}
