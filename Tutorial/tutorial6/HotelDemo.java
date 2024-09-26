package tutorial6;
import java.util.Scanner;

class InvalidReservationException extends Exception{
	private String message;
	public InvalidReservationException(String msg){
		message=msg;
	}
	public String getMessage(){
		return message;
	}
}
class HotelRoom{
	void Reservation(int room) {
		try {
			if(room<=0) {
				throw new InvalidReservationException("Invalid Reservation") ;
			}
			else {
				System.out.println("Reservation Done!");
			}
		}catch(InvalidReservationException e){
			System.out.println(e.getMessage());
		}
	}
}
public class HotelDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rooms you want to book:");
		int rooms=sc.nextInt();
		HotelRoom hr=new HotelRoom();
		hr.Reservation(rooms);
	}
}

