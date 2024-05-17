package logicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Example21_OccouranceEachStringCharInString {
public static void main(String[] args) {
	 String str = "anuradhajadhav";
	 HashMap<Character, Integer> hm =new HashMap<Character, Integer>();
	  for(int i=0;i<=str.length()-1;i++) 
	  {
		 char s1 = str.charAt(i);
		 
		 if(hm.containsKey(s1)) 
		 {
			 hm.put(s1, hm.get(s1)+1);//ana
		 }//a+1
		 else 
		 {
			 hm.put(s1, 1);//a=1 n=1 a=2
		 }
	  }
	  Set<Character> allkeys=hm.keySet();
	  for(Character keys:allkeys) 
	  {
		 System.out.println(keys+"-"+hm.get(keys)); 
	  }
	  
	  System.out.println(".....................");
	  
	  for(Character keys:allkeys) 
	  {
		  if(hm.get(keys)>1) 
		  {
			  System.out.println(keys+"-"+hm.get(keys));
		  }
	  }
}
}
