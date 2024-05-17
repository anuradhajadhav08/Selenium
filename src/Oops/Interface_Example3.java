package Oops;

public  class Interface_Example3 implements Interface_Example1,Interface_Example2 {
	public void m1() {
		System.out.println("Hello");
	}
	
	public void m2() {
		System.out.println("Hiiiiii");
	}
	
	public void m3() {
		System.out.println("Good Morning");
	}
	public void m4() {
		System.out.println("Good Night");
	}
	public static void main(String[] args) {
		Interface_Example3 abc = new Interface_Example3();
		
		abc.m1();
		abc.m2();
		abc.m3();
		abc.m4();
		System.out.println(abc.a);
	}
	
}
