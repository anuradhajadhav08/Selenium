package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Example20_Hashmap_1 {
public static void main(String[] args) {
	HashMap<Integer,String > hm = new HashMap();
	hm.put(1, "Snehal");
	hm.put(2,"Angad");
	hm.put(3,"Rahul");
	hm.put(4, "Mobile");
	hm.put(3, "Ramesh");//for update and adding data we used put method
	//To verify specific key present or not using contains key
	System.out.println(hm.containsKey(3));
	System.out.println(hm);
	System.out.println(hm.get(1));
	
	
	//Print all keys
	Set<Integer> allkeys=hm.keySet();
	for(Integer key:allkeys) {
		System.out.println(key+"-"+hm.get(key));
	}
	
	System.out.println("...............................");
	
	//get all keys and value
	Set<Integer> keys=hm.keySet();
	for(Integer abc:keys) {
	System.out.println(abc+"-"+hm.get(abc));	
	}
}
}
