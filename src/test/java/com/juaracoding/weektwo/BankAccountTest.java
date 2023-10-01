package com.juaracoding.weektwo;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankAccountTest {
    public BankAccount bankAccount;
    String name;
    double amount,wdAmount,dpAmount;
    // membuat method untuk pengujian
    @BeforeTest
    public void testBankAccount(){
        bankAccount = new BankAccount();
        name = "aldi";
        bankAccount.amount = 1000;
        amount = bankAccount.amount;
        wdAmount = 100;
        dpAmount = 500;
    }
    @Test
    public void testWithdrawBankAccount(){
        Assert.assertEquals(bankAccount.withdraw(wdAmount),bankAccount.amount);
    }@Test
    public void testDepositBankAccount(){
        Assert.assertEquals(bankAccount.deposit(dpAmount),amount+dpAmount);
    }

}
