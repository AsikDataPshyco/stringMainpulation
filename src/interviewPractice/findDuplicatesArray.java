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
		String[] subjectNames = new String[] { "Chemistry", "Physics", "Tamil", "English", "French", "Chemistry" };

		Set<String> subjects = new HashSet<String>();

		for (String uniquSubject : subjectNames) {

			if (!subjects.add(uniquSubject)) {
				System.out.println("The Duplicate Subject is " + uniquSubject);
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
					System.out.print("The Duplicate Sports is "+ entry.getKey());
					
				}
				
			}
			
		}

	}

}
