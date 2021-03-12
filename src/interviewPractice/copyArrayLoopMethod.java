package interviewPractice;

public class copyArrayLoopMethod {

	public static void main(String[] args) {
		
		copyArrayLoop();
	}

	public static void copyArrayLoop() {

		int[] numberList1 = { 2, 4, 6, 7, 8 };
		int[] numberList2 =new int[numberList1.length];

		for (int i = 0; i < numberList1.length; i++) {
			
			numberList2[i]=numberList1[i];
			
			System.out.print(numberList2[i]+" ");
			
		}
		
  

	}
}
