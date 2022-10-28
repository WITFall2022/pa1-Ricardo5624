package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
	
	int a, b, c;	
	double average;
	
	System.out. printf("Enter three intergers; ");
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	average = (a + b + c) / 3.0;
	System.out.printf("The average is %f%n", average);

		// TODO: write your code here
	}

}
