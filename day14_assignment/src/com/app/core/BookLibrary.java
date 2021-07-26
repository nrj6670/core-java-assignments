package com.app.core;

import java.util.Scanner;
import static com.app.core.Book.sdf;
import java.util.Date;
import java.util.HashMap;

public class BookLibrary {
	
	public static HashMap<String, Book> testCases() {
		HashMap<String, Book> books = new HashMap<>();
		//Book(String title, Category cat, double price, Date dt, String authorName)
		try {
			books.put("ABC", new Book("ABC", Category.valueOf("THRILLER"), 500, sdf.parse("24-3-1986"), "ABC-author", 100));
			books.put("JKL", new Book("JKL", Category.valueOf("HISTORY"), 775.23, sdf.parse("17-2-2002"), "John Doe", 56));
			books.put("GHI", new Book("GHI", Category.valueOf("MYSTERY"), 500, sdf.parse("5-8-2020"), "k J", 250));
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
				System.out.println("******BOOK LIBRARY SYSTEM******");
				System.out.println("1. Add book\n2. View all the books\n3. Issue a book\n4. Return a book\n5. Remove book\n6. Exit program\n\nEnter your choice");
				int choice = sc.nextInt();
				
				switch(choice) {
					case 1:
						System.out.println("Enter book detail (title, cat, price, release date, author name, quantity) : ");
						String title = sc.next();
						Category cat = Category.valueOf(sc.next().toUpperCase());
						double price = sc.nextDouble();
						Date dt = sdf.parse(sc.next());
						String name = sc.next();
						int qty = sc.nextInt();
						
						Book searchBook = bookCollection.get(title);
						
						if(searchBook == null) {
							bookCollection.put(title, new Book(title, cat, price, dt, name, qty));
							System.out.println("Book has been added");
						} else {
							searchBook.setQuantity(qty);
							System.out.println("Book already exists. Quantity updated.");
						}
						
						break;
					
					case 2:
						if(bookCollection.size() == 0) {
							System.out.println("No book in the collection");
							break;
						}
						System.out.println("List of all the books : \n");
						for(Book b : bookCollection.values()) {
							System.out.println(b);
						}
						System.out.println("\n");
						break;
						
					case 3:
						if(bookCollection.size() == 0) {
							System.out.println("No book in the collection");
							break;
						}
						System.out.println("Enter the title of the book to issue : ");
						
						Book b1 = bookCollection.get(sc.next());
						
						if(b1 == null) {
							System.out.println("Book not found");
						} else {
							b1.setQuantity(-1);
							System.out.println(b1.getBookTitle() + " has been issued");
						}
						break;
					
					case 4:
						System.out.println("Enter the title of the book to return : ");
						Book b2  = bookCollection.get(sc.next());
						
						if(b2 == null) {
							System.out.println("Book not found");
						} else {
							b2.setQuantity(1);
							System.out.println(b2.getBookTitle() + " book has been returned");
						}
						break;
						
					case 5:
						if(bookCollection.size() == 0) {
							System.out.println("No book present in the collection");
							break;
						}
						
						System.out.println("Enter book title to remove : ");
						Book b3 = bookCollection.get(sc.next());
						
						if(b3 == null) {
							System.out.println("Book not found");
						} else {
							bookCollection.remove(b3.getBookTitle());
							System.out.println("Book has been removed");
						}
						break;
					
					case 6:
						exitLoop = true;
						System.out.println("Exiting program");
						break;
						
					default:
						System.out.println("Invalid input");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			sc.nextLine();
		}
		
		sc.close();
	}

}
