package com.java.basics;
import java.util.*;
public class PrimeNumber
{
	static boolean isPrime()
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Number : " );
			int num = scan.nextInt();
			
			if(num<=1)                                    //Because '0' & '1' is not a prime number 
				return false;
			else if(num==2)                               //Because '2' is the only Even prime number
				return true;
			else if(num%2==0)                             //Because numbers perfectly divisible by 2(other Even numbers) is not considered,so false 
				return false;
			for(int i=3;i<=Math.sqrt(num);i=i+2)          //For Getting all the Odd Numbers Other than '1'
			{
				if(num%i==0)                              //For filtering out the possibility of odd to odd division
					return false;
			}
			return true;
	}
		
		public static void main(String[] args)
		{
			if(isPrime())
				System.out.println("true! Prime Number");
			else 
				System.out.println("false! Not a Prime Number");
			
			
		}
	}

