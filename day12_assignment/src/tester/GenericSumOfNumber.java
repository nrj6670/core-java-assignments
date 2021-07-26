package tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class GenericSumOfNumber {
	public static <T extends Number> double getSum(Collection<T> dataCollection) {
		double sum = 0;
		
		Iterator<? extends Number> itr = dataCollection.iterator();
		
		while(itr.hasNext()) {
			sum += itr.next().doubleValue();
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		HashSet<Double> l2 = new HashSet<>();
		LinkedList<Byte> l3 = new LinkedList<>();
		
		l1.add(112);
		l1.add(31);
		l1.add(-22);
		
		l2.add(23.0);
		l2.add(214.3);
		l2.add(146.0);
		
		l3.add((byte)1);
		l3.add((byte)3);
		l3.add((byte)2);
		
		System.out.println("ArrayList sum = " + getSum(l1));
		System.out.println("HashSet sum = " + getSum(l2));
		System.out.println("LinkedList sum = " + getSum(l3));
	}

}
