package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface waterBottle {

	String color = "Blue";

	void fillup();

}

public class arrayPractice implements waterBottle {

	public static void main(String[] args) {
		
		// pattern matching

		stringMainpulation();

		System.out.println(color);
		arrayPractice ex = new arrayPractice();
		ex.fillup();

		cars va1 = new cars();
		cars va2 = new cars();
		va1.cars("VanHeusan");
		va2.cars("TMLwein");

	

		patternMatching();

		// arrayList
		dupesArrayList();

		arrayListPractice();

		// hashmap

		hashmapduplicate();

		// occurance of number

		occuranceofNumber();
		duplicateNumber();

		// reverse a String

		reverseString();

		// find min max

		findMinMaxValues();

		// find a element
		findElement();

		// Array Declaration practice
		intArrayPractice01();
		stringArrayPractice01();

		// print min value
		// int[] a = {100,200,45,500};
		new findDuplicatesArray().getMinvalue(new findDuplicatesArray().passArray());

		// Array Return Practice
		int[] retunNumber = retrunIntArray();
		System.out.println(Arrays.toString(retunNumber));

		String[] getName = retrunStringArray();
		System.out.println(Arrays.toString(getName));

		// multi dimensional array
		multiDimentionArray();

		// Copy array
		copyArrayLoop();
		copyArrayClone();
		copyArraySystemCopy();
		copyArrayCopyOf();
		copyArrayCopyRangeOf();

		// array sort
		simpleArraySortNumbers();
		arrayDecendingSort();
		arrayDecendingSortString();
		sortingArrayperCondition();

		// duplicates
		new findDuplicatesArray().findDuplicateLoopmethod();
		new findDuplicatesArray().findDuplicateHashSetmethod();
		new findDuplicatesArray().findDuplicateHashMapmethod();

		// hashMapPractice
		hashMapPractice();
		hashMapPracticeIntString();

		// hashSet
		hashSetPractice();

		// duplicate words
		// new findDuplicateWordsString().duplicateRepetitiveWords();

	}

	public static void intArrayPractice01() {
		int[] num = new int[5];
		int[] numb = { 1, 2, 3, 4, 5 };
		int[] numbr = new int[] { 1, 2, 3, 4, 5 };

		num[2] = 100;

		System.out.println("number of 2 " + Arrays.toString(num));
		System.out.println(Arrays.toString(numb));
		System.out.println(Arrays.toString(numbr));
	}

