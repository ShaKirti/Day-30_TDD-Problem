package com.day30.assignment;

public class CabInvoiveGenerator {
    public double calculateFare(double distance, double timeInMin) {

        double totalFare = distance * Constants.RATE_PER_KM
                + timeInMin * Constants.TIME_CHARGE_PER_MIN;

        if (totalFare < Constants.MIN_FARE_AMT) {
            totalFare = Constants.MIN_FARE_AMT;
        }
        return totalFare;
    }
}
