package tester;

import utils.IOUtils;
import utils.InvalidBookException;

import java.util.HashMap;
import java.util.Scanner;
import com.app.core.Category;
import static java.time.LocalDate.parse;

import java.time.LocalDate;

import com.app.core.Book;

public class BookCollectionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,Book> hM = IOUtils.restoreBooks("BooksCollection");
		boolean exitLoop = false;
		
		while(!exitLoop) {
			try {
				System.out.println("-----Books collection menu-----");
				System.out.println("1. Add new book\n2. Display books\n10. Exit program"
						+ "\n\nEnter your choice");
				int choice = sc.nextInt();
				
				switch (choice) {
				  case 1: 
					//String title, Category cat, double price, String author, LocalDate dt, int quantity
					  System.out.println("Enter book information(title,category,price"
					  		+ ",author,publish date,quantity)");
					  sc.nextLine();
					  String name = sc.nextLine();
					  Category c = Category.valueOf(sc.nextLine().toUpperCase());
					  double p = sc.nextDouble();
					  sc.nextLine();
					  String a = sc.nextLine();
					  LocalDate d = parse(sc.nextLine());
					  int q = sc.nextInt();
					  
					  Book newBook = new Book(name, c, p, a, d, q);
					  
					  if(hM.containsKey(newBook.getTitle())) {
						  throw new InvalidBookException("Book already exists");
					  }
					  
					  hM.put(newBook.getTitle(), newBook);
					  System.out.println("Book inserted : " + newBook);
					  break;
					
				  case 2:
				  		for(Book b : hM.values()) {
				  			System.out.println(b);
				  		}
				  		break;
				  case 10:	
				  		exitLoop = true;
				  		break;
				  default:
				  		System.out.println("Invalid input");
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			sc.nextLine();
		} 
		
		IOUtils.storeBooks(hM, "BooksCollection");
		System.out.println("Book stored");
		sc.close();
	}

}
