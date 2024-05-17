package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Example10_OccouranceOfEachCharInString_Hashmap {
public static void main(String[] args) {
	String str="my name is is sita sita is my";
	
	String[] ar = str.split(" ");
	HashMap<String,Integer> mp = new HashMap();
	
	for(int i=0;i<=ar.length-1;i++) 
	{
		
		String s1= ar[i];
		
		if(mp.containsKey(s1)) 
		{
			mp.put(s1, mp.get(s1)+1);
			
		}
		else {
			mp.put(s1, 1);
		}
		
	}
	//System.out.println(mp);
	
	//get/print all values and keys present in hashmap
	Set<String> allkeys = mp.keySet();
	
	
	for(String key:allkeys) {
		
		System.out.println(key+"-"+mp.get(key));
	}
	System.out.println("_______________________");
	//Print/get only duplicate 
	
	for(String key:allkeys) {
		if(mp.get(key)>1) {
			System.out.println(key+"-"+mp.get(key));
		}
	}
}


}
