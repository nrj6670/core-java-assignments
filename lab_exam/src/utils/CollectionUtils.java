package utils;

import com.app.core.Book;
import com.app.core.Category;

import static java.time.LocalDate.parse;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionUtils {
	//populateList method to return a list populated with book data
	public static List<Book> populateList() {
		//Array list to store book data
		List<Book> bookList = new ArrayList<Book>();
		
		//String title, String author, Category category, double price, LocalDate publishDate
		bookList.add(new Book("The silent patient", "Alex Michaelides", Category.valueOf("THRILLER"), 199, parse("2019-02-05")));
		bookList.add(new Book("The Alchemist", "Paulo Coelho", Category.valueOf("FICTION"), 208.99, parse("2005-10-17")));
		bookList.add(new Book("The Silk Roads", "Peter Frankopan", Category.valueOf("HISTORY"), 301.77, parse("2015-09-18")));
		bookList.add(new Book("Da Vinci Code", "Dan Brown", Category.valueOf("MYSTERY"), 681, parse("2009-03-31")));
		bookList.add(new Book("The Time Machine", "H. G. Wells", Category.valueOf("SCIFI"), 112, parse("2015-07-01")));
		
		return bookList;
	}
	
	//populateMap method return a Map containing books. This data is extracted from the list..
	//obtained from populateList method.
	
	//key(String) : title of the book (primary key)
	//value : instance of book
	public static Map<String, Book> populateMap() {
		Map<String, Book> bookCollection = new HashMap<String, Book>();
		List<Book> bookList = populateList();
		
		//Iterating through each book using for-each loop and storing the book  data into Map
		for(Book b : bookList) {
			//getBookTile method of Book class is a getter that return book title value
			bookCollection.put(b.getBookTitle(), b);
		}
		
		return bookCollection;
	}
}
