package utils;

import com.app.core.Book;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOUtils {
	public static void storeBook(List<Book> bookList, String fileName) throws FileNotFoundException, IOException {
		//using try with resources so that autoclosable functionality of ObjectOutStream can
		//be invoked automatically
		//Using ObjectOutputStream to store the byte stream of data of book list to the file name
		//passed with fileName variable
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(bookList);
		}
	}
}
