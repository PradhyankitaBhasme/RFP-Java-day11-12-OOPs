package com.bridgelabz.stockaccountmanagement;

public class AccountTest {
    public static void main(String[] args) {
        StockAccount account=new StockAccount();
        account.accountBalance=50000;
        account.debit(55000);
    }
}
