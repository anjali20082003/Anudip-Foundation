package pack1;

import java.util.Scanner;

public class TrainTicketFair {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the Age of person:");
	int age = sc.nextInt();
	
	System.out.println("Enter the Travel distance:");
	int distance = sc.nextInt();
	double fare = distance*5;
	double discount = fare;
	
	if(age<5) {
		
		System.out.println("Child - Free ticket");
	}
	else if(age>60) {
		System.out.println("Actual fare : Rs " + fare);
		System.out.println("Senior citizen 50% discount");
		System.out.println("Discount for senior citizen: Rs " + (fare/2));
		
		
		
	}
	else {
		fare = distance * 5;
		System.out.println("Regular passenger");
		System.out.println("Fare is: " + fare);
	}
	

	
	}
}


