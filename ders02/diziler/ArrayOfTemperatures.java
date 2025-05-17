package ders02.diziler;

import java.util.Scanner;

public class ArrayOfTemperatures {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many temperatures do you have?");
		int size = keyboard.nextInt();
		double[] temperatures = new double[size];
		// Read temperatures and compute their average:
		System.out.println("Enter " + temperatures.length + " temperatures:");
		double sum = 0;
		for (int index = 0; index < temperatures.length; index++) {
			temperatures[index] = keyboard.nextDouble();
			sum = sum + temperatures[index];
		}
		
		double average = sum / temperatures.length;
		System.out.println("The average temperature is " + average);
		// Display each temperature and its relation to the average:
		System.out.println("The temperatures are");
		for (int index = 0; index < temperatures.length; index++) {
			if (temperatures[index] < average)
				System.out.println(temperatures[index] + " below average");
			else if (temperatures[index] > average)
				System.out.println(temperatures[index] + " above average");
			else // temperature[index] == average
				System.out.println(temperatures[index] + " the average");
		}
		System.out.println("Have a nice week.");
	}
}
