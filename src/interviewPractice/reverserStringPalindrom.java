package interviewPractice;

public class reverserStringPalindrom {

	public static void main(String[] args) {
		
	System.out.println(isPalinDrome("aaa"));
	System.out.println(reverseString("asik"));
		
	}

	public static boolean isPalinDrome(String textVale) {
		
		String reverse="";
		int txtValueLenght = textVale.length();
		
		for(int i=txtValueLenght-1;i>0;i--) {
			
			reverse = reverse + textVale.charAt(i);
			
		}
		
		
		return textVale.equals(reverse);
		
	}
	
	
	public static String reverseString(String textVale) {
		
		String reverse="";
		int txtValueLenght = textVale.length();
		
		for(int i=txtValueLenght-1;i>=0;i--) {
			
			reverse = reverse + textVale.charAt(i);
			
		}
		
		
		return reverse;
		
	}
	
}
