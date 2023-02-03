// abstract class
abstract class myClass {
	public String fname = "Ionela";
	public String lname = "Popescu";
	public int age = 20;
	public abstract void education();
}

// subclass of myClass class
class Student extends myClass {
	public int graduationYear = 2020;
	public void education() {
		System.out.println("Good grades");
	}
}
