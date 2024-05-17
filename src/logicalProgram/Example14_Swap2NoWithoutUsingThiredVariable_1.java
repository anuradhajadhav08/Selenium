package logicalProgram;

public class Example14_Swap2NoWithoutUsingThiredVariable_1 {
public static void main(String[] args) {
	 int a=30;
	 int b=20;
	 
	 System.out.println("Before Swap:"+ a);
	 System.out.println("Before Swap:"+ b);
	 
	 a=a+b;//50
	 b=a-b;//30
	 a=a-b;//20
	 
	 
	 System.out.println("after Swap:"+ a);
	 System.out.println("after Swap:"+ b);
}
}
