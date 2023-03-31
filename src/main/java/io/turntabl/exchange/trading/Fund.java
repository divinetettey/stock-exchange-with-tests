package io.turntabl.exchange.trading;

public class Fund extends Trade{
    private double rate;

    public Fund() {}

    public Fund(String id, String symbol, int quantity,double price, double rate){
        super(id, symbol,quantity, price);
        this.rate = rate;

    }

    @Override
    public double calcDividend() {
        if(this.rate > 0 && this.rate < 1){
            return this.getPrice() * this.rate;
        }

        return 0.0;
    }
}
