package logicalProgram;

public class Example4_FindNo_OfWhiteSpacesInString_1 {
public static void main(String[] args) {
	
	String s1="ab c   gh";
	int count=0;
	
	for(int i=0; i<=s1.length()-1;i++) {
		char s2 = s1.charAt(i);
		
		if(s2== ' ') {
			count++;
			
		}
		
	}
	System.out.println("No. of spaces given in the String:"+ count);
}
}
