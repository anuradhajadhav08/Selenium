package logicalProgram;

public class Example3_Armstrong_Number {
public static void main(String[] args) {
	 int orgnum=153;
	 
	 int sum = 0;
	 
	 for(int i=orgnum;i>0;i=i/10) {
		int rem=i%10;
		sum = sum+(rem*rem*rem);
	 }
	 
	 
	 if(orgnum==sum) {
		 System.out.println("Given no."+orgnum+" is an Armstrong number");
	 }
	 else
	 {
		 System.out.println("Given no."+orgnum+" is not an Armstrong number"); 
	 }
}
}
