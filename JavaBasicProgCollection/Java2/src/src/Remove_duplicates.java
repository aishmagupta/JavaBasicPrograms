package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		System.out.println(numbers);
		
		Set<Integer> finalList = new HashSet<Integer>(numbers);
		System.out.println(finalList);
		numbers.clear();
		System.out.println(numbers);
		numbers.addAll(finalList);
		System.out.println(numbers);
		
	}
}

