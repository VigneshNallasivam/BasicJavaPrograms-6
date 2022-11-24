package com.java.basics;
import java.util.Scanner;
public class StopWatch 
{
    public static void main(String[] args) 
	{
    	Scanner scanner = new Scanner(System.in);
    	
    	long startTime, endTime;
    	double time;
    	
    	System.out.println("Type 'START-1'");
    	String press1 = scanner.next();
    	startTime = System.currentTimeMillis();
    	
    	System.out.println("Type 'STOP-0'");
    	String press0 = scanner.next();
    	endTime = System.currentTimeMillis();
    	
    	time = (endTime-startTime)/1000;
    	System.out.println("Stop-Watch Time Is : " +time);
    	
	}

}
