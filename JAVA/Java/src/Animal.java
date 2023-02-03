
public class Animal {

	public void goAnimal() {
		System.out.println("The animal climbs as fast as it can!");
	}
	
	public void hours(int maxHours) {
		System.out.println("The animal climbs the wall in " + maxHours +
				" hours maximum.");
	}
	
	public static void main(String[] args) {
		
		// create the object snail of the Animal class
		Animal snail = new Animal();
		
		// call the goAnimal method
		snail.goAnimal();
		
		// call the hours method
		snail.hours(3);

	}

}
