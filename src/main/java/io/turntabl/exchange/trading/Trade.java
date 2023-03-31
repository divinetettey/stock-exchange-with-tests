package io.turntabl.exchange.trading;

import java.time.LocalDateTime;

public abstract class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;

    private LocalDateTime createdAt;

    public Trade() {}

    /**
     * create a new trade
     * @param id
     * @param symbol
     * @param quantity
     * @param price
     */
    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;

        createdAt = LocalDateTime.now();
    }

    /**
     * create  new trade without a price
     * @param id
     * @param symbol
     * @param quantity
     */
    public Trade(String id, String symbol, int quantity){
        this(id, symbol, quantity, 0.0);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * calculate dividend for trade
     *
     * @return
     */
    public abstract double calcDividend();

    @Override
    public String toString() {
        return "\nTRADE DETAILS "+
                "\nID: " +id+
                "\nSymbol: " + symbol +
                "\nQuantity: " +quantity +
                "\nPrice: " +price +
                "\nCreated At: "+ createdAt.toString();
    }
}
