package logicalProgram;

public class Example6_SplitStatment_1 {

	public static void main(String[] args) {
		            //0...1...2...3
		String abc = "I love My Country";
		String[] xyz = abc.split(" ");
		System.out.println(xyz[2]);
		
		for(int i=0 ; i<=xyz.length-1;i++) {
			System.out.println(xyz[i]);
			
		}
		
		
		
	}
}
