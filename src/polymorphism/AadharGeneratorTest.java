package polymorphism;

import java.util.Scanner;

public class AadharGeneratorTest {

	public static void main(String[] args) {
		//AadharGenerator A1 = new AadharGenerator();
		//A1.getAadhar();
		
		//printing the value in console 
		Scanner scanner = new Scanner(System.in);
        AadharGenerator generator = new AadharGenerator();

        System.out.println("Enter the number of documents you have (1 for PAN, 2 for PAN + Voter ID, 3 for PAN + Voter ID + Passport): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter PAN Card Number: ");
            double pan = scanner.nextDouble();
            generator.generateAadhar(pan);
        } else if (choice == 2) {
            System.out.print("Enter PAN Card Number: ");
            double pan = scanner.nextDouble();
            System.out.print("Enter Voter ID Number: ");
            double voter = scanner.nextDouble();
            generator.generateAadhar(pan, voter);
        } else if (choice == 3) {
            System.out.print("Enter PAN Card Number: ");
            double pan = scanner.nextDouble();
            System.out.print("Enter Voter ID Number: ");
            double voter = scanner.nextDouble();
            System.out.print("Enter Passport Number: ");
            double passport = scanner.nextDouble();
            generator.generateAadhar(pan, voter, passport);
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            scanner.close();
            return;
        }

        System.out.println("Generated Aadhar Number: ");
        generator.getAadhar();

        scanner.close();
    }
	
}


