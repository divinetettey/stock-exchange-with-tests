package io.turntabl.exchange;

import io.turntabl.exchange.trading.Trade;

public class Account {
    private double value;
    private Trade[] trades;

    private int tradeIndex;

    public Account(double value, Trade[] trades){
        this.value = value;
        this.trades = trades;
    }

    public Account() {}{

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Trade[] getTrades() {
        return trades;
    }

    public void setTrades(Trade[] trades) {
        this.trades = trades;
    }
}
