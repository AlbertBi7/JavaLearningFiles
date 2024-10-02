package tutorial8;
import java.io.*;

public class WriteReadBinary {

	public static void main(String[] args) throws IOException {

		String s;
		try {
			FileOutputStream fo=new FileOutputStream("binaryInput.dat");
			s="MAN WILL IF HE CAN";
			byte[] c=s.getBytes();
			
			fo.write(c);
			fo.close();
		} catch (IOException e) {
			
			e.getMessage();
		}
		
		try {
			FileInputStream fi=new FileInputStream("binaryInput.dat");
			FileOutputStream fo=new FileOutputStream("binaryOutput.dat");
			
			int i;
			while((i=fi.read())!=-1){
				fo.write(i);
			}
			fi.close();
			fo.close();
			System.out.println("File copied Successfuly");
		} catch (IOException e) {
			
			e.getMessage();
		}
		
		
	}
}





