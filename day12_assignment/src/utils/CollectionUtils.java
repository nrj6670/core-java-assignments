package utils;

import java.util.ArrayList;
import com.app.core.Employee;
import com.app.core.Manager;
import com.app.core.SalesManager;
import com.app.core.Worker;

public class CollectionUtils {
	public static ArrayList<? super Employee> fill() {
		ArrayList<? super Employee> arrList = new ArrayList<>();
		arrList.add(new Employee(120, "dk", "Marketing"));
		arrList.add(new Manager(100, "abc", "Support"));
		arrList.add(new SalesManager(54, "mno", "Marketing"));
		arrList.add(new Worker(123, "klm", "Distributor"));
		
		return arrList;
	}
}
