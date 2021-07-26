package com.app.tester;

import java.util.Scanner;

import com.app.employee.Stack;
import com.app.employee.FixedStack;
import com.app.employee.GrowableStack;
import com.app.employee.Employee;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Stack stk = null;
		
		boolean exitLoop = false;
		
		do {
			System.out.println("\n\n1. Choose fixed stack\n2. Choose growable stack\n"
					+ "3. Push data\n4. Pop data\n5. Exit program\n\nEnter your choice : ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1 : 
					if(stk != null) {
						System.out.println("A stack has already been chosen");
						break;
					}
					stk = new FixedStack();
					break;
				
				case 2:
					if(stk != null) {
						System.out.println("A stack has already been chosen");
						break;
					}
					stk = new GrowableStack();
					break;
				
				case 3: 
					System.out.println("Enter employee detail : ");
					
					int id = sc.nextInt();
					sc.nextLine();
					String name = sc.nextLine();
					double salary = sc.nextDouble();
					
					Employee emp1 = new Employee(id, name, salary);
					stk.push(emp1);
					break;
					
				case 4:
					stk.pop();
					break;
					
				case 5:
					System.out.println("Exiting program");
					exitLoop = true;
					break;
					
				default:
					System.out.println("Invalid input");
			}
		}while(!exitLoop);
		
		sc.close();
	}

}
