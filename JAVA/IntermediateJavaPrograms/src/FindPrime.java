// find the prime number from a given range

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		
		int lowerLimit, upperLimit;
		int isPrime = 0;
		int i, d;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a lower and an upper limit for finding the prime numbers between them.");
		
		System.out.println("Lower limit is: ");
		lowerLimit = s.nextInt();
		
		System.out.println("Upper limit is: ");
		upperLimit = s.nextInt();
		
		System.out.println("The prime numbers between " + lowerLimit + " and " + upperLimit + " are: ");
		
		for(i = lowerLimit; i <= upperLimit; i++) {
			
			// 2 is the single even prime num
			if(i == 2) {
				isPrime = 1;
			}
			
			for(d = 2; i > d; d++) {
				if(i % d == 0) {
					isPrime = 0; // not prime
					break;
				} else {
					isPrime = 1; // prime
				}
			}
			
			if(isPrime == 1) {
				System.out.println(i); // print the prime numbers
			}
		}

	}

}
