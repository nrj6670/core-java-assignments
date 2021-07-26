package tester;

import java.util.Scanner;

import com.app.core.Book;
import com.app.core.Category;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import static com.app.core.Book.sdf;

public class BookTester {
	
	public static HashMap<String, Book> testCases() {
		HashMap<String, Book> books = new HashMap<>();
		//Book(String title, Category cat, double price, Date dt, String authorName)
		try {
			books.put("ABC", new Book("ABC", Category.valueOf("THRILLER"), 500, sdf.parse("24-3-1986"), "ABC-author", 100));
			books.put("JKL", new Book("JKL", Category.valueOf("HISTORY"), 775.23, sdf.parse("17-2-2002"), "John Doe", 56));
			books.put("GHI", new Book("GHI", Category.valueOf("MYSTERY"), 500, sdf.parse("5-8-2020"), "k J", 250));
			books.put("XYZ", new Book("XYZ", Category.valueOf("HISTORY"), 700.23, sdf.parse("17-2-2002"), "John Doe", 56));
		}catch(Exception e) {
			e.getMessage();
		}
		return books;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Book> bookCollection = testCases();
		boolean exitLoop = false;
		
		while(!exitLoop) {
			try {
				System.out.println("*****BOOK COLLECTION*****");
				System.out.println("1. Reduce quantity of book by 10%"
						+ "\n2. Search book by category"
						+ "\n3. Sort book by title"
						+ "\n4. Sort book by author name and price"
						+ "\n5. Exit program"
						+ "\n\nEnter your choice : ");
				int choice = sc.nextInt();
				
				switch(choice) {
					case 1:
						if(bookCollection.size() == 0) {
							System.out.println("Book collection empty");
							break;
						}
						System.out.println("Enter date of release : ");
						Date dateOfRelease = sdf.parse(sc.next());
						System.out.println("Book list as per release date : ");
						for(Book b : bookCollection.values()) {
							if(b.getReleaseDate().equals(dateOfRelease)) {
								b.setQuantity(0.1);
								System.out.println("Book quantity reduced");
							}
						}
						break;
						
					case 2:
						if(bookCollection.size() == 0) {
							System.out.println("Book collection empty");
							break;
						}
						
						System.out.println("Enter book category");
						Category bookCategory = Category.valueOf(sc.next().toUpperCase());
						System.out.println("Book list as per given category : ");
						for(Book b : bookCollection.values()) {
							if(bookCategory.equals(b.getBookCategory()) && b.getBookQuantity() > 0) {
								System.out.println(b);
							}
						}
						
						break;
						
					case 3:
						if(bookCollection.size() == 0) {
							System.out.println("Book collection empty");
							break;
						}
						
						TreeMap<String,Book> tMap = new TreeMap<>(bookCollection);
						System.out.println("Book list as per descending title : ");
						for(Book b : tMap.values()) {
							System.out.println(b);
						}
						break;
						
					case 4:
						if(bookCollection.size() == 0) {
							System.out.println("Book collection empty");
							break;
						}
						
						Collection<Book> books= bookCollection.values();
						
						ArrayList<Book> bookList = new ArrayList<>(books);
						
						Collections.sort(bookList, new Comparator<Book>() {
							@Override
							public int compare(Book b1, Book b2) {
								int res = b1.getBookAuthor().compareTo(b2.getBookAuthor());
								
								if(res == 0) {
									if(b1.getBookPrice() < b2.getBookPrice()) {
										return -1;
									} else if(b1.getBookPrice() == b2.getBookPrice()) {
										return 0;
									}
									
									return 1;
								}
								
								return res;
							}
						});
						System.out.println("Book list as per order of author name and price : ");
						for(Book b : bookList) {
							System.out.println(b);
						}
						
						break;
						
					case 5:
						System.out.println("Exiting program");
						exitLoop = true;
						break;
						
					default:
						System.out.println("Invalid input");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			sc.nextLine();
		}
	}

}
