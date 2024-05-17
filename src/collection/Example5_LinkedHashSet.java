package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example5_LinkedHashSet {
	public static void main(String[] args) {
		 LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("Anuradha");
		lhs.add(101);
		lhs.add('B');
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		lhs.remove('B');
				
		System.out.println(lhs);
		
		//System.out.println(lhs.getFirst("Anuradha"));

		//Print all data using iterator
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("...........................");
		for (Object s1:lhs) {
			System.out.println(s1);
		}
	}
}
