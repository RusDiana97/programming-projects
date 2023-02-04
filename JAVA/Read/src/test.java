
public class test {

	public static void main(String[] args) {
		// Meet Jojo
		System.out.println("Hello!");
		System.out.println("Nice to meet you!");
		System.out.println("My name is Jojo. I can be your best friend.");
		System.out.println("If you want, you can present yourself. :)");
		
		System.out.println("=================================");
		
		// First name
		System.out.println("Type your first name: ");
		String fname = cin.linie(); // Diana
		System.out.println("Your first name is: " + fname); // Your first name is: Diana
		
		// First letter from first name
		char fletter = fname.charAt(0);
		System.out.println("Your first letter from your first name is: " + fletter); // Your first letter from your first name is: D
		
		// Last name
		System.out.println("Type your last name: ");
		String lname = cin.linie(); // Rus
		System.out.println("Your last name is: " + lname); // Your last name is: Rus
		
		// Full name
		System.out.println("So your full name is: " + fname + " " + lname);
		
		System.out.println("=================================");
		
		// Jojo ask you
		System.out.println("Nice to meet you " + fname + " " + lname + "!");
		System.out.println("How old are you?");
		System.out.println("I have 14 years old!");
		
		System.out.println("=================================");
		
		// Age
		System.out.println("Type your age:");
		// string to int
		int age = Integer.parseInt(cin.linie()); // 26
		System.out.println("So you have " + age + "."); // So you have 26.
		System.out.println("Nice!");
		
	}

}
