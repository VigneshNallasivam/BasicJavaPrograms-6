package com.java.basics;
import java.util.Scanner;
public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		int number1,number2,number3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to be Cailculating for Fibonacci : ");
		int count = scanner.nextInt();
		
		number1 = 0;
		number2 = 1;
		System.out.println("The Fibonacci Series for Number :" +count +" Is : ");
		System.out.println(number1);
		System.out.println(number2);
		
		for(int i=2;i<count;i++)
		{
		    number3 = number1 + number2;
			System.out.println(number3);
			number1 = number2;
			number2 = number3;
		}
		

	}

}
