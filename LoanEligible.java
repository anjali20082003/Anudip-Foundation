package pack1;

import java.util.Scanner;

public class LoanEligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		
		System.out.println("Enter the Monthly Income:");
		int income = sc.nextInt();
		
		System.out.println("Enter the Job Type (salaried/ self-employed)");
		String jobtype = sc.next();
		
		System.out.println("Enter the Credit Score");
		int creditscore = sc.nextInt();
		
		
		if (age>21  && income>= 25000){
			if(jobtype.equalsIgnoreCase("salaried") && creditscore >= 650) {
			System.out.println("Eligible for Loan");
			}
		
		else if (jobtype.equalsIgnoreCase("self-employed") && creditscore>=700) {
			System.out.println("Eligible for loan");
		}
		else {
			System.out.println("Not eligible  Credit score too low for " + jobtype);
		}
		
		}
	else {
		System.out.println("Not Eligible: Age or Income criteria not met");
	}
		

}
}
