package logicalProgram;

public class ReverseNO {
public static void main(String[] args) {
	
	int abc= 12345;
	int rev=0;
	
	for(int i=abc;i>=0;i=i/10) {
		int rem = i%10;
		rev= rev*10+rem;
		
	}
	System.out.println(rev);
}
}
