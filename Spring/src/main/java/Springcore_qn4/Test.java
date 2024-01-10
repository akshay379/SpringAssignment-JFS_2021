package Springcore_qn4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		 
		context = new ClassPathXmlApplicationContext("Springcore_qn4/config.xml");
		BankAccount account = (BankAccount)context.getBean("Account");
		System.out.println(account.accountBalance);
		
		
		//using controll
		BankAccountcontroller account2 = (BankAccountcontroller)context.getBean("controller");
		System.out.println(account2.getBalance(10));
		 
	}

}