package com.practice.designPattern.behavioural.strategyPattern;

public class StrategyDemo {
    public static void main(String[] args) {

        PaymentContext creditCardPayment =
                new PaymentContext(new CreditCardPayment());
        creditCardPayment.payAmount(500);

        PaymentContext upiPayment =
                new PaymentContext(new UpiPayment());
        upiPayment.payAmount(300);
    }
}