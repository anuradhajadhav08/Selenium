package logicalProgram;

public class Armstrong {
// 153= 1+125+27=153
	public static void main(String[] args) {
		int num=153;
		int sum = 0;
		                    // 15
		               //15>0 
		//1>0
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;//153%10=15.3
			//15%10=1.5
			//1%10=0.1
			 sum= sum+(rem*rem*rem);
//			0+3*3*3
//			27+125
			 //152
//		}
		if(num==sum) {
			System.out.println("Given no."+num+" is an Armstrong number");
		}
		else {
			System.out.println("Given no."+num+" is not an Armstrong number");
		}
//		 int orgnum=153;
//		 
//		 int sum = 0;
//		 
//		 for(int i=orgnum;i>0;i=i/10) {
//			int rem=i%10;
//			sum = sum+(rem*rem*rem);
//		 }
//		 
//		 
//		 if(orgnum==sum) {
//			 System.out.println("Given no."+orgnum+" is an Armstrong number");
//		 }
//		 else
//		 {
//			 System.out.println("Given no."+orgnum+" is not an Armstrong number"); 
//		 }

		
		
	}
}
}

