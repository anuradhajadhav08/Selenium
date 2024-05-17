package logicalProgram;

public class Example6_SplitStatment {
	
	public static void main(String[] args) {
		
		String s1 = "My Name Is Anuradha";
		
		String[] s2 = s1.split(" ");
		
		System.out.println(s2[2]);
		
		for(int i=0; i<=s2.length-1;i++) {
			
			System.out.println(s2[i]);
			
		}
		
	}

}
