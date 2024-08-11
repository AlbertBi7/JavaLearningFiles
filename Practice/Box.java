package miscellaneous;
import java.util.Scanner;
class Boxdemo{
	int width;
	int height;
	int depth;
	double volume(int h,int w,int d){

		System.out.println(height+" "+width+" "+depth);
		System.out.println(h+" "+w+" "+d);
		return width*height*depth;
	}
}

public class Box {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boxdemo box=new Boxdemo();
		System.out.print("Enter the width ,height and depth:");
		box.width=sc.nextInt();
		
		box.height=sc.nextInt();
		
		box.depth=sc.nextInt();
		
		double vol=box.volume(box.height,box.width,box.depth);
		System.out.println(vol);
	}

}
