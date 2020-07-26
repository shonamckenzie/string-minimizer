public class StringMinimizer {

//	minimizer function to take string as input
//	split input by space to allow comparing & gather index position
//	look for duplicate words (identifiers) and replace duplicate with $index of first seen word
//	identifier starts at 0, next as 1
//	output entire string with minimized changes

	public static String minimize(String[] word) {
//		store whether word is identifier
		int[] index = new int[word.length];

//		loop through each word & compare to get the identifier
//		store identifier marking the duplicates
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j]) && index[j] == 0) {
					index[j] = i + 1;
				}
			}
		}

//		check if word marked as duplicate identifier
//		replace word with index of first occurrence if it is
		String output = "";
		for (int i = 0; i < word.length; i++) {
			if (index[i] == 0) {
				if (i == 0) {
					output = word[i];
				} else {
					output = output + " " + word[i];
				}
			} else {
				output = output + " $" + (index[i] - 1);
			}
		}
			return output;
		}

}

