package interviewPractice;

import java.util.Arrays;

public class sortCharArray {

	public static void main(String[] args) {

		sortCharArray();
	}

	public static void sortCharArray() {

		//char[] sortCharVar = new char[] { 'a', 'b', 'C', 'd' };
		  String str = "Asik Ali";
		  char[] sortCharVar = str.toCharArray();

		for (int i = 0; i < sortCharVar.length; i++) {
			for (int j = i + 1; j < sortCharVar.length; j++) {

				char temp;
				;
				if (sortCharVar[i] > sortCharVar[j] && sortCharVar[i]!=' ') {
					temp = sortCharVar[i];
					sortCharVar[i] = sortCharVar[j];
					sortCharVar[j] = temp;

				}

			}

		}
		System.out.print(Arrays.toString(sortCharVar));
	}

}
