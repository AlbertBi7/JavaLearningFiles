package labPrograms24;
import java.io.*;
import java.util.Scanner;

public class FileWriterReader {

	public static void main(String[] args) throws IOException {
		File f1=new File("sample.txt");
		Scanner sc=new Scanner(System.in);
		
		if(f1.createNewFile()) {
			System.out.println(f1.getName()+" is created");
			System.out.println();
		}else {
			System.out.println(f1.getName()+" exists");
		}
		String s;
		try {
			FileWriter Fw=new FileWriter("sample.txt");
			System.out.print("Enter the string:");
			s=sc.nextLine();
			
			Fw.write(s);
			System.out.println("Content Written to sample.txt");
			Fw.close();
		}catch(IOException e) {
			System.out.print(e);
		}
		
		File f2=new File("new-sample.txt");
		
		if(f2.createNewFile()) {
			System.out.println(f2.getName()+" is created");
			System.out.println();
		}else {
			System.out.println(f2.getName()+" exists");
		}
		FileReader Fr=new FileReader("sample.txt");
		FileWriter Fw1=new FileWriter("new-sample.txt");
		int c;
		try {
			System.out.println("***Contents of sample.txt***");
			while((c=Fr.read())!=-1){
				System.out.print((char)c);
				Fw1.write(c);
				
			}
			
			System.out.println("\nContents Copied from sample.txt to new-sample.txt");
			Fr.close();
			Fw1.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		FileReader Fr1=new FileReader("new-sample.txt");
		
		try {
			System.out.println("***Contents of new-sample.txt***");
			while((c=Fr1.read())!=-1){
				System.out.print((char)c);
			}
			Fr1.close();
		}catch(IOException e) {
			System.out.println(e);
		}

		
		

	}

}
