package logicalProgram;

public class Example1_ReverseNumber{
public static void main(String[] args) {
	int orgNum=12345;
	String org=Integer.toString(orgNum);
	String rev="";
	for(int i= org.length()-1; i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	int revNum=Integer.parseInt(rev);
	System.out.println(revNum);
}
}
