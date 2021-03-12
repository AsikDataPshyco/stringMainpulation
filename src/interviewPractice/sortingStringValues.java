package interviewPractice;

import java.util.Arrays;

public class sortingStringValues {

	public static void main(String[] args) {
		stringSort();

	}

	public static void stringSort() {
		
		String[] stringSort = new String[] {"Asik","Rahila","Inaya","Rubina"};
		int lengthStr = stringSort.length;
		
		for(int i=0;i<lengthStr;i++) {
			for(int j=i+1;j<lengthStr;j++) {
				
				if(stringSort[i].compareTo(stringSort[j]) < 0) {
					String temp = stringSort[i];
					stringSort[i] = stringSort[j];
					stringSort[j] = temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(stringSort));
	}
}
