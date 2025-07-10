package pack1;

import java.util.Scanner;

public class ATMwithdrawal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Balance amount is :");
		float balance = sc.nextFloat();
		
		System.out.println("Withdrawal amount is :");
		int withdrawal = sc.nextInt();
		
		if (withdrawal % 100 !=0) {
			System.out.println("Error: Withdrwal amout must be a multiple of 100.");
		}
		else if(withdrawal + 5 > balance){
			 System.out.println("Insufficient balance");
		}
		else {
			balance = balance - withdrawal -5;
			System.out.println("Withdrawal successful. Updated balance: Rs " + balance);
			
		}
		
	}

}
