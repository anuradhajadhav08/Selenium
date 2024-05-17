package logicalProgram;

public class Example8_ReverseEvenIndex1 {
public static void main(String[] args) {
	String s1 = "India Is My Country";
	
	String[]ar=s1.split(" ");
	
	for(int i=0; i<=ar.length; i++) {
		String org = ar[i];
		
		if(i%2==0) {
		String rev=ReverseString(org);
		System.out.println(rev+" ");
		}
		else {
			System.out.println(org+"" );
		}
		
	}
	
	
}

public static String ReverseString(String org) {
	String rev = "";
	
	for(int j=org.length()-1; j>=0; j--) {
		rev=rev+org.charAt(j);
		
		
	}
	return rev;
}
}
