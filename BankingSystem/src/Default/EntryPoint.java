package Default;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import Accounts.Account;
import Accounts.AccountsList;
import Accounts.Checking;
import Accounts.Savings;
import Connections.Connection;
import Customers.CustomersList;

public class EntryPoint {
	
	static Menu menu;
	static Scanner keyRead = new Scanner(System.in);
	static AccountsList myAccountList = new AccountsList();
	static CustomersList clientList = new CustomersList();
	static ArrayList<Connection> connectionList = new ArrayList();
	
	public static void main(String[] args) {
		menu = new Menu();
		menu.printFirstMenu();
		performActionFirstMenu();
	}
	
	private static void performActionFirstMenu() {
		int choice;
		System.out.println();
		choice = menu.getUserChoice();

		switch (choice) {
		case 0:
			System.out.println("Program finished, Thank you ");
			System.exit(0);
			break;
		case 1:
			createANewAccount();
			menu.printFirstMenu();
			performActionFirstMenu();
			break;
		case 2:
			linkAccountToUser();
			break;
		}
	}
	
	private static void createANewAccount() {

//		getNewCustomerInfo();
//		String ssn = getNewCustomerInfo();
		menu.printNewAccountMenu();
		int choice = menu.getUserChoice();

		Account account = new Account();

		if (choice == 1) {
			account = new Savings();
			myAccountList.addNewAccount(account);
		} else if (choice == 2) {
			account = new Checking();
			myAccountList.addNewAccount(account);
		}

		System.out.println(myAccountList.toString());
		menu.printFirstMenu();
		performActionFirstMenu();

	}
	
	private static void linkAccountToUser() {
		System.out.println("Enter account number: ");
		String accountNumber = keyRead.nextLine();
		myAccountList.get
//		connectionList.
	}
	
}
