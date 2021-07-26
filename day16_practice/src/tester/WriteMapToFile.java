package tester;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import utils.Utilities;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import com.app.core.Product;

public class WriteMapToFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedWriter bW = new BufferedWriter(new FileWriter("file2"));) {
			HashMap<Integer, Product> hM = Utilities.populateMap();
			for(Map.Entry<Integer, Product> product : hM.entrySet()) {
				bW.write(product.getValue().toString());
				bW.newLine();
			}
			System.out.println("Program over..");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
