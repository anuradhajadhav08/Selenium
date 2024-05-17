package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {
	public static void main(String[] args) {
		
	
	ArrayList al = new ArrayList();
	al.add("Rahul");
	al.add(65.5f);
	al.add('A');
	al.add("Rahul");
	al.add(null);
	al.add(101);
	al.add(null);
	
	System.out.println(al.get(2));
	System.out.println(al.size());
	System.out.println(al.contains("xyz"));
	System.out.println(al.isEmpty());
	System.out.println(al.lastIndexOf("Rahul"));
	System.out.println(al.getLast());
	System.out.println(al.getFirst());
	
	System.out.println("................................");
	
	Iterator abc = al.iterator();
	while(abc.hasNext()) {
		System.out.println(abc.next());
		
	}
	System.out.println("...........Print All Data Using Listiterator.....................");
	
	ListIterator xyz = al.listIterator();
	while(xyz.hasNext()) {
		System.out.println(xyz.next());
		
	}
	System.out.println("--------------------------------");
	for(int i=0; i<=al.size()-1;i++) {
		System.out.println(al.get(i));
	}
	System.out.println("--------------------------------");
	for(Object s1:al) {
		System.out.println(s1);
	}
	
	
	
	
	

}

	}
