package logicalProgram;

public class Example1_ReverseNo_5 {
public static void main(String[] args) {
	
	String org = "abcd";
	String   rev=" ";
	for(int i=org.length()-1; i>=0;i--) {
		   
		 rev=rev+org.charAt(i);
		 
	}
	System.out.println(rev);//4
	
	
}
}
