package com.example.payments;

public class FastPayAdapter implements PaymentGateway{
    FastPayClient fp;
    public FastPayAdapter(FastPayClient fp){
        this.fp=fp;
    }
    @Override
    public String charge(String customerId, int amountCents) {
        return fp.payNow(customerId, amountCents);
    }
        
}
