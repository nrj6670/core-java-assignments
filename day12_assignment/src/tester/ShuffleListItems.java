package tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ShuffleListItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strArr = {"apple", "orange", "mango", "car", "bike"};
		List<String> strList= Arrays.asList(strArr);
		Collections.shuffle(strList);
		for(String temp : strList) {
			System.out.print(temp + ", ");
		}
		System.out.println();
		Double [] dblArr = {1.1,2.2,3.3,4.4,5.5};
		List<Double> dblList = Arrays.asList(dblArr);
		Collections.shuffle(dblList);
		for(Double temp : dblList) {
			System.out.print(temp + ", ");
		}
	}

}
