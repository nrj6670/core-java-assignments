package com.app.tester;

import java.util.Scanner;
import com.app.customer.Customer;
import com.app.customer.CustomerType;
import util.ValidationRule;
import static com.app.customer.Customer.s;


public class CustomerTester {
	
	public static CustomerType getEnumValue(String str) {
		return CustomerType.valueOf(str);
	}
	
	public static void main(String[] args) {
		
			try(Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter customer registration details :- ");
				System.out.println("(Name, email, password, Registraion amount, Date of birth, Membership type)");
				
				String name = sc.nextLine();
				String email = sc.nextLine();
				String password =sc.nextLine();
				double regAmount = sc.nextDouble();
				sc.nextLine();
				String dob = sc.nextLine();
				String memberShipType = sc.nextLine().toUpperCase();
				
				ValidationRule.validateCredentials(email, password, regAmount, s.parse(dob));
				
				Customer c = new Customer(name, email, password, regAmount, s.parse(dob), CustomerType.valueOf(memberShipType));
				System.out.println(c);
				System.out.println("Customer registered successfully!! ");
			} catch(Exception e) {
				System.out.println("Invalid input");
				e.printStackTrace();
			}
		
		//String name, String email, String password, double rno, Date dob, CustomerType type
		
		
		
		
	}
}
