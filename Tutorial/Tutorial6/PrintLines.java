package tutorial8;
import java.io.*;
public class PrintLines {
	public static void main(String[] args) {
		File f=new File("MyFile.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader("MyFile.txt"));
			int i;
			int lineNumber=1;
			char c='.';
			boolean newSentence = true;
			while((i=br.read())!=-1){
				if (newSentence) {
                    System.out.print(lineNumber + ":");
                    newSentence = false;
				}
				if(i==(c)) {
					if(br.read()==-1) {
						break;
					}
					 System.out.print((char) i); 
	                    System.out.println();
	                    lineNumber++;  
	                    newSentence=true;
				}else {
				System.out.print((char)i);
				}
			}
			
			br.close();
			
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}
