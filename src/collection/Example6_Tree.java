package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example6_Tree {
public static void main(String[] args) {
	TreeSet tr = new TreeSet();
	tr.add(100);
	tr.add(200);
	tr.add(125);
	tr.add(175);
	tr.add(195);
	tr.add(155);
	tr.add(155);
	System.out.println(tr);
	
//System.out.println(tr);
//System.out.println(tr.size());
//System.out.println(".........................");
//System.out.println(tr.first());
//System.out.println(".........................");
//System.out.println(tr.last());
//System.out.println(".........................");

tr.pollFirst();
System.out.println(tr);
System.out.println(".........................");
tr.pollLast();
System.out.println(tr);
Iterator IT = tr.iterator();
while(IT.hasNext()) {
	System.out.println(IT.next());

	
}
}
}
