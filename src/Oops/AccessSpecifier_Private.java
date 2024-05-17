package Oops;

public class AccessSpecifier_Private {
	int a;
	int b;

	private void add() {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		AccessSpecifier_Private abc = new AccessSpecifier_Private();
		 
		 abc.add();
	}
}
