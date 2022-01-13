package jss.day1.calculator;

public class MyCalculator implements Calculator {

    @Override
    public float add(float input1, float input2) {
        return input1 + input2;
    }

    @Override
    public float subtract(float input1, float input2) {
        return input1 - input2;
    }

    @Override
    public float divide(float input1, float input2) {
        if (input2 == 0) {
            throw new IllegalArgumentException("divisor can't be zero.");
        }
        return input1 / input2;
    }

    @Override
    public float multiply(float input1, float input2) {
        return input1 * input2;
    }
}