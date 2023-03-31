package io.turntabl.exchange.trading;

public class Bond extends Trade {
    final private double dividend;

    public Bond(String id, String symbol,int quantity, double price, final double dividend){
        super(id, symbol,quantity, price);
        this.dividend = dividend;
    }

    @Override
    public double calcDividend(){
        return this.dividend;
    }

}
