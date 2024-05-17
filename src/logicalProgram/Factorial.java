package logicalProgram;

public class Factorial {
 public static void main(String[] args) {
	 
	 int num= 5;
	 int num1=1;
	 
	 for(int i=num; i>=1; i--) {
		 num1 = num1*i;
		 //1*5=5
		 //5*4=20
	 }
	 System.out.println(num1);
	
}
}
