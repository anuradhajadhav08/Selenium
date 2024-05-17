package Framework;

public class Encapsulation {
	// Declaratiom
 private int num;
 
 //
  public Encapsulation() {
	  num=10;
  }
  public void add () {
	  System.out.println(num*num);
	
}
  
  public static void main(String[] args) {
	  Encapsulation en = new Encapsulation();
	  en.add();
	  System.out.println(en.num);
}
  
}
