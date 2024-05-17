package logicalProgram;

public class Armtrong_1 {
	
	
	public static void main(String[] args) {
		
		
		int num1=153;//1+125+27=153
		int sum=0;
		//153 
		//15
		//1
		for(int i=num1; i>0; i=i/10) {//153/10=15.3//1
			
			int rem = i%10;//153%10=15.3=3//1.5
			sum=sum+(rem*rem*rem);
			//0+3*3*3=27
			//27+125
			//152+1=153
		}
		if(num1==sum) {
			System.out.println("Given no is Armtrong");
		}
		else {
			System.out.println("Given no is  not Armtrong");
		}
		
	}

}
