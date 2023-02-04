
public class BiggestNum {

	public static void main(String[] args) {
		System.out.println("Let's find out what is the biggest number!");
		System.out.println("Choose two numbers.");
		
		System.out.println("Type a number: ");
		double a = Double.parseDouble(cin.linie()); // 8.2
		System.out.println("First number is: " + a); // First number is: 8.2
		
		System.out.println("Type another number: ");
		double b = Double.parseDouble(cin.linie()); // 2.2
		System.out.println("Second number is: " + b); // Second number is: 2.2
		
		if(a > b) {
			System.out.println("First number is the biggest."); // First number is the biggest.
		} else {
			System.out.println("Second number is the biggest.");
		}
		
	}

}
