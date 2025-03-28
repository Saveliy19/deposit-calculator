package com.example;

public class DepositCalculatorImplementation implements DepositCalculator {

    @Override
    public int CalculateYearsToAccumulateTargetAmount(
            double depositAmount
            , double annualRate
            , double targetCoefficient) {

        double yearsToReach = Math.log(targetCoefficient) / Math.log(1 + annualRate / 100);
        return (int) Math.ceil(yearsToReach);
    }
}
