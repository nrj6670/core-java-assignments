package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import java.text.SimpleDateFormat;

public class GenericDisplay {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
	
	public static <T extends Comparable<? super T>> String display(Collection<T> dataCollection) {
		String ans = "[";
		
		Iterator<? extends T> itr = dataCollection.iterator();
		
		while(itr.hasNext()) {
			ans += itr.next().toString() + ", ";
		}
		ans += "]";
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AL<Integer> l1, HS<String> l2 , LL<Date> l3
		
		ArrayList<Integer> l1 = new ArrayList<>();
		HashSet<String> l2 = new HashSet<>();
		LinkedList<Date> l3 = new LinkedList<>();
		
		l1.add(1);
		l1.add(3);
		l1.add(2);
		
		l2.add("Hello");
		l2.add("to");
		l2.add("the");
		l2.add("world of generics");
		
		try {
		l3.add(sdf.parse("1-1-1970"));
		l3.add(sdf.parse("16-10-2014"));
		l3.add(sdf.parse("24-6-2021"));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("ArrayList of integer = "+display(l1));
		System.out.println("HashSet of string = "+display(l2));
		System.out.println("LinkedList of date = "+display(l3));
	}

}
