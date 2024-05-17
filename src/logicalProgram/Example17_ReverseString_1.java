package logicalProgram;

public class Example17_ReverseString_1 {
public static void main(String[] args) {
	String org ="anuradha";
	String rev = " ";
	
//	for(int i=org.length()-1;i>=0; i--) {
//	 rev=rev+org.charAt(i);	
//	}
//	System.out.println(rev);
	
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
}
}
