package io.turntabl.exchange.membership;


public enum MembershipType {
    BRONZE(5){

    },
    SILVER(10),
    GOLD(20);

    private int maxTradesPerDay;
    private int minPoints;
    MembershipType(){}

    MembershipType(int minPoints, int maxTradesPerDay){
        this.maxTradesPerDay = maxTradesPerDay;
        this.minPoints = minPoints;
    }

    MembershipType(int maxTradesPerDay){
        this(0, maxTradesPerDay);
    }

    public int getMaxTradesPerDay() {
        return maxTradesPerDay;
    }

    public void setMaxTradesPerDay(int maxTradesPerDay) {
        this.maxTradesPerDay = maxTradesPerDay;
    }

    public int getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }
}


