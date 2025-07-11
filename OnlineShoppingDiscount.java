package pack1;

import java.util.Scanner;

public class OnlineShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter customer type (New/Returning): ");
        String customer = sc.next();

        double discount = 0;

        if (amount > 10000 && customer.equalsIgnoreCase("Returning")) {
            discount = amount * 0.20;
        } 
        else if (amount > 10000 && customer.equalsIgnoreCase("New")) {
            discount = amount * 0.15;
        } 
        else if (amount > 5000) {
            discount = amount * 0.10;
        }

        double finalAmount = amount - discount;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Final payable amount: ₹" + finalAmount);

        sc.close();
    }
}
