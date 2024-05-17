package logicalProgram;

public class Example18_Factorial_1 {
	
public static void main(String[] args) {
	
int org = 5;
int fact = 1;

for(int i=org;i>=1;i--) {
	
	fact=fact*i;
	
}
System.out.println(fact);
}
}
