package logicalProgram;

public class Example9_PrintStatment_inReverseOrder {
	public static void main(String[] args) {
		
		
		String s1="I Love My Country";
				
				String[] ar = s1.split("");
				
				for(int i=ar.length-1;i>=0;i--) {
					System.out.print(ar[i]+"");
				}
}
}