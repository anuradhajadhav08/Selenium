package logicalProgram;

public class Example14_SwapingOfTwoNoWithoutUsingThiredNo {
public static void main(String[] args) {
	int num1=10;
	int num2 =20;
	System.out.println("Before swap");
	System.out.println("First no :"+ num1);
	System.out.println("second no :"+ num2);
	
	num1=num1+num2;//30
	num2=num1-num2;//10
	num1=num1-num2;//20
	
	
	System.out.println("After swap");
	System.out.println("First no :"+ num1);
	System.out.println("second no :"+ num2);
	
}
}
