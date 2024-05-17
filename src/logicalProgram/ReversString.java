package logicalProgram;

public class ReversString {
public static void main(String[] args) {
	
	String org ="abcde";//a=0,b=1,e=4//
	
	String rev="";
	//abcd
	//abc
	//ab
	//a                             abcd
	                                //abc
	for(int i=org.length()-1; i>=0; i--) {//4-0
		 rev=rev+org.charAt(i);
		 //0+e=e
		 
		      //e+d=ed
		 //ed+c=edc
		 //
	}
	System.out.println(rev);//edcba
	
	
}
}
