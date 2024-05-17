package logicalProgram;

public class Example15_ReverseNumber_2 {
public static void main(String[] args) {
	int original=112233;
	int reverse=0;
	
	for(int i=original;i>0;i=i/10) {
		int rem = i%10;//3
		reverse=reverse*10+rem;//332211
	}
	System.out.println(reverse);
}
}
