package src;

import java.util.ArrayList;
import java.util.Collections;

public class SecondlargestNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(100);
		arr.add(10);
		arr.add(50);
		Collections.sort(arr);
		System.out.println(arr);
		Integer high = arr.size();
		
		
		System.out.println("Second highest no : "+arr.get(high-2));

		

				
	}

}
