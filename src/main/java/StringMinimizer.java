import java.util.Arrays;

public class StringMinimizer {

//	minimizer function to take string as input
//	split input by space to allow comparing & gather index position
//	look for duplicate words (identifiers) and replace duplicate with $index of first seen word
//	identifier starts at 0
//	output entire string with minimized changes

	//	string for input
//	static String string = "you say yes, I say no you say stop and I say go go go";
////	split the input string to get each single word
//	static String[] word = string.split("[^a-zA-Z]");
//	static String string = "jump4joy jump joy";
//	static String[] word = string.split("[^a-zA-Z]");

	public static String minimize(String[] word) {
		int[] index = new int[word.length];

		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j]) && index[j] == 0) {
					index[j] = i + 1;
				}
			}
		}

			String output = "";
			for (int i = 0; i < word.length; i++) {
				if (index[i] == 0) {
					if (i == 0)
						output = word[i];
					else
						output = output + " " + word[i];
				} else {
					if (i == 0)
						output = word[i];
					else
						output = output + " $" + (index[i] - 1);
				}
			}
			System.out.println(output);
			return output;
		}

//	public static void main(String[] args) {
////		call to minimize function
//		minimize(word);
//	}

}

