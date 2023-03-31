package io.turntabl.exchange.clients;

import io.turntabl.exchange.membership.MembershipType;
import io.turntabl.exchange.trading.Trade;

import java.time.LocalTime;

public class Client {
    private String firstName;
    private String lastName;
    private int pointsGained;
    private MembershipType membershipType;

    public Client (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Client() {
        this("","");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPointsGained() {
        return pointsGained;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    private void progressMembership(){
        if(pointsGained >= 1 && pointsGained < 10){
            membershipType = MembershipType.BRONZE;
        } else if (pointsGained >= 10 && pointsGained <= 19){
            membershipType = MembershipType.SILVER;
        } else if (pointsGained >= 20){
            membershipType = MembershipType.GOLD;
        }
    }

    /**
     *  check if client can trade
     *
     * @param totalValue
     * @param numberOfTrades
     * @param timeCreated
     * @return
     */
    public boolean canTrade(double totalValue, int numberOfTrades, LocalTime timeCreated){
        if(membershipType == null){
            return true;
        }

        return switch (membershipType) {
            case BRONZE ->
                    numberOfTrades < membershipType.getMaxTradesPerDay() && timeCreated.isAfter(LocalTime.of(10, 0));
            case SILVER -> numberOfTrades < membershipType.getMaxTradesPerDay() && totalValue < 10_000;
            case GOLD -> numberOfTrades < membershipType.getMaxTradesPerDay();
            default -> false;
        };
    }
}
