package logicalProgram;

public class Palindrome {

	public static void main(String[] args) {
		 
		String org="abcd";// rev abcba
		String rev="";
		//abcd 1 to 3
		for(int i=org.length()-1;i>=0 ;i--) {
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
		System.out.println("It is not Palindrome");
	}
}
}
