package logicalProgram;

public class Example20_RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		
		String str = "a  b c d   f";
		int count = 0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char abc = str.charAt(i);
			if(abc==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
		System.out.println("No of Spaces in given String:"+count);
		
		
		String abc = str.replace(" ", "");
		System.out.println(abc);
	}
}
