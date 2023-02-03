
public class secondMyClass {

	public static void main(String[] args) {
		
		/* create an object named student1 of the Student class which inherits
		   attributes and methods from myClass */
		Student student1 = new Student(); 
		
		System.out.println("Person details");
		System.out.println("==============");
		System.out.println("First name: " + student1.fname);
		System.out.println("Last name: " + student1.lname);
		System.out.println("Age: " + student1.age);
		System.out.println("Graduation year: " + student1.graduationYear);
		System.out.print("About grades: ");
		student1.education();

	}

}
