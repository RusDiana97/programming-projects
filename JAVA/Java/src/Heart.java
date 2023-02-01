public class Heart {
	
	// How many hearts do you have in the array? 
	// Count them by the specific formats for a heart.
	// 
	// CORRECT FORMATS FOR A HEART: "💗", "<3", "♡", "❥", "ღ"
	
	static void countHearts(String[] array) {
		// array with the correct formats for a heart
		String[] hearts = {"💗", "<3", "♡", "❥", "ღ"};
		
		// variable for the total number of hearts from the array
		int count = 0;
		
		// the length for array
		int arrayLength = array.length;
		
		// the length for hearts
		int heartsLength = hearts.length;
		
		/* Check if the element from the array at an index is the same 
		with the element from the heart at that index. If they are equals in values
		then increase count by 1 */
		for(int i = 0; i < arrayLength; i++) {
			for(int j = 0; j < heartsLength; j++) {
				if(array[i] == hearts[j]) {
					count++;
				}
			}
		}
		
		System.out.println("You have " + count + " hearts.");
	}

	public static void main(String[] args) {
		// test cases
	    String[] array = {"💗", "40", "F", "💗", "[", "❥", "<3", "a"};
	    String[] array1 = {"💗", "[", "❥", "<3", "a"};
	    String[] array2 = {"-💗", "[", "-❥", "<3", "a"};
	    String[] array3 = {"💗"};
	    String[] array4 = {};
	    String[] array5 = {"a", "[", "^"};
	 
	   // call the countHearts function
	   countHearts(array); // 4
	   countHearts(array1); // 3
	   countHearts(array2); // 1
	   countHearts(array3); // 1
	   countHearts(array4); // 0
	   countHearts(array5); // 0
	}

}
