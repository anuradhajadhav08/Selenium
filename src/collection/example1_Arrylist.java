package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example1_Arrylist {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Rahul");
	al.add(65.5f);
	al.add('A');
	al.add("Rahul");
	al.add(null);
	al.add(101);
	al.add(null);

	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.get(0));//print value of specific  index 0
	al.set(4, "Nayna");//modify/update the data
	System.out.println("...........................");
	System.out.println(al.get(4));
	al.remove(4);
	System.out.println(al);
	System.out.println("...........................");
	//print Arraylist data using Iterator
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("...........................");
	//print data using for listIterator
	ListIterator litr = al.listIterator();
	

	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	System.out.println("...........................");
//Arraylist data using for loop
	for(int i=0;i<al.size()-1;i++) {
		System.out.println(al.get(i));
	}
	System.out.println("...........................");
	//Print data using for each loop
	for(Object  s1:al) {
	System.out.println(s1);	
	}
}
}
