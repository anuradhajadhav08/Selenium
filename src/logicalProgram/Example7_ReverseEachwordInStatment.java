package logicalProgram;

public class Example7_ReverseEachwordInStatment {

	public static void main(String[] args) {
		
		String org = "My Name Is Anuradha";
		
	String[] ar = org.split(" ");
	
	for(int i=0; i<=ar.length-1; i++) {
		
	//System.out.println(ar[i]);	

	
	String s1 = ar[i];
	String rev = "";
	for(int j=s1.length()-1; j>=0 ; j--) {
		
		rev=rev+s1.charAt(j);
		
	}
	System.out.println(rev+" ");
	}
	
		
	}
}
//String s1 = "India is my country";
//
//String[] ar = s1.split(s1);
//
//for(int i=0; i<=ar.length-1;i++) {
//	 System.out.println(ar[i]);
//	
//	String org = ar[i];
//	String rev = "";
//	
//	for(int j=org.length()-1;j>=0;j--) {
//		
//		rev=rev+org.charAt(j);
//		
//	}
//	System.out.print(rev+" ");
//	 
//	
//	
//}
//
//}
//}
