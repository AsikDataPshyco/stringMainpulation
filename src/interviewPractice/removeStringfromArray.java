package interviewPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeStringfromArray {

	public static void main(String[] args) {
		
		 removeStringfromList() ;
	}
	
	public static void removeStringfromList() {
		
		List<String> removeHate = new ArrayList<>();
		
		removeHate.add("Love");
		removeHate.add("Hate");
		
		System.out.println(removeHate);
		
		Iterator<String> itr = removeHate.iterator();
		while(itr.hasNext())
		{
			String hateRemove = itr.next();
			if(hateRemove.equals("Hate")) {
				itr.remove();
			}
		}
		System.out.println(removeHate);
	}

}
