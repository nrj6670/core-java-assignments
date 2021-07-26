package tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.app.core.Book;
import static utils.CollectionUtils.populateMap;
import utils.BookHandlingException;
import static utils.IOUtils.storeBook;

public class BookShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//HashMap of key as "book title" and value as "book detail"
		HashMap<String, Book> bookCollection = (HashMap<String, Book>) populateMap();
		
		//a list to store the books added to the cart
		List<Book> cart = new ArrayList<Book>();
		
		//boolean varible to exit loop 
		boolean exitLoop = false;
		
		while(!exitLoop) {
			try {
				System.out.println("***** THE BOOK STORE *****");
				System.out.println("\n1. Display all book in the store\n2. Add book to cart\n"
						+ "3. Show cart content\n4. Check out(exit)\n\nEnter your choice : ");
				
				int choice = sc.nextInt();
						
				switch(choice) {
					case 1:
						System.out.println("\nList of all the books in the store : \n");
						bookCollection.values().stream().forEach(System.out::println);
						System.out.println();
						break;
						
					case 2:
						System.out.println("Enter book name to add to the cart : ");
						sc.nextLine();
						String bookTitle = sc.nextLine();
						
						//Checking if the bookCollection map contains any key with value stored
						//in bookTile variable.
						if(!bookCollection.containsKey(bookTitle)) {
							//if the bookCollection map contains the book then throwing an
							//exception of custom type with message
							throw new BookHandlingException("Book not found in the store");
						}
						
						//if the above check fails than adding the book to cart list
						cart.add(bookCollection.get(bookTitle));
						System.out.println("Book added to cart --> " + bookTitle + "\n");
						break;
						
					case 3:
						//checking if the cart list is empty
						if(cart.isEmpty()) {
							System.out.println("\nCart is empty\n");
							break;
						}
						System.out.println("\nCart content : \n");
						
						//using stream method with list to get data of list in form of stream.
						//for each method to process each data stream.
						//Using method reference of System.out object to invoke println for each
						//data stream
						cart.stream().forEach(System.out::println);
						System.out.println();
						break;
						
					case 4:
						//checking if the cart list is empty
						if(cart.isEmpty()) {
							System.out.println("\nNo book purchased\n");
							break;
						}
						System.out.println("\nBook purchased : \n");
						
						//using stream method with list to get data of list in form of stream.
						//for each method to process each data stream.
						//Using lambda expressing for each data stream and printing the title
						cart.stream().forEach(book -> System.out.println("| " + book.getBookTitle() + " | "));
						
						//mapToDouble method return DoubleStream from the piped stream 
						//sum method sums the piped stream data 
						double cartTotal = cart.stream().mapToDouble(Book::getBookPrice).sum();
						System.out.println("\nTotal cart value = " + cartTotal + "\n");
						
						//storeBook method of IOUtils is a static method that accepts a list and 
						//a file name 
						storeBook(cart, "CartContentFile");
						exitLoop = true;
						break;
					
					default:
						System.out.println("Invalid input...Try again...");
				}
			}catch(Exception e) {
				//printing stack trace whenever an exception occurs
				e.printStackTrace();
			}
			
		}
		//closing scanner
		sc.close();
	}

}
