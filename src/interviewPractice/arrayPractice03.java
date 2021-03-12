package interviewPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class arrayPractice03 {

	public static void main(String[] args) {

		// repchar("Asik Ali");
		//getFirstRepChar();
		//getAllNonRepeatingChar();
		//getMaximumOccuringChar();		
		//getDuplicateCharecters();
		
		removeDuplicatesHashMap();
	}

	public static char[] repchar(String txtValue) {

		char[] textValueArr = txtValue.toCharArray();
		int count;

		for (int i = 0; i < textValueArr.length; i++) {
			count = 1;
			for (int j = i + 1; j < textValueArr.length; j++) {
				if (textValueArr[i] == textValueArr[j] && textValueArr[i] != ' ') {
					count++;
					textValueArr[j] = '0';
				}

			}
			if (count > 1 && textValueArr[i] != '0') {
				System.out.println(textValueArr[i]);

			}

		}
		return textValueArr;

	}

	public static void getFirstRepChar() {

		String getFirstCharecter = "Spread Love and Be Happy";
		char[] thisisFrstReptChar = getFirstCharecter.toCharArray();

		HashSet<Character> getTheFrstRptChar = new HashSet<>();

		for (int i = 0; i < thisisFrstReptChar.length - 1; i++) {

			char getWords = thisisFrstReptChar[i];

			if (getTheFrstRptChar.contains(getWords)) {
				System.out.println("The Charecter is " + getWords);
				break;
			} else {
				System.out.println("The Charecter is " + getTheFrstRptChar.add(getWords));

			}

		}

	}

	public static void getAllNonRepeatingChar() {

		String getTheString = "Spread 1Love Be Happy@$";

		char[] myStringCharArray = getTheString.toCharArray();
		int getSizeofArray = myStringCharArray.length;

		//HashMap<Character, Integer> nonRepValue = new HashMap<>();
		HashMap<Character, Integer> nonRepValue = new LinkedHashMap<>();
		int i = 0;

		while (i != getSizeofArray) {
			
				if(nonRepValue.containsKey(myStringCharArray[i] )==false) {
					nonRepValue.put(myStringCharArray[i] , 1);				
				} else {
					int oldvalue = nonRepValue.get(myStringCharArray[i]);
					int newValue = oldvalue + 1;
					nonRepValue.put(myStringCharArray[i], newValue);
				}
			++i;
		}		
		
		Set<Map.Entry<Character, Integer>> charMapSet = nonRepValue.entrySet();
		for (Map.Entry<Character, Integer> data : charMapSet) {
			
			if (data.getValue() ==1) {
				System.out.println ("All Non Repeating Char "+data.getKey());				
				break;
			}
			
		}
	}

	public static void getMaximumOccuringChar() {
		String getTheString = "Spread 1Love Be Happy@$";

		char[] myStringCharArray = getTheString.toCharArray();
		int getSizeofArray = myStringCharArray.length;

		//HashMap<Character, Integer> nonRepValue = new HashMap<>();
		HashMap<Character, Integer> nonRepValue = new LinkedHashMap<>();
		int i = 0;

		while (i != getSizeofArray) {
			
				if(nonRepValue.containsKey(myStringCharArray[i] )==false) {
					nonRepValue.put(myStringCharArray[i] , 1);				
				} else {
					int oldvalue = nonRepValue.get(myStringCharArray[i]);
					int newValue = oldvalue + 1;
					nonRepValue.put(myStringCharArray[i], newValue);
				}
			++i;
		}		
		
		
		
		Set<Map.Entry<Character, Integer>> charMapSet = nonRepValue.entrySet();
		int maxVal = 0;
		char maxChar = ' ';
		for (Map.Entry<Character, Integer> data : charMapSet) {
			
			if (data.getValue() > maxVal) {
				maxVal = data.getValue(); 	
				maxChar = data.getKey();	
			}
			
		} System.out.println("The Max Occured Char " + maxChar +" of "+ maxVal +" times");
		
	}
	
	public static void getDuplicateCharecters() {
		String getTheString = "Spread 1Love Be Happy@$";

		char[] myStringCharArray = getTheString.toCharArray();
		int getSizeofArray = myStringCharArray.length;

		HashMap<Character, Integer> nonRepValue = new HashMap<>();
		//HashMap<Character, Integer> nonRepValue = new LinkedHashMap<>();
		int i = 0;

		while (i != getSizeofArray) {
			
				if(nonRepValue.containsKey(myStringCharArray[i] )==false) {
					nonRepValue.put(myStringCharArray[i] , 1);				
				} else {
					int oldvalue = nonRepValue.get(myStringCharArray[i]);
					int newValue = oldvalue + 1;
					nonRepValue.put(myStringCharArray[i], newValue);
				}
			++i;
		}		
		
		Set<Map.Entry<Character, Integer>> charMapSet = nonRepValue.entrySet();
		for (Map.Entry<Character, Integer> data : charMapSet) {
			
			if (data.getValue() > 1) {
				 	
				int maxVal = data.getValue();
				char maxChar = data.getKey();
				
				System.out.println("The Duplicate Charecters are "+ maxVal+maxChar);
			}
			
		} 
		
		
	}
	
	public static void removeDuplicatesHashMap(){
		
		String getTheString = "God is Love Love is Great";

		char[] myStringCharArray = getTheString.toCharArray();
		int getSizeofArray = myStringCharArray.length;

		HashMap<Character, Integer> nonRepValue = new HashMap<>();
		//HashMap<Character, Integer> nonRepValue = new LinkedHashMap<>();
		int i = 0;

		while (i != getSizeofArray) {
			
				if(nonRepValue.containsKey(myStringCharArray[i] )==false) {
					nonRepValue.put(myStringCharArray[i] , 1);				
				} else {
					int oldvalue = nonRepValue.get(myStringCharArray[i]);
					int newValue = oldvalue + 1;
					nonRepValue.put(myStringCharArray[i], newValue);
				}
			++i;
		}		
		
		Set<Map.Entry<Character, Integer>> charMapSet = nonRepValue.entrySet();
		String distinctValues ="";
		for (Map.Entry<Character, Integer> data : charMapSet) {
			
			   distinctValues = distinctValues+data.getKey();
			
		} System.out.println("The Distinct Charecters in the String "+ distinctValues);
		
		
	}

}
