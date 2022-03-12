package src;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list {

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(4);
		A.add(2);
		A.add(2,3);
		A.add(1);
		
		System.out.println(A);
		//A.set(1, "rajni");
		for (Integer s:A){
			System.out.println(s);
		}
		
		Collections.sort(A);
		System.out.println(A);
		
		for(Integer B:A) {
			System.out.println(B);
		}
		Integer z = A.size();
		Integer i = A.get(z-3);
		System.out.print(i);
		
		A.clear();
	}

}
