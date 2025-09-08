package com.example.payments;

public class SafeCashAdapter implements PaymentGateway{
    SafeCashClient sf;
    SafeCashAdapter(SafeCashClient sf){
        this.sf=sf;
        
    }
    
    @Override
    public String charge(String customerId, int amountCents) {
        SafeCashPayment sp=sf.createPayment(amountCents, customerId);
        return sp.confirm();
    }
    
    
}
