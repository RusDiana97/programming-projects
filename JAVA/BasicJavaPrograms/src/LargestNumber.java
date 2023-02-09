// Find the largest number of three numbers
// 
// EXAMPLE
// Input: 2 9 64
// Output: 64

import java.util.Scanner; // class for reading an input (of the primitive types like int, double, etc. and strings)

public class LargestNumber {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Let's find out what is the largest number of three numbers!");
		
		
		System.out.println("Enter the first number: ");
		a = read.nextInt(); // 60
		
		System.out.println("Enter the second number: ");
		b = read.nextInt(); // 25
		
		System.out.println("Enter the third number: ");
		c = read.nextInt(); // 100
		
		
		if(a > b && a > c) {
			System.out.println("Your first number is the largest.");
		} else if(b > a && b > c) {
			System.out.println("Your second number is the largest.");
		} else if (c > a && c > b) {
			System.out.println("Your third number is the largest.");
		} else {
			System.out.println("Your numbers are equals.");
		}
		
		/* 
		 * OUTPUT: 
		 * Your third number is the largest.
	    */

	}

}
