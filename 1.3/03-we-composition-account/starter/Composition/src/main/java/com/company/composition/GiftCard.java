package com.company.composition;

public class GiftCard {
    private String cardNumber;
    private float originalAmount;
    private float currentBalance;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(float originalAmount) {
        this.originalAmount = originalAmount;
    }

    public float getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(float currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "GiftCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", originalAmount=" + originalAmount +
                ", currentBalance=" + currentBalance +
                '}';
    }

    public GiftCard(String cardNumber, float originalAmount, float currentBalance) {
        this.cardNumber = cardNumber;
        this.originalAmount = originalAmount;
        this.currentBalance = currentBalance;
    }
}
