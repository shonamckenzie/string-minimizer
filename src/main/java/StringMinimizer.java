public class StringMinimizer {

//	minimizer function to take string as input
//	split input by space to allow comparing & gather index position
//	look for duplicate words (identifiers) and replace duplicate with $index of first seen word
//	identifier starts at 0
//	output entire string with minimized changes

	//	string for input
	static String string = "you say yes, I say no you say stop and I say go go go";

	static String[] minimize(String input) {
		String[] word = input.split(" ");
		return word;
	}

	public static void main(String[] args) {
//		call to minimize function
		final String[] minimize = minimize(string);
		System.out.println(minimize[1]);
	}

}

