//write a program to print 1 to 55 number if the number is divisible by 2 print even 
//if number divisible by 3 print odd if number divisible by 2 and 3 print multiple else print number
package logicalProgram;

public class Interview_Program {
public static void main(String[] args) {
	int num = 55;
	for(int i=1;i<=55;i++) {
		System.out.println(i);
		//System.out.println("-------------------");
		
		 if(num%2==0){
			System.out.println("Given no is Even");
		}
	    else if(num%3==0) {
			System.out.println("Given no is Odd");
			
		}
	    else if(num%2==0 & num%3==0) {
			System.out.println("Print Multiple");
		}
		
		
	}
}
}