	public static void stringArrayPractice01() {
		String[] name = new String[5];
		String[] nameFn = { "Asik", "Ali", "Peermuhammed", "Syed" };
		String[] nameFnLn = new String[] { "Asik", "Ali", "Peermuhammed", "Syed" };

		name[0] = "asik";
		name[1] = "ali";
		name[2] = "Peermuhammed";
		name[3] = "Syed";
		name[4] = "Ziaudeen";

		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(nameFn));
		System.out.println(Arrays.toString(nameFnLn));
	}

	public static int[] retrunIntArray() {

		int[] num = new int[5];
		num[0] = 555;
		return num;

	}

	public static String[] retrunStringArray() {

		String[] nameReturn = new String[5];
		nameReturn[0] = "Rahila";
		return nameReturn;

	}

	public static void multiDimentionArray() {

		int itemRow = 2;
		int itemColum = 2;

		String[][] firstNameLastName = { { "Asik", "Rahila" }, { "Ali", "Basha" } };

		for (int i = 0; i < itemRow; i++) {
			for (int j = 0; j < itemColum; j++) {
				System.out.println(firstNameLastName[i][j]);

			}

		}

	}

	public static void copyArrayLoop() {

		int[] numberList1 = { 2, 4, 6, 7, 8 };
		int[] numberList2 =new int[numberList1.length];

		for (int i = 0; i < numberList1.length; i++) {
			
			numberList2[i]=numberList1[i];
			
			System.out.print(numberList2[i]+" ");
			
		}
		
  

	}

	public static void copyArrayClone() {

		String[] numberList1 = { "Asik", "Ali" };
		String[] numberList2 = numberList1.clone();

		for (int i = 0; i < numberList1.length; i++) {
			System.out.print(numberList1[i] + " ");
		}

		for (int i = 0; i < numberList2.length; i++) {
			System.out.print(numberList2[i] + " ");
		}
	}

	public static void copyArraySystemCopy() {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 4, 5, 6 };

		System.arraycopy(arr1, 0, arr2, 0, 3);
		// sorce array object, int start posistion , tgtarrayobject, int tgt posistion ,
		// lenght of the array)
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}

	public static void copyArrayCopyOf() {
		int arr1[] = { 99, 88, 77 };
		int arr2[] = Arrays.copyOf(arr1, 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("ARRAY COPY OF " + arr2[i]);
		}

	}

	public static void copyArrayCopyRangeOf() {
		int arr1[] = { 1, 8, 3, 5, 9, 10 };
		int arr2[] = Arrays.copyOfRange(arr1, 2, 6);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}

	public static void simpleArraySortNumbers() {
		int[] arraySort = { 100, 20, 40, 56, 77, 89 };
		// String[] arraySort = { "Asik", "Rahila", "Basha"};
		Arrays.sort(arraySort);
		System.out.println("Arrays.Sort Library " + Arrays.toString(arraySort));

	}

	public static void arrayDecendingSort() {
		Integer[] arraySort = { 100, 20, 40, 56, 77, 89 };
		Arrays.sort(arraySort, Collections.reverseOrder());
		System.out.println(Arrays.toString(arraySort));

	}

	public static void arrayDecendingSortString() {
		String[] arraySort = { "Asik", "Rahila", "Kabir", "Inaya" };
		Arrays.sort(arraySort, Collections.reverseOrder());
		System.out.println(Arrays.toString(arraySort));
		Arrays.sort(arraySort);
		System.out.println(Arrays.toString(arraySort));

	}

	public static void sortingArrayperCondition() {
		arrayDefineCondition[] employees = { new arrayDefineCondition(1, "Asik", 45000),
				new arrayDefineCondition(1, "Rahila", 55000), new arrayDefineCondition(1, "Inaya", 65000),
				new arrayDefineCondition(1, "Kabir", 75000) };

		Arrays.sort(employees);
		System.out.println(Arrays.toString(employees));

	}

	/*
	 * Array - Multiple values under single variable ArrayList - Re Sizable Array -
	 * Ordered Collection HashMap - Key and Value pair HashSet - collection of Items
	 * - Its Unique
	 */

	public static void hashMapPractice() {
		HashMap<String, String> carsNames = new HashMap<String, String>();
		carsNames.put("Hyndai", "Tsucon");
		carsNames.put("Honda", "Civic");
		carsNames.put("Toyotta", "Camery");
		carsNames.put("Mazda", "CX5");
		carsNames.put("Mercedes", "C570");

		for (String i : carsNames.keySet()) {
			System.out.println(i);
		}

	}

	public static void hashMapPracticeIntString() {
		HashMap<String, Integer> hashMapCarsMileage = new HashMap<String, Integer>();

		hashMapCarsMileage.put("Hyndai", 28);
		hashMapCarsMileage.put("Mercedes", 45);
		hashMapCarsMileage.put("Honda", 36);
		hashMapCarsMileage.put("Mazda", 12);

		for (String i : hashMapCarsMileage.keySet()) {

			if (hashMapCarsMileage.get(i) > 35) {
				System.out.println("Good Cars :" + i + " Value " + hashMapCarsMileage.get(i));
			} else {
				System.out.println("Bad Cars :" + i + " Value " + hashMapCarsMileage.get(i));
			}

		}

	}

	public static void hashSetPractice() {
		HashSet<String> carsList = new HashSet<String>();

		carsList.add("Benze");
		carsList.add("Tuscon");
		carsList.add("Civic");
		carsList.add("Runner");
		carsList.add("Nissan");

		for (String i : carsList) {

			System.out.println("We have found the car  " + i);

		}

	}

	public static void findElement() {
		int[] findelementInArray = { 1, 2, 5, 8 };
		int checkValue = 7;

		boolean check = false;

		for (int i : findelementInArray) {

			if (i == checkValue) {
				check = true;
				break;

			}

		}
		System.out.println("The value present " + checkValue + check);

	}

	public static void findMinMaxValues() {

		int[] findMinMax = { 12, 1234, 45, 67, 1 };
		int valueMinMax = findMinMax[0];
		for (int i = 0; i < findMinMax.length; i++) {
			valueMinMax = Math.min(valueMinMax, findMinMax[i]);
		}
		System.out.println(valueMinMax + " ");

	}

	public static void reverseString() {

		String[] namesrvers = { "rahila", "asik" };
		Collections.reverse(Arrays.asList(namesrvers));
		System.out.println("reverse " + Arrays.toString(namesrvers));

	}

	public static void occuranceofNumber() {

		int[] occurance = { 0, 0, 5, 5, 8, 7, 8, 8 };
		int count = 0;
		int findNumber = 5;
		for (int i = 0; i < occurance.length; i++) {

			if (findNumber == occurance[i]) {

				count++;

			}

		}
		System.out.println("5 repeated no of times " + count);

	}

	public static void duplicateNumber() {
		int count = 0;
		int[] occurance = { 0, 0, 5, 5, 8, 7, 8, 8 };
		for (int i = 0; i < occurance.length - 1; i++) {
			for (int j = i + 1; j < occurance.length; j++) {
				if (occurance[i] == occurance[j]) {
					count++;
					System.out.println(occurance[i] + " count " + count);
				}
			}
		}

	}

	public static String uniqlocation;

	public static HashMap<String, Integer> hashmapduplicate() {

		String[] locations = new String[] { "coimbatore", "chennai", "delhi", "coimbatore" };

		HashMap<String, Integer> uniqlocation = new HashMap<String, Integer>();

		for (String getUniqueCities : locations) {

			if (uniqlocation.containsKey(getUniqueCities)) {
				System.out.println("Duplicate Value : " + getUniqueCities);
			} else {
				uniqlocation.put(getUniqueCities,1);
			}

		}
		return uniqlocation;

	}

	public static void arrayListPractice() {

		ArrayList<String> locations = new ArrayList<String>();

		locations.add(0, "asik");
		locations.add(1, "rahila");
		locations.add(2, "rahila");
		// locations.set(0, "Kabir");
		// locations.remove(1);
		// locations.size();
		// locations.clear();
		for (String i : locations) {

			System.out.println(i);

		}

	}

	public static void dupesArrayList() {

		ArrayList<String> locations = new ArrayList<String>();

		locations.add(0, "asik");
		locations.add(1, "rahila");
		locations.add(2, "rahila");

		final Set<String> v1 = new HashSet<String>();
		final Set<String> v2 = new HashSet<String>();

		for (String v3 : locations) {

			if (!v2.add(v3)) {

				v1.add(v3);
				System.out.println("Duplicate Array List " + v1);
			}

		}
	}

	public static void patternMatching() {

		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";

		Pattern v1 = Pattern.compile(pattern);
		Matcher v2 = v1.matcher(line);

		if (v2.matches()) {

			System.out.println(v2.group(0));
			System.out.println(v2.group(1));
			System.out.println(v2.group(2));

		} else {
			System.out.println("NO MATCH");
		}

	}

	public static void stringMainpulation() {

		String line1 = "GeeksforGeeks A computer science portal for geeks ";
		String pattern1 = "e";
		String match[] = line1.split(" ");
		//String pattern1 = match[0];
		int count = 0;

		for (int i = 0; i < match.length; i++) {

			if (pattern1.contains(match[i]));
			count++;

		}
		System.out.println(count);

	}

	@Override
	public void fillup() {
		System.out.println("Its Filled");

	}

}
