package com;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount("Rajdeep", "SI0001");
		obj.showMenu();
	}
}
class BankAccount{
	int Balance;
	int PreviouseTransaction;
	String CustomerName;
	String CustomerId;
	
	BankAccount(String cname, String cid) {
		CustomerName=cname;
		CustomerId=cid;
	}
	void deposit(int amount) {
		if(amount !=0) {
			Balance= Balance+amount;
			PreviouseTransaction=amount;
		}
	}
	void Withdraw(int amount) {
		if(amount !=0) {
			Balance= Balance -amount;
			PreviouseTransaction= -amount;
		}
	}
	void getPreviouseTransaction() {
		if(PreviouseTransaction >0) {
		System.out.println("Withdraw: "+PreviouseTransaction); 
			}
		else if(PreviouseTransaction < 0){
			System.out.println("Deposited: "+Math.abs(PreviouseTransaction));
		}
		else {
			System.out.println("No Transaction Occured");
		}
	}
	void showMenu() {
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome "+CustomerName);
		System.out.println("Your Id "+CustomerId);
		System.out.println("\n");
		System.out.println("A : Check your Balance");
		System.out.println("B : Deposite");
		System.out.println("C : Withdrow");
		System.out.println("D : Previouse Transaction");
		System.out.println("E : Exit The System");
		
		do {
			System.out.println("======================================================================================================================");			
			System.out.println("Enter Your Operation");
			System.out.println("======================================================================================================================");
			option =scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
			System.out.println("----------------------------------------------------------------------------------------------------------------------");
			System.out.println("Balance = "+Balance);
			System.out.println("----------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n");
			break;
			
			case 'B':
				System.out.println("----------------------------------------------------------------------------------------------------------------------");
				System.out.println("Enter an Amount to Deposit");
				System.out.println("----------------------------------------------------------------------------------------------------------------------");
				int Amount =scanner.nextInt();
				deposit(Amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------------------------------------------------------------------------------------------------------------");
				System.out.println("Enter an Amount to Withdrow");
				System.out.println("----------------------------------------------------------------------------------------------------------------------");
				int Amount2=scanner.nextInt();
				Withdraw(Amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------------------------------------------------------------------------------------------------------");
				getPreviouseTransaction();
				System.out.println("----------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n");
				
			case 'E':
				System.out.println("======================================================================================================================");	
				break;
				
			default:
				System.out.println("Invalid Option!! Please Enter Correct Option...");
			break;
			}
		}
		while(option !='E');
		System.out.println("Thank You for using our services....!!");
	}
}
