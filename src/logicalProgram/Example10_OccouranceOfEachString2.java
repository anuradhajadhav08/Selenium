package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Example10_OccouranceOfEachString2 {
public static void main(String[] args) {
	String str="ababcd";
	HashMap< Character, Integer> mp = new HashMap<>();
	for(int i=0; i<=str.length()-1;i++) {
		char s1 = str.charAt(i);
		
		if (mp.containsKey(s1)) {
			mp.put(s1, mp.get(s1)+1);
		}
		else {
			mp.put(s1, 1);
		}
	}
		
		Set<Character> allkeys = mp.keySet();
		 for(Character keys:allkeys) {
			 System.out.println(keys+":"+mp.get(keys));
		 }
		 //Print only duplicate value
		 for(Character keys:allkeys) {
			 if(mp.get(keys)>1) {
				 System.out.println(keys+":"+mp.get(keys));
			 }
		 }
			
		
		
	}
}

