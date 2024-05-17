package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Example10_HashMap {
public static void main(String[] args) {
	HashMap<Integer, String> mp = new HashMap<>();
	mp.put(101, "Abhayashri");
	mp.put(102, "Anuradha");
	mp.put(103, "Nayna");
	mp.put(104, "anabhyal");
	mp.put(105, "dynana");
	// to update data using put method
	mp.put(104, "Anabhya");
	System.out.println(mp);
	// to verify specific value using contains key
	System.out.println(mp.containsKey(105));
	//to get the specificvalue
	System.out.println(mp.get(105));
	// print all key format 
	Set<Integer> allkeys = mp.keySet();
	 for(Integer keys:allkeys) {
		 System.out.println(keys);
	 }
	// get all keys and value
		
		 for(Integer keys:allkeys) {
			 System.out.println(keys+"-"+mp.get(keys));
		 
	 }
	
	 }
	
}

