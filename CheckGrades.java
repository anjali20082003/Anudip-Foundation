package pack1;

import java.util.Scanner;
public class CheckGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks :");
		int marks = sc.nextInt();
		
		if (marks>=90 && marks<=100) {
			System.out.println("You get an A Grade");
		}
		else if (marks>=75 && marks<89) {
			System.out.println("You get a B Grade");
		}
		else if (marks>=60 && marks<74) {
			System.out.println("You get a C Grade");
		}
		else if (marks<60) {
			System.out.println("You get a D Grade");		
		}
		else if (marks<=35) {
			System.out.println("You Fail!!!!");			
		}
		else {
			System.out.println("Marks Invalid");
		}
		
	}

}
