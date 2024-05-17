package logicalProgram;

public class Example15_ReverseString {
public static void main(String[] args) {
//	int org = 1234;
//	
//	int RevNo= 0;
//	
//	for(int i=org; i>0; i=i/10) {
//		int rem=i%10;
//		
//		RevNo=RevNo*10+rem;
//		
//	}
//	System.out.println(RevNo);
//	
	
	
	
//	int orgno = 5678;
//	
//	int revno = 0;
//	
//	for(int i=orgno; i>0; i=i/10) {
//		 int rem = i%10;
//		 
//		 revno=revno*10+rem;
//		
//	}
//	System.out.println(revno);

	
	int orgno = 1234;
	
	String org = Integer.toString(orgno);
	
	String rev = "";
	 for(int i=org.length()-1;i>=0;i--) {
		 
		 rev=rev+org.charAt(i);
		 
	 }
	 int revno=Integer.parseInt(rev);
			 System.out.println(revno);
	
}
}
