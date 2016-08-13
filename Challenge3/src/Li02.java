import java.util.Scanner;

public class Li02 
{
	public static void main(String [] args) 
	{
	    System.out.println(maxLen("hoopla"));
	}

	public static int maxLen(String input)
	{
	    // Avoid NPEs
	    if(input==null){
	        return 0;
	    }
	    int maxLen = 0;
	    int tempLen = 0;
	    char prevChar = 0;
	    for(int i=0;i<input.length();i++){
	        final char c =input.charAt(i);
	        if(c == prevChar){
	            tempLen++;
	        }else{
	            maxLen = (tempLen>maxLen)?tempLen:maxLen;
	            prevChar = c;
	            tempLen = 1;
	        }
	    }
	    maxLen = (tempLen>maxLen)?tempLen:maxLen;
	    return maxLen;
	}
}
