package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example4_HashSet {
public static void main(String[] args) {
	HashSet hs= new HashSet();
	hs.add("Anuradha");
	hs.add(101);
	hs.add('B');
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	hs.remove('B');
	System.out.println(hs);
	//Print all data using iterator
	Iterator itr = hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	System.out.println("...........................");
	for (Object s1:hs) {
		System.out.println(s1);
	}
}
}
