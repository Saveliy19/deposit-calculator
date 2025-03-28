# Deposit-Calculator

Приоложение для расчета времени в годах, необходимого для достижения вкладом указанной кратности.

## Запуск приложения

Для запуска приложения понадобится:

- Java 11 и выше
- maven 3.6.3 и выше

```bash
git clone https://github.com/Saveliy19/deposit-calculator.git
mvn clean package
java -jar target/deposit-calculator-1.0-SNAPSHOT.jar
```

## Пример работы приложения

```bash
java -jar target/deposit-calculator-1.0-SNAPSHOT.jar
Enter the deposit amount: 300
Enter the annual rate value as a percentage: 10
Enter the value of the target coefficient of the deposit increase: 2
The deposit amount will increase by 2.0 times in 8 years.

```