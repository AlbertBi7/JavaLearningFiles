package labPrograms24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class OddEvenFIle {
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
	File fnum=new File("number.txt");
	if(fnum.createNewFile()) {
		System.out.println(fnum.getName()+" is created");
		System.out.println();
	}else {
		System.out.println(fnum.getName()+" exists");
	}
	File fodd=new File("odd.txt");
	if(fodd.createNewFile()) {
		System.out.println(fodd.getName()+" is created");
		System.out.println();
	}else {
		System.out.println(fodd.getName()+" exists");
	}
	File feven=new File("even.txt");
	if(feven.createNewFile()) {
		System.out.println(feven.getName()+" is created");
		System.out.println();
	}else {
		System.out.println(feven.getName()+" exists");
	}
	System.out.println("Enter the number of elements you want to store in the file:");
	int n=sc.nextInt();
	sc.nextLine();
	int s;
	
	FileOutputStream FWnum= new FileOutputStream("number.txt");
	System.out.println("Enter the elements :");
	for(int i=0;i<n;i++) {
		s=sc.nextInt();
		FWnum.write(s);
		FWnum.write('\n');
	}
	FWnum.close();
	System.out.println("Data Added\n");
	FileInputStream FRnum= new FileInputStream("number.txt");
	FileOutputStream FWodd= new FileOutputStream("odd.txt");
	FileOutputStream FWeven= new FileOutputStream("even.txt");
    InputStreamReader ir=new InputStreamReader(FRnum);
	
	int c;
	try {
		System.out.println("Contents of number.txt");
		
		
		while((c=ir.read())!=-1){
			
			if(c!='\n') {
				System.out.println(c);
				if(c%2==0) {
					
					FWeven.write(c);
					
					
				}else {
					FWodd.write(c);
					
				}
			}
		}
		FRnum.close();
		FWodd.close();
		FWeven.close();
		
		
	}catch(IOException e) {
		System.out.println(e);
	}
	FileInputStream FRodd= new FileInputStream("odd.txt");
	try {
		System.out.println("Contents of odd.txt");
		
		while((c=FRodd.read())!=-1){
			System.out.println(c);
		}
		
	}catch(IOException e) {
		System.out.println(e);
	}
	FileInputStream FReven= new FileInputStream("even.txt");
	try {
		System.out.println("Contents of even.txt");
		
		while((c=FReven.read())!=-1){
			System.out.println(c);
		}
		
	}catch(IOException e) {
		System.out.println(e);
	}

	
	
	
	}
	
	

}
