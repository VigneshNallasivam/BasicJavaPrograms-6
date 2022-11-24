package com.java.basics;
import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String[] args)
	{
		long number;
		long sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		number = scanner.nextLong();
		int i=1;
		
		while(i <= number/2)
		{
			if(number % i == 0)
			{
				sum = sum+i;
			}
			i++;
		}
		
		if(sum==number)
			System.out.println(number+ " Is a Perfect Number");
		else
			System.out.println(number+ " Is NOT a Perfect Number");
		
	}
}




