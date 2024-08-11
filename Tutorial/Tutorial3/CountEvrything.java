package tutorial4;
import java.util.Scanner;
public class CountEvrything {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the text:");
		String str=sc.nextLine();
		int l=str.length(),wordCount=1,lineCount=1,charCount=str.length(),spaceCount=0,alphaCount=1,numCount=0;
		str=str.toLowerCase();
		for(int i=0;i<l-1;i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				spaceCount++;
				if(ch==' ' && ch+1!=' ') {
					wordCount++;
				}
			}
			else if(ch=='\n') {
				lineCount++;				
			}
			else if(ch>='a'&&ch<='z') {
				alphaCount++;

			}
			else if(ch>='0'&&ch<='9') {
				numCount++;
			}			
		}
		System.out.println("The text is:"+str+
				"\nThe number of Characters in the text is:"+charCount+
				"\nThe number of Words in the text is:"+wordCount+
				"\nThe number of Lines in the text is:"+lineCount+
				"\nThe number of Spaces in the text is:"+spaceCount+
				"\nThe number of Alphabets in the text is:"+alphaCount+
				"\nThe number of Digits in the text is:"+numCount);
	}
}
