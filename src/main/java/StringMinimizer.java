public class StringMinimizer {

//	minimizer function to take string as input
//	split input by space to allow comparing & gather index position
//	look for duplicate words (identifiers) and replace duplicate with $index of first seen word
//	identifier starts at 0
//	output entire string with minimized changes
	
	//	string for input
	static String string = "You say you yes, I say no you say stop and I say go go go";
	static int count;

	public static String[] minimize(String input) {
//split the input string to get each single word
		String[] word = input.split(" ");
//loop through to get duplicate words
		for (int i = 0; i < word.length; i++) {
			count = 1;
			for (int j = i + 1; j < word.length; j++) {
				if(word[i].equals(word[j])) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(word[i]);
			}
		}return word;
	}

	public static void main(String[] args) {
//		call to minimize function
		minimize(string);
	}

}

