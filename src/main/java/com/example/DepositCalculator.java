package com.example;

public interface DepositCalculator {
    int CalculateYearsToAccumulateTargetAmount(double depositAmount, double annualRate, double targetCoefficient);
}
