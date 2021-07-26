package tester;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import com.app.core.Product;
import java.util.Map;

public class BinaryReaderTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file1"));) {
			System.out.println(((Map<Integer, Product>)ois.readObject()).values());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
