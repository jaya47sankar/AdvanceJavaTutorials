package jss.day1.calculator;

public abstract class CalculatorFactory {

    public static Calculator getInstance() {
        return new MyCalculator();
    }
}