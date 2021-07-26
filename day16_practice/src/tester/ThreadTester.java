package tester;

import com.app.core.EvenPrinterTask;
import com.app.core.OddPrinterTask;
import java.lang.Thread;
import java.util.Scanner;

public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main execution started....");
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter start and end range : ");
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			Thread t1 = new Thread(new EvenPrinterTask(start, end), "Even thread");
			Thread t2 = new Thread(new OddPrinterTask(start, end), "Odd thread");
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main execution over...");
	}

}
