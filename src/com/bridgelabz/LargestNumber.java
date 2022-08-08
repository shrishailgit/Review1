package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {

	public static int largest(int first, int second, int third) 
	{ 
		
		int max = first;
	
	if (second > max)
	{ 
		max = second; 
		} 
	
	if (third > max)
	
	{ 
		max = third; }  
	
	return max; 
	}  

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LargestNumber largestNumber = new LargestNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" largest Among three numbers"); 
		System.out.println("Please enter first number :"); 
		int first = scanner.nextInt();  
		System.out.println("Please enter second number :");
		int second = scanner.nextInt(); 
		System.out.println("Please enter third number :");
		int third = scanner.nextInt(); 
		int largest = largest (first, second, third); 
		
		
		System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);

		scanner.close();

		
		
	}

}
