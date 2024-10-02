package tutorial8;
import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		        String[] content = {
		            "This is the University Exam for OODP.",
		            "This is a program to illustrate the use of files."
		        };

		        try {
		            
		            File file = new File("MyFile.txt");
		            FileWriter writer = new FileWriter(file);

		            for (String line : content) {
		                writer.write(line + "\n");
		            }
		            writer.close();
		            System.out.println("File created: " + file.getName());
		            System.out.println("Content written to the file successfully.");

		        } catch (IOException e) {
		            System.out.println("An error occurred.");
		            
		        }
		        FileInputStream reader=new FileInputStream("MyFile.txt");
		        int c;
		        try {
				    
			        while ((c = reader.read()) != -1) {
			        	  	  System.out.print((char)c);
			        }
			    }catch(IOException e) {
			        	  System.out.print(e.getMessage());
			    }
		    }
	}


