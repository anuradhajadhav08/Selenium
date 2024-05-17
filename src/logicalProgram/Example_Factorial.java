package logicalProgram;

public class Example_Factorial {
public static void main(String[] args) {
	
	int num1 =16; //4*3*2*1=24
	int num2=1;
	//4
	//3
	//2
	for(int i=num1; i>=1;i--) {
		
		num2= num2*i;
		//1*4=4
		//4*3=12
		//12*2=24
		
		
	}
	System.out.println(num2);
	
}
}
