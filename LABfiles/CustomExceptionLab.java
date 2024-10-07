package miscellaneous;
import java.util.Scanner;
class InvalidAmountException extends Exception {
	private String message;
	public InvalidAmountException(String msg) {
		message=msg;
	}
	public String getMessage() {
		return message;
		
	}

}
class InsufficientFundsException extends Exception {
	private String message;
	public InsufficientFundsException(String msg) {
		message=msg;
	}
	public String getMessage() {
		return message;
		
	}

}


class CustomBank{
	Scanner sc=new Scanner(System.in);
	String accNo;
	String accType;
	String accName;
	long balance;
	
	
	void openAcc() {
		System.out.print("Enter Account No:");
		accNo=sc.nextLine();
		System.out.print("Enter Account Type:");
		accType=sc.nextLine();
		System.out.print("Enter Name:");
		accName=sc.nextLine();
		System.out.print("Enter Initial Balance:");
		balance=sc.nextInt();
		System.out.println("Account created successfully!");
	}
	void displayAcc() {
		System.out.println("**AccountDetails**");
		System.out.println("Account No:"+accNo);
		
		System.out.println("Account Type:"+accType);
		
		System.out.println("Account Holder Name:"+accName);
		
		System.out.println("Initial Balance:"+balance);
		
		
		
	}
	boolean searchAcc(String accNo) {
		
	        return this.accNo.equals(accNo);
	   
		
	}
	void deposit() {
		long deposit;
		System.out.println("Enter amount to deposit:");
		deposit=sc.nextLong();
		try{
			if(deposit<=0) {
				throw new InvalidAmountException("Invalid amount; must be greater than 0.");
			}
		


		balance+=deposit;
		System.out.println( "Deposit successful! New balance:"+balance); 
		
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	void withdraw() {
		long withdraw;
		System.out.println("Enter amount to withdraw:");
		withdraw=sc.nextLong();
		try{
			if(withdraw>balance) {
			  throw new InsufficientFundsException("Insufficient balance for withdrawal.");
			}
			else if(withdraw<=0) {
				throw new InvalidAmountException("Invalid amount; must be greater than 0.");
				
			}
		
		balance-=withdraw;
		System.out.println( "Withdrawal successful! New balance:"+balance); 
		}catch(InsufficientFundsException | InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

public class CustomExceptionLab {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number of customers do you want to input?");
		int n=sc.nextInt();
		CustomBank[] Bank=new CustomBank[n];
		
		 for (int i = 0; i < Bank.length; i++) {
	            Bank[i] = new CustomBank();
	            Bank[i].openAcc();
	        }
		String choice,AccountNumber;
		boolean found=false;
		int option;
		do {
			System.out.println("*** Banking System Application ***\n"
					+ "1. Display Account Details\n"
					+ "2. Search Account\n"
					+ "3. Deposit Amount\n"
					+ "4. Withdraw Amount\n"
					+ "5. Exit");
			System.out.print("Enter the option to perform:");
			option=sc.nextInt();
			switch(option) {
				case 1:
					if(Bank!=null) {
						for(int i=0;i<Bank.length;i++) {
						Bank[i].displayAcc();
						}
					}
					break;
				case 2:
					System.out.println("Enter account number you want to search:");
					AccountNumber = sc.next();
					found = false;
					
					for (int i = 0; i < Bank.length; i++) {
					    if (Bank[i].searchAcc(AccountNumber)) {
					        Bank[i].displayAcc();
					        found=true;
					        break;
					    }
					}

					if(!found)
						System.out.println("Account not Found!!");

					break;
					
				case 3:
					System.out.println("Enter Account no. :");
					AccountNumber = sc.next();
					found = false;

					for (int i = 0; i < Bank.length; i++) {
					    if (Bank[i].searchAcc(AccountNumber)) {
					    	Bank[i].displayAcc();
					        Bank[i].deposit();
					        found=true;
					        break;
					       
					    }
					}

					if(!found)
						System.out.println("Account not Found!!");

					break;
					
					
				case 4:
					System.out.println("Enter Account no. :");
					AccountNumber = sc.next();
					found = false;

					for (int i = 0; i < Bank.length; i++) {
					    if (Bank[i].searchAcc(AccountNumber)) {
					    	Bank[i].displayAcc();
					        Bank[i].withdraw();
					        found=true;
					        break;
					       
					        
					    }
					}

					if(!found)
						System.out.println("Account not Found!!");;

					break;
					
				case 5:
					System.out.println("Thank you for using the banking system. See you soon!");
					break;
				default:break;
			}
			
			System.out.println("Do you want to continue(y/n)?");
			choice=sc.next();
		}while(choice.toLowerCase().equals("y"));
		
		
	}

}
