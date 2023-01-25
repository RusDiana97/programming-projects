// count the lower cases of a string
public class Count {
	
	static int lowerCaseCount(String str) {
		// string str to array
		char[] arr = str.toCharArray();
		
		// create a string with all lower cases
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		// string lowercase to array
		char[] arrLowercase = lowercase.toCharArray();
		
		// create a variable named count for the total number of lower cases from the string
		int count = 0;
		
		// iterate through arr and arrLowercase 
		for (int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arrLowercase.length; j++) {
				// if the letter from the arr at an index exist in the arrLowercase than count will be count + 1
				if (arr[i] == arrLowercase[j]) {
					count++;
				}
			}
		}
		
		// the total number of the lower cases from the string
		return count;
	}

	public static void main(String[] args) {
		// test cases
		int totalNumberOfLowercase1 = lowerCaseCount("abc");
		int totalNumberOfLowercase2 = lowerCaseCount("AJKLJkojh");
		int totalNumberOfLowercase3 = lowerCaseCount("AJKLJ");
		int totalNumberOfLowercase4 = lowerCaseCount("A*^LJjudg54");
		
		System.out.println("The word has " + totalNumberOfLowercase1 + " lower cases."); 
		// The word has 3 lower cases.
		
		System.out.println("The word has " + totalNumberOfLowercase2 + " lower cases.");
		// The word has 4 lower cases.
		
		System.out.println("The word has " + totalNumberOfLowercase3 + " lower cases.");
		// The word has 0 lower cases.
		
		System.out.println("The word has " + totalNumberOfLowercase4 + " lower cases.");
		// The word has 4 lower cases.
	}

}
