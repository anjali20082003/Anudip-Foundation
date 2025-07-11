package pack1;

import java.util.Scanner;


public class LoginAuthentication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set your Username :");
		String correctusername = sc.next();
		
		
		System.out.println("Set your password :");
		String correctpassword = sc.next();

		System.out.println("\n----LOGIN---");
		
		System.out.println("Enter your Username :");
		String username = sc.next();
		
		System.out.println("Enter your Password:");
		 String password = sc.next();
		 
		

		
		if(correctusername.equals(username) && correctpassword.equals(password)){
			System.out.println("Login Succesful");	
		}
		else if (correctusername.equals(username)) {
			System.out.println("Incorrect password!!");
			
		}
		else {
			System.out.println("Invalid Username!!");
			
		}
		
		
		
	
	}

}
