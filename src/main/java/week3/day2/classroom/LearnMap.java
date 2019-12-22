package week3.day2.classroom;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
	
	public static void main(String[] args) {
		
		String myName = "gayathri";
		char[] charArray = myName.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		//Iterate over the array
		for (char ch : charArray) {
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);				
		}
			else{
				
			map.put(ch, 1);
			
			}
	}
	
		System.out.println(map);

}

}