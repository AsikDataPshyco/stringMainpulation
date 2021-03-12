package interviewPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findDuplicatesArray {

	public static void findDuplicateLoopmethod() {
		String[] familyNames = new String[] { "Asik", "Rahila", "Inaya", "Kabir", "Asik", "Rahila" };

		for (int i = 0; i < familyNames.length; i++) {

			for (int j = i + 1; j < familyNames.length; j++) {

				if (familyNames[i].contains(familyNames[j])) {
					System.out.println("the duplicates found " + familyNames[i]);
				}

			}
		}

	}

	public static void findDuplicateHashSetmethod() {
		String[] v1 = new String[] { "Chemistry", "Physics", "Tamil", "English", "French", "Chemistry" };

		Set<String> v2 = new HashSet<String>();

		for (String v3 : v1) {

			if (!v2.add(v3)) {
				System.out.println("The Duplicate Subject is " + v3);
				System.out.println(v3.charAt(1));
				System.out.println(v3.compareTo("Chemistry"));
				System.out.println(v3.concat(" Asik"));				
				
			}

		}

	}

	public static void findDuplicateHashMapmethod() {
		String[] sportsNames = new String[] { "Cricket", "BaseketBall", "Tennis", "Cricket", "PoleVault", "Running" };

		Map<String, Integer> uniqSports = new HashMap<String, Integer>();
		for (String sportsNamesDupes : sportsNames) {
			
			Integer count = uniqSports.get(sportsNamesDupes);
			if(count == null)
			{
				uniqSports.put(sportsNamesDupes, 1);
			
			}
			
			else 
			{
				uniqSports.put(sportsNamesDupes, ++count);
			}
			
			Set<Entry<String, Integer>> entrySet  =uniqSports.entrySet();
			
			for (Entry<String, Integer> entry : entrySet) {
				
				if(entry.getValue()>1)
				{
					
					System.out.println("The Duplicate Sports is "+ entry.getKey());
				}
				
				
			}
			
		}

	}
	
	//pass the array to method
	
	public static void getMinvalue(int arr[])
	{
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if(min > arr[i]) {				
				min = arr[i];
                 System.out.println("Minimum Value "+min+ " ");				
			}
			else
				{
				System.out.println("Minimum Value "+min+" ");		
				}
		}
	}
	
	public int[] passArray()
	{
		int[] arr = {1,2,3};
		return arr;
	}
	
	

}
