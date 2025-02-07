package com.bankcontroller;

import java.util.Scanner;

import com.bankmodel.*;
import com.bankservice.CustomerService;

public class CustomerController {

	public static void main(String[] args) {

		CustomerService service = new CustomerService();

		Customer customer = new Customer(12345, "passer");

		try (Scanner scanner = new Scanner(System.in)) {
			boolean flag = false;
			do {
				System.out.println(" Please enter Acc. Number & Password");

				long accNumber = scanner.nextLong();

				String password = scanner.next();

				if (customer.getCustAccountNumber() == accNumber && customer.getCustPassword().equals(password)) {
					System.out.println("Welcome to Bank");
					flag = false;
				} else {
					System.out.println("Invalid Credentials");
					flag = true;
				}
			} while (flag);
			do {
				System.out.println("\n 1.Deposit \n 2.Withdraw \n 3.Transfer \n 4.Logout \n");

				int ch = scanner.nextInt();

				switch (ch) {
				case 1: // Deposit
					service.deposit();

					break;
				case 2: // Withdraw
					service.withdraw();

					break;
				case 3: // Transfer
					service.transfer();
					break;
				case 4: // Logout
					service.logout();

					break;

				default:
					System.out.println("Invalid Choice");
					break;
				}
			} while (true);
		}
	}
}
