package com.example;

public interface DepositValidator {
    void validateDeposit(double amount) throws IllegalArgumentException;
    void validateRate(double rate) throws IllegalArgumentException;
    void validateCoefficient(double coefficient) throws IllegalArgumentException;
}
