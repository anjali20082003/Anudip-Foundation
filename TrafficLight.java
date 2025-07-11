package pack1;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Color:");
		String color = sc.next();
		
		if(color.equals("Red") || (color.equals("red"))) {
			System.out.println("Stop");
		}
		else if (color.equals("Yellow") || (color.equals("yellow"))) {
			System.out.println("Wait");
		}
		else if(color.equals("Green") || (color.equals("green"))) {
			System.out.println("GO");
		}
		else {
			System.out.println("Invalid color");
		}
		
		

	}

}
