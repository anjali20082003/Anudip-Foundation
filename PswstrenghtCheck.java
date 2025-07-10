package pack1;

import java.util.Scanner;


public class PswstrenghtCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the password :");
		String password = sc.nextLine();

	
		if (password.length() < 8) {
		System.out.println("Password contain must 8 character !!");	
		}
		
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		boolean special = false;
		
		for (char ch : password.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				upper = true;
			}
			else if (Character.isLowerCase(ch)) {
				lower = true;
			}
			else if (Character.isDigit(ch)) {
				digit = true;
			}
			else {
				special = true;
			}
		}
		
		if (!upper) {
			System.out.println("paasword must contain at least one uppercase letter");	
		}
		if(!lower) {
			System.out.println("password must at least one lower case letter");
		}
		if(!digit) {
			System.out.println("password must conatin ay leaast one didgit");
		}
		if (!special) {
			System.out.println("password must contain at least one special character ");
		}
		
		if (upper && lower && digit && special) {
			System.out.println("Strong Password");
		}
		else {
			System.out.println("weak password");
		}
		
		
		
	}

}
