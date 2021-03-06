package utils;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.app.core.*;
import static java.time.LocalDate.parse;

public class CollectionUtil {
	public static List<Book> populateList() {
		//String title, Category cat, double price, String author, LocalDate dt, int quantity
		List<Book> ls = new ArrayList<Book>();
		ls.add(new Book("Genghis Khan and the Making of the Modern World", Category.valueOf("HISTORY"), 599.99, "Jack Weatherford", parse("2004-03-16"), 100));
		ls.add(new Book("The Hitchhiker's Guide To The Galaxy", Category.valueOf("SCIFI"), 1099, "Douglas Adam", parse("2014-09-17"), 50));
		ls.add(new Book("The Alchemist", Category.valueOf("FICTION"), 400, "Paulo Coelho", parse("1988-05-19"), 149));
		ls.add(new Book("The silent patient", Category.valueOf("THRILLER"), 1600, "Alex Michaelides", parse("2019-02-05"), 1000));
		ls.add(new Book("The Four: The Hidden DNA of Amazon, Apple, Facebook, and Google", Category.valueOf("TECHNOLOGY"), 611.12, "Scott Galloway", parse("2017-10-03"), 100));
		return ls;
	}
	
	public static HashMap<String,Book> populateMap() {
		HashMap<String,Book> hM = new HashMap<String,Book>();
		List<Book> lS = populateList();
		for(Book b : lS) {
			hM.put(b.getTitle(), b);
		}
		return hM;
	}
}
