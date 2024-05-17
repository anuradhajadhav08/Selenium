package Oops;

public class MultiLevel_3 extends MultiLevel_2 {
	public void s3() {
		
		System.out.println("Mobile: Iphone");
		
	}
	
	public static void s4() {
		System.out.println("Car:BMW");
	}
	
	public static void main(String[] args) {
		MultiLevel_3 abc = new MultiLevel_3();
		
		abc.s1();
		abc.s2();
		abc.s3();
		
		MultiLevel_3.s4();
		
	}
}
