package com.juaracoding.weektwo;

public class AccountUser {
    private int acc_no;
    private String acc_name;
    private double amount;

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public double getAmount() {
        return amount;
    }

    public String getAcc_name() {
        return acc_name;
    }
}
