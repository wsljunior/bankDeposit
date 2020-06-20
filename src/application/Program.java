package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(holder, number, initialDeposit);
		} else {
			bank = new Bank(holder, number);
		}
		System.out.println("\nAccount data:");
		bank.information();
		System.out.print("\nEnter a deposit value: ");
		bank.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		bank.information();
		System.out.println("\nEnter a withdraw value: ");
		bank.withdraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		bank.information();
		sc.close();
	}

}
