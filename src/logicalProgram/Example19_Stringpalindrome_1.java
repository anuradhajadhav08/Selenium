package logicalProgram;

public class Example19_Stringpalindrome_1 {
 public static void main(String[] args) {
	
	 String org ="ababa";
	 String rev =" ";
	 for(int i=org.length()-1;i>=0;i--) {
		rev= rev+org.charAt(i);
		 
	 }
	 System.out.println(rev);
	 if(org.equals(rev)) {
		 System.out.println("String is   Palindrome");
	 }
	 else {
		 System.out.println("String is not Palindrome");
	 }
}
 
	 
 }
