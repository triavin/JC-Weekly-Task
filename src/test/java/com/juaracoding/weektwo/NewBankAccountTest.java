package com.juaracoding.weektwo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewBankAccountTest {
    public BankAccount2 bankAccount2;
    String name;
    double wdAmount,dpAmount;
    // membuat method untuk pengujian
    @BeforeMethod
    public void testBankAccount(){
        bankAccount2 = new BankAccount2();
        name = "aldi";
        wdAmount = 100;
        dpAmount = 500;
        bankAccount2.setBankAccount(1,name,5000);
    }
    @Test
    public void testWithdrawBankAccount(){
        Assert.assertEquals(bankAccount2.withdraw(wdAmount),bankAccount2.nasabah.getAmount());
    }
    @Test
    public void testDepositBankAccount(){
        Assert.assertEquals(bankAccount2.deposit(dpAmount),bankAccount2.nasabah.getAmount());
    }
    @Test
    public void testCekBalanceBankAccount(){
        Assert.assertEquals(bankAccount2.checkBalance(), bankAccount2.nasabah.getAmount());
    }

    //TODO:
    // -add Test for display
}
