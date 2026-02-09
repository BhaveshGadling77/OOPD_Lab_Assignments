import java.util.Scanner;
public class AtmSimulator {

	//define constants for the methods
	static final int CHECK_BALANCE = 1;
	static final int DEPOSIT = 2;
	static final int WITHDRAW = 4;
	static final int TRANSFER_FUNDS = 8;

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//intial balance of the user
		double balance;
		int userType;
		int choice;
		/* define the three user types 
		 * basic, standard, premium
		 * LSB => check balance 
		 * 2nd bit => deposit
		 * 3rd bit => withdraw 
		 * MSB => Transfer funds
		 * basic => 0001
		 * standard => 0111
		 * premium => 1111
		 * val 1 => basic 
		 * val 7 => standard 
		 * val 15 => premium 
		 */
		System.out.print("Enter the Your balance: ");
		balance = sc.nextDouble();
		System.out.println("Enter 1 for the basic user\n Enter 7 for the Standard \n Enter 15 for the Premium");
		System.out.print("Enter your user Type: ");
		userType = sc.nextInt();

		if (userType != 1 && userType != 7 && userType != 15) {
			//if user entered any other number than 1, 7, 15;

			while(userType != 1 && userType != 7 && userType != 15) {	
				System.out.print("Enter your UserType again: ");
				userType = sc.nextInt();
			}
		}
		boolean check = true;
		while (check) {
			System.out.println("\nAvailable Choices");
			System.out.println("For Check balance Enter 1");
			System.out.println("For deposit Enter 2");
			System.out.println("For Withdraw Enter 4");
			System.out.println("For Transfer Funds 8\n");
			System.out.print("Enter the Your Choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1: 
					System.out.println("Your Current Balance is : "+ balance);
					break;
				
				case 2: 
					if ((userType & DEPOSIT) ==  DEPOSIT) {
						System.out.print("Enter the Amount you want to deposit : ");
						double amount = sc.nextDouble();
						balance += amount;
						break;
					}
					System.out.println("You don't have permission to Deposit in the ATM.");
					break;

				case 4:
					if ((userType & WITHDRAW) == WITHDRAW) {
						double amount;
						System.out.print("Enter the Amount you want to withdraw : ");
						amount = sc.nextDouble();
						if (balance - amount >= 0) {
							balance -= amount;
						} else {
							System.out.println("You don't have enough balance to withdraw " + amount + ".");
						}
						break;
					} else {
						System.out.println("You don't have permission to Withdraw money from the ATM.");
					}
					break;

				case 8:
					if ((userType & TRANSFER_FUNDS) == TRANSFER_FUNDS) {
						double amount;
						System.out.println("Enter the amount you want to transfer : ");
						amount = sc.nextDouble();
						if (balance - amount >= 0) {
							balance -= amount;
							System.out.println("Transfer Successful.");
							System.out.println("Your Remaining balance : " + balance);
						} else {
							System.out.println("You don't have enought balance to Transfer funds.");
						}
						break;
					} else {
						System.out.println("You don't have enough permission to Transfer Funds.");
					}
					break;

				default:
					System.out.println("Enter the a valid choice.");
			}
			System.out.println("Do you want to continue (Enter 5 if don't want to continue and Enter 1 if you want to continue) ?");
			System.out.print("Enter Number: ");
			choice = sc.nextInt();
			if (choice == 5) {
				check = false;
			} else if (choice == 1) {
				check = true;
			}
		}
		System.out.println("Thank you for using this ATM");
		sc.close();
	}
}
