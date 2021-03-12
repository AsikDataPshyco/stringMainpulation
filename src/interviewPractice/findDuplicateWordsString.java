package interviewPractice;

public class findDuplicateWordsString {

	/*
	 * Define a string. Convert the string into lowercase to make the comparison
	 * insensitive. Split the string into words. Two loops will be used to find
	 * duplicate words. Outer loop will select a word and Initialize variable count
	 * to 1. Inner loop will compare the word selected by outer loop with rest of
	 * the words. If a match found, then increment the count by 1 and set the
	 * duplicates of word to '0' to avoid counting it again. After the inner loop,
	 * if count of a word is greater than 1 which signifies that the word has
	 * duplicates in the string.
	 */

	// declare the String

	public static void duplicateRepetitiveWords() {

		String textData = "Asik Rahila Asik Kabir Rahila Inaya";

		// initialize the counter

		int count;

		// Convert the String to Lower class

		String textDataLowecase = textData.toLowerCase();

		String textDataLowecaseWords[] = textDataLowecase.split(" ");

		int lengthText = textDataLowecaseWords.length;

		for (int i = 0; i < lengthText; i++) {

			for (int j = i+1; j < lengthText; j++) {
				
				if(textDataLowecaseWords[i] == textDataLowecaseWords[j])
				{
					System.out.println("Duplicate Element "+ j);
				}
				
				

			}

		}

	}
}
