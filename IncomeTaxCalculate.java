package pack1;

import java.util.Scanner;


public class IncomeTaxCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Annual income: ");
		float income  = sc.nextFloat();
		
		
		float tax = (income <= 250000) ? 0f:
					(income <= 500000) ? (income -250000) * 0.05f :
					(income <= 1000000) ? (250000*0.05f)+(income - 500000) *0.20f :
					(250000*0.05f) + (500000*0.20f) + (income-1000000) * 0.30f;
		
		System.out.println("calculated tax: " + tax);
			
			
		
		
	}

}
