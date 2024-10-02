package tutorial8;
import java.io.*;

public class CopyFile {
	public static void main(String[] args) throws IOException {
			
			File file1=new File("file1.txt");
			File file2=new File("file2.txt");
			
			file1.createNewFile();
			file2.createNewFile();
				
			if(file1.exists()) {
				System.out.println("file 1 exists");
			}else {
				System.out.println("file 1 Doesnt exists");
			}
			if(file2.exists()) {
				System.out.println("file 2 exists");
			}else {
				System.out.println("file 2 Doesnt exists");
			}
			int c;
		    FileInputStream f1in = new FileInputStream("file1.txt");
		    FileOutputStream f2out = new FileOutputStream("file2.txt");
			
		    while ((c = f1in.read()) != -1) {
		            f2out.write(c);
			}
		    System.out.println("File contents copied from file1 to file2");
			f2out.close();     
			f1in.close();
		    
			f1in = new FileInputStream("file1.txt");
		    try {
			    System.out.println("**file contents of file1**");
			    while ((c = f1in.read()) != -1) {
			    		  System.out.print((char)c);
				}
		    }catch(IOException e) {
				        	System.out.print(e.getMessage());
		    }
			f1in.close();
		    FileInputStream f2in =new FileInputStream("file2.txt");    
		    try {
			    System.out.println("\n**file contents of file2**");
		        while ((c = f2in.read()) != -1) {
		        	  	  System.out.print((char)c);
		        }
		    }catch(IOException e) {
		        	  System.out.print(e.getMessage());
		    }
		    f2in.close();
	}
}


