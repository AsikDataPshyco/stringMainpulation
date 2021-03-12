package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class arrayPractice01 {

	public static void main(String[] args) {

		hashMapVal();
		
		sortNumWithoutLibrary();
		repetitveChars();

		System.out.println(isPalindrom("AsikAli"));

		removeCharfromACollection();

		comparetwoString();

	}

	public static void repetitveChars() {

		String string1 = "Asik Ali";
		int count;

		// Converts given string into character array
		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}

	public static boolean isPalindrom(String palingDromeTxt) {

		String reverse = "";

		int length = palingDromeTxt.length();

		for (int i = length - 1; i > 0; i--) {

			reverse = reverse + palingDromeTxt.charAt(i);

		}

		return palingDromeTxt.equals(reverse);

	}

	public static void removeCharfromACollection() {

		List<String> loans = new ArrayList<>();
		loans.add("personal loan");
		loans.add("home loan");
		loans.add("auto loan");
		loans.add("credit line loan");
		loans.add("mortgage loan");
		loans.add("gold loan");
		Iterator<String> itr = loans.iterator();
		while (itr.hasNext()) {
			String loan = itr.next();
			if (loan.equals("personal loan")) {
				itr.remove();
			}
		}
		System.out.println(loans);
	}

	public static void comparetwoString() {

		String name1 = "Asik";
		String name2 = "Arun";

		char[] namechar1 = name1.toCharArray();
		char[] namechar2 = name2.toCharArray();

		for (int i = 0; i < namechar1.length; i++) {

			for (int j = 0; j < namechar2.length; j++) {

				if (namechar1[i] == namechar2[j]) {
					System.out.print(namechar1[i]);
				}
			}

		}
		System.out.println(" The Name Matched");

	}

	public static void sortNumWithoutLibrary() {
		int[] numbersSort = new int[] { 10, 25, 14, -1, 8, 5, 8 };

		for (int i = 0; i < numbersSort.length; i++) {
			for (int j = i + 1; j < numbersSort.length; j++) {
				int temp = 0;
				if (numbersSort[i] < numbersSort[j]) {
					temp = numbersSort[i];
					numbersSort[i] = numbersSort[j];
					numbersSort[j] = temp;

				}
			}
			System.out.println(numbersSort[i]);
		}
	}

	
	public static void hashMapVal() {

		HashMap<String, Integer> capitalCities = new HashMap<String, Integer>();
		
	    capitalCities.put("England", 1);
	    capitalCities.put("Germany", 2);
	    capitalCities.put("Norway", 3);
	    capitalCities.put("USA", 4);
	    
	    for (String i:capitalCities.keySet()) {	    	
	  
	    	System.out.println("Cities "+ i + " Values "+capitalCities.get(i));
	    	
		}
	    
		   
	}
}
