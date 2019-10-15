package co.grandcircus;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		
		// My name is Orestis Sinis
		
		Scanner scan = new Scanner(System.in);
		double burgers = 0;
		double sodas = 0;

		System.out.println(
				"\nPlease choose the number of the item you'd like to order, or press 3 to Exit. \n1. Burger \n2. Soda \n3. Exit");
		double userSelection = scan.nextDouble();
		if (userSelection == 1 || userSelection == 2 || userSelection == 3) {

			while (userSelection == 1) {
				burgers = burgers + 2.50;
				System.out.println("Add an item or exit. \n1. Burger \n2. Soda \n3. Exit");
				userSelection = scan.nextDouble();
			}
			while (userSelection == 2) {
				sodas = sodas + 1.25;
				System.out.println("Add an item or exit. \n1. Burger \n2. Soda \n3. Exit");
				userSelection = scan.nextDouble();
			}
			while (userSelection == 3) {
				System.out.println("Thank you for ordering with rusty's burgers!.");
				System.out.println("Your order Subtotal is: $" + (sodas + burgers));
				System.out.println("With tax, your Total is: $" + ((sodas + burgers * .07) + sodas + burgers));
				System.out.println("Burgers:"); // FIX THESE LINES
				System.out.println("Sodas:"); // FIX THESE LINES
				userSelection = scan.nextDouble();
			}
			while (userSelection != 1 || userSelection != 2 || userSelection != 3) {
			System.out.println("Sorry I didn't understand, let's try again.\nAdd an item or exit. \n1. Burger \n2. Soda \n3. Exit");
			scan.next();
	
			}
			
		}
		else {
			
		}
//			}
	}

}
