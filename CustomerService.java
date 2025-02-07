package com.bankservice;

import java.util.Scanner;

public class CustomerService {

	double custAccBal = 10000;
	int amount, otp, generatedOTP;

	Scanner scanner = new Scanner(System.in);

	public void deposit() {
		System.out.println("\n Before Deposit Cust Acc Balance: " + custAccBal);

		System.out.println("\n Please enter the amount for deposit: ");

		amount = scanner.nextInt();

		custAccBal += amount;
		System.out.println("Account Balance after deposit" + custAccBal);
	}

	public void withdraw() {
		System.out.println("\n Before withdraw cust Acc Bal : " + custAccBal);

		System.out.println("Please enter amount for the withdraw :");

		amount = scanner.nextInt();

		if (custAccBal >= amount) {
			custAccBal -= amount;
			System.out.println("\n After withdraw cust Acc Bal :  " + custAccBal);
		} else {
			System.out.println("Insufficient funds");
		}
	}

	public void transfer() {
		System.out.println("Before transfer cust Acc Balance :" + custAccBal);
		System.out.println("Please enter amount for transfer : ");
		amount = scanner.nextInt();

		if (custAccBal > amount) {
			generatedOTP = generateOTP();

			System.out.println("Please enter the OTP :"+generatedOTP);
			otp = scanner.nextInt();

			if (otp == generatedOTP) {
				custAccBal -= amount;

				System.out.println("After transfer Customer account balance:" + custAccBal);

			} else {
				System.out.println("Invalid OTP");
			}
		} else {
			System.out.println("Ifsufficient Balance");
		}

	}

	private int generatedOTP() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void logout() {
		System.out.println("Logged Out Successfully");
		System.exit(0);

	}

	int generateOTP() {
		return (int) (Math.random() * 9000 + 1000);
	}
}
