public class Method {
	
	// add 2 numbers of different types: int and double
	// instead of defining to methods that should do the same thing, I overload one
	
	static int methodOverloading(int x, int y) {
		return x + y;
	}
	
	static double methodOverloading(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int num1 = methodOverloading(5, 10);
		double num2 = methodOverloading(5.5, 10.5);
		
		System.out.println("Return int value: " + num1);
		// Return int value: 15
		
		System.out.println("Return double value: " + num2);
		// Return double value: 16.0
	}

}
