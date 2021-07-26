package tester;

import java.util.Scanner;
import com.app.org.Emp;
import com.app.org.Manager;
import com.app.org.Worker;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees : ");
		Emp [] emp = new Emp[sc.nextInt()];
		
		int counter = 0;
		
		boolean exitLoop = false;
		
		do {
			System.out.println("\n\n1. Hire manager\n2. Hire worker\n3. Get all employees details\n4. Update performance bonus or hourly rate\n5.Exit\n\n ENTER YOUR CHOICE : ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1: 
					if(counter == emp.length) {
						System.out.println("All employees has been added");
						break;
					}
					System.out.println("Enter manager details(id, name, department, basic pay, performance bonus) : ");
					emp[counter++] = new Manager(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
					System.out.println("Manager added successfully");
					break;
					
				case 2:
					if(counter == emp.length) {
						System.out.println("All employees has been added");
						break;
					}
					System.out.println("Enter worker details(id, name, department, basic pay, hourly rate, hours worked) : ");
					emp[counter++] = new Worker(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextInt());
					System.out.println("Worker added successfully");
					break;
					
				case 3:
					
					for(Emp e : emp) {
						if(e != null) {
							System.out.println(e);
						}
					}
					break;
					
				case 4:
					System.out.println("Enter employee id of the manager/worker");
					int empId = sc.nextInt();
					
					boolean empFound = false;
					
					for(int i=0; i<emp.length; i++) {
						if(emp[i] != null && empId == emp[i].getEmployeeId()) {
							if(emp[i] instanceof Manager) {
								System.out.println("Current performance bonus : " + ((Manager)emp[i]).getPerformanceBonus());
								System.out.println("Enter new performance bonus : ");
								double pB = sc.nextDouble();
								((Manager)emp[i]).setPerformanceBonus(pB);
								System.out.println("Updated details...\n" + emp[i]);
							}
							
							
							if(emp[i] instanceof Worker) {
								System.out.println("Current hourly rate : " + ((Worker)emp[i]).getHourlyRate());
								System.out.println("Enter new hourly rate : ");
								double hR = sc.nextDouble();
								((Worker)emp[i]).setHourlyRate(hR);
								System.out.println("Updated details...\n" + emp[i]);
							}
							empFound = true;
						}
					}
					
					if(empFound == false) {
						System.out.println("Employee not found");
					}
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
