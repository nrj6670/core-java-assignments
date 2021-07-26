package tester;

import java.util.Scanner;
import static com.app.core.Book.sdf;
import com.app.core.Book;
import com.app.core.Category;
import java.util.HashSet;

public class BookTester {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 5;
		
		HashSet<Book> hs = new HashSet<>();
		
		while(counter != 0) {
			try {
				System.out.println("Enter book detail (title, cat, price, release date, author name) : ");
				//Book(String title, Category cat, double price, Date dt, String authorName)
				boolean success = hs.add(new Book(sc.next(), Category.valueOf(sc.next().toUpperCase()), sc.nextDouble(), sdf.parse(sc.next()), sc.next(), sc.nextInt()));
				if(success) {
					System.out.println("Book added successfully");
				} else {
					System.out.println("Book already exists");
				}
				counter--;
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			sc.nextLine();
		}
		System.out.println(hs);
		sc.close();
	}
}
