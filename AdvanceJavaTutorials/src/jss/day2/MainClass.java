/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2;

import jss.day1.calculator.CalculatorFactory;
import jss.day1.calculator.Calculator;

/**
 *
 * @author Jayasankar
 */
public class MainClass extends CalculatorFactory{
	
	public static void main(String args[])
	{
		Calculator calc = getInstance();
		//Calculator calcsum = sum(10,20);
		
		System.out.println("ADD TWO NUMBERS 10,12 :"+String.valueOf(calc.add(10, 12)));
		System.out.println("SUB TWO NUMBERS 30,12 :"+String.valueOf(calc.subtract(30, 12)));
		System.out.println("DIV TWO NUMBERS 10,7 :"+String.valueOf(calc.divide(10, 7)));
		System.out.println("MUL TWO NUMBERS 5,8 :"+String.valueOf(calc.multiply(5, 8)));
		
	

	}

}
