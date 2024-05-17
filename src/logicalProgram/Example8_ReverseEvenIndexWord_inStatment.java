package logicalProgram;

public class Example8_ReverseEvenIndexWord_inStatment {
public static void main(String[] args) {
	
	
	String s1="I Love My Country";
			
			String[] ar = s1.split("");
			
			for(int i=0;i<=ar.length-1;i++) {
				String arg=ar[i];
				
				
				if(i%2==0) {
					String rev=reverse(arg);
					System.out.print(rev+ "");
				}
				else {
					System.out.print(arg+"");
				}
			}
}

private static String reverse(String arg) {
	String rev="";
	
	
	for(int j=arg.length()-1;j>=0;j--) {
		rev=rev+arg.charAt(j);
	}
	return rev;
	
}




}
