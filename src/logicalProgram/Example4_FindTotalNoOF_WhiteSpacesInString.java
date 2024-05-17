package logicalProgram;

public class Example4_FindTotalNoOF_WhiteSpacesInString {
public static void main(String[] args) {
	
	String str=" a b c   d";
	
	int count=0;
	
	for(int i=0;i<=str.length()-1;i++) {
		char s1 = str.charAt(i);
		
		
		if(s1==' ') {
		count++;	
		}
	}
	System.out.println("Number of spaces given in the string:"+count);
}
}
