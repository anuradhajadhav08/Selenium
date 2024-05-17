package logicalProgram;

public class Example3_Armtrong_1 {
	
	public static void main(String[] args) {
		
//		int org = 153;
//		int sum = 0;
//		
//		for(int i=org;i>0;i=i/10) {
//			
//			int rem = i%10;
//			
//			sum=sum+(rem*rem*rem);
//		}
//			
//			if(org==sum) {
//				System.out.println("Given No."+org+" is  Armtrong");
//				
//			}
//			else {
//				System.out.println("Given No."+org+" is not Armtrong");
//			}
			int num=153;
			int sum = 0;
			                   
			              
			
			for(int i=num;i>0;i=i/10) {
				int rem=i%10;
				
			
				 sum= sum+(rem*rem*rem);
//				
//				
				 
//			}
			if(num==sum) {
				System.out.println("Given no."+num+" is an Armstrong number");
			}
			else {
				System.out.println("Given no."+num+" is not an Armstrong number");
			}
			
		}
	}
}


