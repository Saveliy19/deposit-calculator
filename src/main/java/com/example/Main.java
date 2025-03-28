package com.example;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH)) {
            DepositCalculator depositCalculator = new DepositCalculatorImplementation();
            DepositValidator depositValidator = new DepositValidatorImplementation();

            System.out.print("Enter the deposit amount: ");
            double startAmount = scanner.nextDouble();
            depositValidator.validateDeposit(startAmount);

            System.out.print("Enter the annual rate value as a percentage: ");
            double annualRate = scanner.nextDouble();
            depositValidator.validateRate(annualRate);

            System.out.print("Enter the value of the target coefficient of the deposit increase: ");
            double targetCoefficient = scanner.nextDouble();
            depositValidator.validateCoefficient(targetCoefficient);

            System.out.println(
                    "The deposit amount will increase by " + targetCoefficient + " times" +
                            " in " + depositCalculator.CalculateYearsToAccumulateTargetAmount(
                            startAmount, annualRate, targetCoefficient
                    ) + " years."
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Validation exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Exception: Введены некорректные данные.");
        } catch (Exception e) {
            System.out.println("Unknown exception.");
        }
    }
}