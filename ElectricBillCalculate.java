package pack1;

import java.util.Scanner;

public class ElectricBillCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unit Consumed :");
		
		int units = sc.nextInt();
		
		double bill = 0;
		
		if (units<=100) {
			bill=units*1.50;
		}
		else if(units<=300) {
			bill= (100*1.50)+(units-100)*2.00;
		}
		else {
			bill= (100*1.50)+(200*2.00)+(units-300)*3.00;
			}
		
		if(units>200) {
			bill = bill+50;
		}
		
		System.out.println("Electricity bill is : Rs "+ bill);
		
		
		
	}

}
