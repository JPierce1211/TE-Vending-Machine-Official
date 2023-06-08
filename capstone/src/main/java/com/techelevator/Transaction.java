package com.techelevator;

public class Transaction {
    private String paymentMethod;
    private int differenceAmount;
    private String message;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getDifferenceAmount() {
        return differenceAmount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
