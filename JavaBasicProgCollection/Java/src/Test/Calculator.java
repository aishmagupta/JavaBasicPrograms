package Test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double num1; double num2; double result = 0;
		char operator;

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		num1 = reader.nextDouble();
		num2 = reader.nextDouble();

		System.out.println("Enter an operator (+, -): ");
		operator = reader.next().charAt(0);
		switch(operator) 
		{
		case '+': result = num1 + num2;
		break;

		case '-': result = num1 - num2;
		break;
		}

		System.out.println("The result is : " + result);

	}


}



