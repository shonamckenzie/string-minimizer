import java.util.Arrays;

public class StringMinimizer {

//	minimizer function to take string as input
//	split input by space to allow comparing & gather index position
//	look for duplicate words (identifiers) and replace duplicate with $index of first seen word
//	identifier starts at 0
//	output entire string with minimized changes

	//	string for input
	static String string = "you say yes, I say no you say stop and I say go go go";
	static String[] word = string.split(" ");
	static int index;

	public static String minimize(String[] word) {
//split the input string to get each single word
//loop through to get duplicate words
		for (int i = 0; i < word.length; i++) {
			index = i;
			for (int j = i + 1; j < word.length; j++) {
				if(word[i].equals(word[j])) {
					word[j] = "$" + index;
				}
			}
//				System.out.println(count);
		}System.out.println(Arrays.toString(word));
		return Arrays.toString(word);

	}

	public static void main(String[] args) {
//		call to minimize function
		minimize(word);
	}

}

