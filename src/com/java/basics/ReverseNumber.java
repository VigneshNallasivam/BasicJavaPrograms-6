package com.java.basics;
import java.util.Scanner;
public class ReverseNumber 
{
	   public static void main(String[] args)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = scan.nextInt();
		
		int reverse=0;
		int remainder;
		int temp = number;
		
		while(number>0)
		{
			remainder = number%10;           
			reverse = (reverse*10) + remainder;  
			number = number/10;              
		}
		
		System.out.println("The Reverse of a Number Is : " +reverse);
		}
}

