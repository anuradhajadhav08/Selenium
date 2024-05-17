package logicalProgram;

public class Example15_ReverseNumber {
public static void main(String[] args) {
	int OrgNum=12345;
	int RevNum=0;
	 //12345
	//1234
	//123
	//12
	
	for(int i=OrgNum; i>0;  i=i/10) { //12345/10=1234.5//123.4//12//1
		int rem =i%10;//12345%10=1234.5: 123.4=4//12.3//1.2//0.1
		RevNum=RevNum*10+rem;
		//0*10+5=5
		//5*10+4=54
		//54*10+3=543
		//543*10+2=5432
		//5432*10+1=54321
	}
	System.out.println(RevNum);
}
}
