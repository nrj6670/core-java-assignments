package utils;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import com.app.core.Book;

public class IOUtils {
	public static void storeBooks(HashMap<String, Book> hM, String fileName) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(hM);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static HashMap<String,Book> restoreBooks(String fileName) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			return (HashMap<String,Book>)ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
			return new HashMap<String, Book>();
		}
	}
}
