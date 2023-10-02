package com.juaracoding.weektwo;

public class BankAccount2 {

    AccountUser nasabah = new AccountUser();

    public void setBankAccount(int a, String n, double amt){
        nasabah.setAcc_no(a);
        nasabah.setAcc_name(n);
        nasabah.setAmount(amt);
    }

    public double deposit(double amt) {
        nasabah.setAmount(nasabah.getAmount() + amt);
        System.out.println(amt + " deposited");
        return nasabah.getAmount();
    }


    public double withdraw(double amt) {
        if (nasabah.getAmount() < amt) {
            System.out.println("Insufficient Balance");
        } else {
            nasabah.setAmount(nasabah.getAmount() - amt);
            System.out.println(amt + " withdrawn");
        }
        return nasabah.getAmount();
    }

    public double checkBalance() {
        System.out.println("Balance is: " + nasabah.getAmount());

        return nasabah.getAmount();
    }

    //TODO
    // - modified display method
    public void display() {
        System.out.println(nasabah.getAcc_no() + " " + nasabah.getAcc_name() + " " + nasabah.getAmount());

    }
}
