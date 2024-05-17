package logicalProgram;

public class Example5_RemoveDigitFromString {
public static void main(String[] args) {
	 String str="abc12xy34";
	 String str1="";
	 
	 int CountLetter=0;
	 
	 for(int i=0;i<=str.length()-1;i++)
	 {
		 char s1 = str.charAt(i);
		 
		 
		 if(!Character.isDigit(s1)) 
		 {
			 CountLetter++;
			 str1=str1+s1;
		 }
	 }
	 System.out.println(str1);
	 System.out.println("CountLetter:"+CountLetter);
}
}
