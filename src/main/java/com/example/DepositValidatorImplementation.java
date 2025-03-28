package com.example;

public class DepositValidatorImplementation implements DepositValidator {
    @Override
    public void validateDeposit(double deposit) throws IllegalArgumentException {
        if (deposit <= 0) throw new IllegalArgumentException("The deposit amount must be more than 0.");
    }

    @Override
    public void validateRate(double rate) throws IllegalArgumentException {
        if (rate <= 0) throw new IllegalArgumentException("The interest rate on the deposit must be greater than 0.");
    }

    @Override
    public void validateCoefficient(double coefficient) throws IllegalArgumentException {
        if (coefficient < 1) throw new IllegalArgumentException("The coefficient of the deposit increase should be at least 1.");
    }
}
