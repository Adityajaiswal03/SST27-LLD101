package com.example.orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines ;
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private final boolean expedited;
    private final String notes;

    private Order(Builder builder){
        this.id = builder.id;
        this.customerEmail = builder.customerEmail;
        this.lines = Collections.unmodifiableList(new ArrayList<>(builder.lines));
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
    }

//    public Order(String id, String customerEmail, Integer discountPercent) {
//        this(id, customerEmail);
//        this.discountPercent = discountPercent;
//    }

//    public void addLine(OrderLine line) { lines.add(line); }
//    public void setDiscountPercent(Integer discountPercent) { this.discountPercent = discountPercent; }
//    public void setExpedited(boolean expedited) { this.expedited = expedited; }
//    public void setNotes(String notes) { this.notes = notes; }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return lines; } // leaks internal list
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }
    public static class Builder{
        public String id;
        public String customerEmail;
        public List<OrderLine> lines;
        public Integer discountPercent; // 0..100 expected, but not enforced
        public boolean expedited;
        public String notes;
        public Builder(String id, String customerEmail){
            this.id = id;
            this.customerEmail = customerEmail;
            this.lines = new ArrayList<>();
        }
        public Builder addLine(OrderLine line) {
            this.lines.add(line);
            return this;
        }
        public Builder setDiscountPercent(Integer discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }
        public Builder setExpedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }
        public Builder setNotes(String notes) {
            this.notes = notes;
            return this;
        }
        public Order build(){
            return new Order(this);
        }


    }
}
