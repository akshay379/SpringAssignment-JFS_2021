package Junit_3;

import java.util.Scanner;

public class Withdraw {
	 

		public static void main(String[] args) {
			 
			Scanner sc = new Scanner(System.in);
			
			BankAccount demoAccount = new BankAccount(1000);
			
			demoAccount.displayDetails();
			System.out.println("\n"+"Enter amount to withdraw:");
			
			int amount = sc.nextInt();
			
			try {
				
				demoAccount.withdraw(amount);  
				
			} catch (Exception e) {
				
				System.out.println(e);
				 
			} 
		}
	}
