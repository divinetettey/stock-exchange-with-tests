package io.turntabl.exchange.trading;

import io.turntabl.exchange.exceptions.TooManyTradesException;
import io.turntabl.exchange.trading.Trade;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private double totalTradeValue;
    private List<Trade> trades;

    public Account(List<Trade> trades){
        this.trades = trades;
    }

    public Account(){
        this(new ArrayList<>());
    }

    public double getTotalTradeValue() {
        return totalTradeValue;
    }

    public void setTotalTradeValue(double newTradeValue) {
        this.totalTradeValue += newTradeValue;
    }

    public void addTradeToList(Trade trade) throws TooManyTradesException {
        if(trades == null){
            trades = new ArrayList<>();
        }

        //check if client can trade before throwing exception
        this.setTotalTradeValue(trade.getPrice() * trade.getQuantity());

    }
}
