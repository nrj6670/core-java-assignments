package tester;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import utils.Utilities;

public class BinaryWriterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file1"));) {
			oos.writeObject(Utilities.populateMap());
			System.out.println("Program over..");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
