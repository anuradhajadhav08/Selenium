package collection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector {
	public static void main(String[] args) {
		
	
	Vector v = new Vector();
	v.add("Rahul");
	v.add(65.5f);
	v.add('A');
	v.add("Rahul");
	v.add(null);
	v.add(101);
	v.add(null);
System.out.println(v.capacity());
	System.out.println(v);

	System.out.println(v.size());
	System.out.println(v.get(0));//print value of specific  index 0
	v.set(4, "Nayna");//modify/update the data
	System.out.println("...........................");
	System.out.println(v.get(4));
	v.remove(4);
	System.out.println(v);
	System.out.println("...........................");
	//print Arraylist data using Iterator
	Iterator itr = v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("...........................");
	//print data using for listIterator
	ListIterator litr = v.listIterator();
	

	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	System.out.println("...........................");
	//print Arraylist data using Enumaration 
Enumeration enu = v. elements();
	while(enu.hasMoreElements()) {
	System.out.println(enu.nextElement());	
	}
	System.out.println("---------------------------------");

//Arraylist data using for loop
	for(int i=0;i<v.size()-1;i++) {
		System.out.println(v.get(i));
	}
	System.out.println("...........................");
	//Print data using for each loop
	for(Object  s1:v) {
	System.out.println(s1);	
	}
}
}


 





