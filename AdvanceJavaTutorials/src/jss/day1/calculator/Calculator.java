package jss.day1.calculator;

public interface Calculator {
	
	 public static Calculator getInstance() {
	        return new MyCalculator();
	    }
	
	float add(float input1, float input2);

	float subtract(float input1, float input2);

	float divide(float input1, float input2);

	float multiply(float input1, float input2);


}
