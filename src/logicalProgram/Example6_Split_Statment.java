package logicalProgram;

public class Example6_Split_Statment {
public static void main(String[] args) {
	
	
String str="I Love My Country";
	
 String[] s1 = str.split(" ");
	System.out.println(s1[3]);
	
	System.out.println("-----------------------");
	
	for(int i=0; i<=s1.length-1;i++) {
		 System.out.println(s1[i]);
	}

}
}
