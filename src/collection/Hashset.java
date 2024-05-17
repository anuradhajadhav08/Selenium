package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	
	hs.add("Rahul");
	hs.add(65.5f);
	hs.add('A');
	hs.add("Rahul");
	hs.add(null);
	hs.add(101);
	//hs.add(null);
	
	System.out.println(hs);
	System.out.println(hs.contains("Rahul"));
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	hs.remove('A');
	hs.add("xyz");
	System.out.println(hs);
	System.out.println("--------Iterator--------------");
	Iterator al = hs.iterator();
	
	while(al.hasNext()) {
		System.out.println(al.next());
		
	}
	System.out.println("-----------------------------");
	for(Object abc:hs) {
		System.out.println(abc);
	}
//	System.out.println("-----------------------------");
//for(int i=0; i<=hs.size()-1;i++) {
//	System.out.println(i);
//}

	
}
}
