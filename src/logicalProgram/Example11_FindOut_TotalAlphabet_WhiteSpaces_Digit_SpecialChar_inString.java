package logicalProgram;



public class Example11_FindOut_TotalAlphabet_WhiteSpaces_Digit_SpecialChar_inString {
public static void main(String[] args) {
	String str = "xyz 123 @#%";
	
	int CountLetter=0;
	int CountDigit=0;
	int CountWhiteSpace=0;
	int CountSplChar=0;
	
	String onlyLetter="";
	String onlyDigit="";
//	String onlySpecialchar="";
//	String onlyWhiteSpace="";
//	
	for(int i=0; i<str.length()-1;i++) {
		char allstr = str.charAt(i);
		
		if(Character.isLetter(allstr)) {
			CountLetter++;
			onlyLetter=onlyLetter+allstr;
		}
		else if(Character.isDigit(allstr)) {
			CountDigit++;
			onlyDigit=onlyDigit+allstr;
		}
		else if(Character.isWhitespace(allstr)) {
			CountWhiteSpace++;
			//onlyWhiteSpace=onlyWhiteSpace+allstr;
		}
	else {
		CountSplChar++;
		//CountSplChar=CountSplChar+allstr;
		
	}
	}
	System.out.println("letter:"+CountLetter);
	System.out.println("Digit:"+CountDigit);
	System.out.println("WhitSpace:"+CountWhiteSpace);
	System.out.println("SpecialCharacter:"+CountSplChar);
	
	
	System.out.println(onlyLetter);
	System.out.println(onlyDigit);
//	System.out.println(onlySpecialchar);//output nahi aayega iska
//	System.out.println(onlyWhiteSpace);//output nahi aayega iska
//	
	
}
}
