package logicalProgram;

public class NoOfWhiteSpecesInString {

	
	public static void main(String[] args) {
		
		String abc = "abdfg ";
		int count=0;
		
		for(int i=0; i<=abc.length()-1;i++) {
			
			
			char xyz = abc.charAt(i);//a,b,d
			
			if(xyz==' ') //a
			{
				
				count++;//1,2
			}
		}
			System.out.println("No. of white Spaces in String:"+count);
			
		}
		
	}

