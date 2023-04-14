package Manmeet;

import java.util.Scanner;

public class Pin_validator {
	public static void main(String[] args) {
		
		final String password="findMM@1234";
		int attempts=0;
		
		try(Scanner scanner=new Scanner(System.in)){
			while (attempts<3) {
				System.out.println("Enter your PIN: ");
				String pin=scanner.nextLine();
				if (pin.equals(password)) {
					System.out.println("You're successfully Logged in!");
					break;
				}
				else {
					System.out.println("Invalid Pin! Enter again.");
					attempts++;
				}
			}
			if (attempts==3) {
				System.out.println("Your card is blocked!!");
			}
		}
	}
}
