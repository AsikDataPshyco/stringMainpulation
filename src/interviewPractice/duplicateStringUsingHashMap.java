package interviewPractice;

import java.util.HashMap;

public class duplicateStringUsingHashMap {

	public static void main(String[] args) {
		
		 dupeStringsHashMap();

	}
	
	public static void dupeStringsHashMap() {
		
		String[] cityNames = new String[] {"NEWYORK","NEWJERSEY","DENVER","NEWYORK"};
		
		HashMap<String, Integer> getUniqueCities = new HashMap<String,Integer>();
		
		for(String citiesInArray : cityNames) {
			
			if(getUniqueCities.containsKey(citiesInArray)) {
				System.out.println("The Duplicate Key is "+ citiesInArray);
				
			}
			else
			{
				getUniqueCities.put(citiesInArray, 1);
				
			}
			
		}
	}
	
public static void dupeCharsHashMap() {
		
		String[] cityNames = new String[] {"NEWYORK","NEWJERSEY","DENVER","NEWYORK"};
		
		HashMap<String, Integer> getUniqueCities = new HashMap<String,Integer>();
		
		for(String citiesInArray : cityNames) {
			
			if(getUniqueCities.containsKey(citiesInArray)) {
				System.out.println("The Duplicate Key is "+ citiesInArray);
				
			}
			else
			{
				getUniqueCities.put(citiesInArray, 1);
				
			}
			
		}
	}

}
