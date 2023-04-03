package io.turntabl.exchange.trading;

import io.turntabl.exchange.exceptions.TooManyTradesException;

public class Trader {
    private String name;
    private Account account;

    public Trader(String name, Account account){
        this.account = account;
        this.name = name;
    }

    public Trader(){
        this("", null);
    }

    public boolean addTrade(Trade trade) throws TooManyTradesException {
        this.account.addTradeToList(trade);
        return true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
