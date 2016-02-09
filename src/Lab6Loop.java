

/*
    Author: Alina Rozenbaum
    Class: CS 1043
    Professor: Childress
    TA: Rupa Chatterjee
*/

import java.util.Scanner;

public class Lab6Loop
{
	public static void main( String args [] )
	{
		int count = 0;
		double sum = 0.0; //Start the running sum
		double maxV = -Double.MAX_VALUE;
		double minV = Double.MAX_VALUE;
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a test grade or enter stop: ");
		String input = console.next();
		
		while (!input.equalsIgnoreCase("stop"))
		{
			double val = Double.parseDouble(input);
			count++;
			sum += val;
			
			if (val > maxV)
			{
				maxV = val;
			}
			
			if (val < minV)
			{
				minV = val;
			}
			
			System.out.println("Enter a test grade or enter stop: ");
			input = console.next();
		}
	
	System.out.println("The number of test scores is: "+count);
	System.out.println("Total sum of all the test scores: "+sum);
	System.out.println("Average of all the test scores: "+(sum/count));
	System.out.println("The maximum test score is: "+maxV);
	System.out.println("The minimum test score is: "+minV);
	

	}

	
}
