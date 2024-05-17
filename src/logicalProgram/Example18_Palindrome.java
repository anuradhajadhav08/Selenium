package logicalProgram;

public class Example18_Palindrome {
	public static void main(String[] args) {
		
	

	String num1="abcba";//abcba
	
	String num2="";
	for(int i=num1.length()-1; i>=0; i--) {
		 num2=num2+num1.charAt(i);
		
	}
	System.out.println(num2);
	
	
	
	
	
	if(num1.equals(num2)) {
		System.out.println("String is Palindrome");
	}
	else {
		System.out.println("String is not Palindrome");
	}
	
	
		
	
}
}
