package tutorial8;
import java.io.*;

public class WriteReadBinary {

	public static void main(String[] args) {
		File f=new File("binary.dat");
		String s;
		try {
			FileOutputStream fo=new FileOutputStream("binary.dat");
			s="HELOO WORLD!";
			byte[] c=s.getBytes();
			
			fo.write(c);
		} catch (IOException e) {
			
			e.getMessage();
		}
		try {
			FileInputStream fi=new FileInputStream("binary.dat");
			int i;
			while((i=fi.read())!=-1){
				System.out.print((char)i);
			}
		} catch (IOException e) {
			
			e.getMessage();
		}
	}
}




