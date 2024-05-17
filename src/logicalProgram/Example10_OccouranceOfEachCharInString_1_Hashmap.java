package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Example10_OccouranceOfEachCharInString_1_Hashmap {

	public static void main(String[] args) {
		String str="abcbaad";
		
		HashMap<Character,Integer> mp = new HashMap();
		
		for(int i=0;i<=str.length()-1;i++) 
		{
			char s1 = str.charAt(i);
			
			if(mp.containsKey(s1)) {
				
				mp.put(s1, mp.get(s1)+1);
			}
			else {
				mp.put(s1, 1);
			}
		}
		
		////print all key and values in the hashmap
		Set<Character> allkeys = mp.keySet();
		for(Character key:allkeys) {
			System.out.println(key+"-"+mp.get(key));
		}
		
		//print only duplicate
		for(Character key:allkeys) {
			if(mp.get(key)>1) {
				System.out.println(key+"-"+mp.get(key));
			}
		}
	}
}
