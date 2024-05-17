package logicalProgram;

public class Example7_ReverseeachWord_InStatment_1 {

	
	public static void main(String[] args) {
		String s1= "India Is My Country";
		String []ar = s1.split(" ");
		
		for(int i=0;i<=ar.length-1;i++) {
			
			String org = ar[i];//get indexing
			String rev =" ";
			
			for(int j=org.length()-1; j>=0; j--  ) {
				rev=rev+org.charAt(j);
				
				
			}
			System.out.println(rev);
			
		}
		
	}		
}
