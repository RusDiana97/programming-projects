// Read data for a person

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String fname, lname, gender, address, country, email, phone;
		int age;
		
		// input
		System.out.println("Person input data");
		System.out.println("=================");
		
		System.out.println("First name:"); 
		fname = s.nextLine(); // Diana
		
		System.out.println("Last name:");
		lname = s.nextLine(); // Rus
		
		System.out.println("Gender (f/m):");
		gender = s.nextLine(); // f
		
		System.out.println("Age:");
		age = s.nextInt(); // 26
		
		System.out.println("Address:");
		address = s.nextLine(); // Roses no 9
		
		System.out.println("Country:");
		country = s.nextLine(); // Romania
	
		System.out.println("Email:");
		email = s.nextLine(); // diana@email.com
		
		System.out.println("Phone:");
		phone = s.nextLine(); // 0758455325
		
		
		// output
		System.out.println("Person output data");
		System.out.println("==================");
		
		System.out.println("First name: " + fname);
		System.out.println("Last name: " + lname);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Country: " + country);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		
		/*
		 Person output data
		 ==================
		 First name: Diana
		 Last name: Rus
		 Gender: f
		 Age: 26
		 Address: Roses no 9
  		 Country: Romania
		 Email: diana@email.com
		 Phone: 0758455325
		*/
	}

}
