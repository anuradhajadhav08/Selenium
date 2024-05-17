package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example7_ArrayList {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Rahul");
		al.add(65.5f);
		al.add('A');
		al.add("Rahul");
		al.add(null);
		al.add(101);
		al.add(null);
		System.out.println(al.get(2));
		al.set(4, "Snehal");
		System.out.println(al.get(4));
		System.out.println(al.indexOf(101));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf("Rahul"));
		System.out.println("------------------------------");
	   Iterator  itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}
		System.out.println("---------------------------------");
		ListIterator ll = al.listIterator();
		while(ll.hasNext()) {
			System.out.println(ll.next());
			
		}
		 
		
			
			
			
		
			
			
		
			
		

	}
}
