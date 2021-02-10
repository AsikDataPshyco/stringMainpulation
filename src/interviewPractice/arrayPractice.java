package interviewPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class arrayPractice extends arrayDefineCondition{

	public static void main(String[] args) {

		// Array Declaration practice
		intArrayPractice01();
		stringArrayPractice01();

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
		
		//array sort
		simpleArraySortNumbers();
		arrayDecendingSort();
		arrayDecendingSortString();
		
		arrayDefinedCondition();
	}

	public static void intArrayPractice01() {
		int[] num = new int[5];
		int[] numb = { 1, 2, 3, 4, 5 };
		int[] numbr = new int[] { 1, 2, 3, 4, 5 };

		num[0] = 1;

		System.out.println(Arrays.toString(num));
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
		int[] numberList2 = new int[numberList1.length];

		for (int i = 0; i < numberList1.length; i++)
			numberList2[i] = numberList1[i];

		for (int i = 0; i < numberList1.length; i++) {
			System.out.print(numberList1[i] + " ");
		}

		for (int i = 0; i < numberList2.length; i++) {
			System.out.print(numberList2[i] + " ");
		}

	}

	public static void copyArrayClone() {
		
		String[] numberList1 = { "Asik", "Ali"};
		String[] numberList2 = numberList1.clone();

		for (int i = 0; i < numberList1.length; i++) {
			System.out.print(numberList1[i] + " ");
		}

		for (int i = 0; i < numberList2.length; i++) {
			System.out.print(numberList2[i] + " ");
		}
	}
	
	public static void copyArraySystemCopy()
	{
		  int arr1[] = { 1,2,3 };
	      int arr2[] = { 4,5,6 };	    
	   
	      System.arraycopy(arr1, 0, arr2, 0, 3);
	      System.out.println(arr2[0]);
	      System.out.println(arr2[1]);
	      System.out.println(arr2[2]);
	}
	
	public static void copyArrayCopyOf()
	{
		  int arr1[] = { 99,88,77 };
	      int arr2[] =  Arrays.copyOf(arr1, 3);
	      System.out.println(arr2[0]);     
	}
	
	public static void copyArrayCopyRangeOf()
	{
		 int arr1[] = {1, 8, 3, 5, 9, 10  };
	      int arr2[] =  Arrays.copyOfRange(arr1, 2, 6);
	      System.out.println(arr2[0]);  
	      System.out.println(arr2[1]);
	      System.out.println(arr2[2]);
	}
	
	public static void simpleArraySortNumbers()
	{
		int[] arraySort = {100,20,40,56,77,89};
		Arrays.sort(arraySort);
		System.out.println(Arrays.toString(arraySort));
		
	}
	
	public static void arrayDecendingSort()
	{
		Integer[] arraySort = {100,20,40,56,77,89};		
		Arrays.sort(arraySort,Collections.reverseOrder());
		System.out.println(Arrays.toString(arraySort));
		
	}
	
	
	public static void arrayDecendingSortString()
	{
		String[] arraySort = {"Asik","Rahila","Kabir","Inaya"};		
		Arrays.sort(arraySort,Collections.reverseOrder());
		System.out.println(Arrays.toString(arraySort));
		Arrays.sort(arraySort);
		System.out.println(Arrays.toString(arraySort));
		
	}
	
	
}














