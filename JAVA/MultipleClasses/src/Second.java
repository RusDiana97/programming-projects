
public class Second {

	public static void main(String[] args) {
		
		// create 3 objects of class First and use them in class Second
		First myObj = new First();
		First myObj1 = new First();
		First myObj2 = new First();
		
		// overriding the existed value of num for myObj2
		myObj2.num = 20;
		
		System.out.println("First object num is " + myObj.num); // 5
		System.out.println("Second object num is " + myObj1.num); // 5
		System.out.println("Third object num is " + myObj2.num); // 20
		
		System.out.println("His/Her first name is " + myObj2.fname 
				+ " and his/her last name is " + myObj2.lname 
				+ ". He/She is " + myObj2.num + " years old.");
		
		System.out.println("His/Her first name is " + myObj1.fname 
				+ " and his/her last name is " + myObj1.lname 
				+ ". He/She is " + myObj1.num + " years old.");
	}

}
