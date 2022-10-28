package edu.wit.cs.comp1000;
import java.util.Scanner;

public class PA1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total_inches;
		System.out.printf("Enter Total Inches");
		total_inches = input.nextInt();
		
		int yards = total_inches/36;
		int inchesf = (total_inches%36);
        int feet = (inchesf/12);
        int inchest = (inchesf%12);
        
        System.out.printf("total number of yards:%d%n",+ yards );
        System.out.printf("total number of feet:%d%n",+feet);
        
        int Inches;
        System.out.printf("total number of inches:%d%n", +inchest);
        Inches = input.nextInt();
        
        int Final_Values;
        
        Final_Values = (total_inches / yards *36+feet*12 +Inches*1);
        System.out.printf ("The final value is %d%n", Final_Values);
        
		
		
		
		
		
		
		
		
		
	





	}


// TODO: document this class


	// TODO: document this function
	
		// TODO: write your code here
	}


