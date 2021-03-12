package interviewPractice;

public class sortNumberArray {

	public static void main(String[] args) {
		sortNumber();
		
	}
	
	public static void sortNumber() {
		
		int[] numberArraySort = new int[] {4,45,8,52,1,-1};
		
		for(int i=0;i<numberArraySort.length;i++) {
			for(int j=i+1;j<numberArraySort.length;j++) {
				int temp = 0;
				
				if(numberArraySort[i] < numberArraySort[j]){
					temp = numberArraySort[i];
					numberArraySort[i]=numberArraySort[j];
					numberArraySort[j] = temp;
					
				}
				
			}
			System.out.println(numberArraySort[i]);
		}
		
	}

}
