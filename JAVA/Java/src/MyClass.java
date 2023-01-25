public class MyClass {
	
	// checkAge method check if you have more than 18 years old by passing your age in an integer variable called age
	static void checkAge(int age) {
		
		if (age < 18) {
			System.out.println("Your age is: " + age + ". " + "Sorry, you need to have more than 18 years old.");
		} else if (age > 18){
			System.out.println("Your age is: " + age + ". " + "You have more than 18 years old.");
		}
	}
	
	public static void main(String[] args) {
		 checkAge(17);
		 // Your age is: 17. Sorry, you need to have more than 18 years old.
		 
		 checkAge(20);
		 // Your age is: 20. You have more than 18 years old.
	 }
	 
}
