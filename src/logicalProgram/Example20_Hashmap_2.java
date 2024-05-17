package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Example20_Hashmap_2 {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap();
	hm.put(101, "Ramrao");
	hm.put(102, "Sham");
	hm.put(103, "Tanmay");
	hm.put(104, "Om");
	hm.put(105, "Ashok");
	System.out.println(hm);
	hm.put(105, "Mangesh");
	System.out.println("....................");
	System.out.println(hm);
	System.out.println(".................");
	
	System.out.println(hm.containsKey(104));
	System.out.println(hm.get(101));
	System.out.println("......................");
	
	Set<Integer> allkeys = hm.keySet();
	for(Integer key:allkeys) {
		System.out.println(key+"-"+hm.get(key));
		
	}
	
	
}
}
