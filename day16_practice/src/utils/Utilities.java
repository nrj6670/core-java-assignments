package utils;

import com.app.core.*;

import java.util.ArrayList;
import java.util.HashMap;
import static java.time.LocalDate.parse;

public class Utilities {
	public static ArrayList<Product> populateList() {
		//int id, String name, double price, Category category, LocalDate manuDate
		ArrayList<Product> ls = new ArrayList<>();
		ls.add(new Product(100, "abc", 500.25, Category.valueOf("clothes".toUpperCase()), parse("2007-11-05")));
		ls.add(new Product(412, "def", 699, Category.valueOf("stationary".toUpperCase()), parse("2012-06-23")));
		ls.add(new Product(253, "mno", 15000, Category.valueOf("electronics".toUpperCase()), parse("2021-04-20")));
		ls.add(new Product(461, "xyz", 1500.99, Category.valueOf("video_games".toUpperCase()), parse("2019-10-08")));
		
		return ls;
	}
	
	public static HashMap<Integer, Product> populateMap() {
		HashMap<Integer, Product> hM= new HashMap<>();
		populateList().forEach(p -> hM.put(p.getProductId(), p));
		return hM;
	}
}
