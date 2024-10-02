package tutorial6;
import java.util.Scanner;

class InvalidScoreException extends Exception{
	private String message;
	public InvalidScoreException(String msg) {
		message=msg;
	}
	public String getMessage(){
		return message;
	}
}

class Student{
	void CheckScore(int score) {
		try {
			if(0>score ||  score>100) {
				throw new InvalidScoreException("Score should be between 0 and 100");
			}
			else {
				System.out.println("Score of the student is:"+score);
			}
		}catch(InvalidScoreException e){
			System.out.println(e.getMessage());
		}
	}
}

public class ScoreDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score of the student:");
		int score=sc.nextInt();
		Student S=new Student();
		S.CheckScore(score);
	}
}
