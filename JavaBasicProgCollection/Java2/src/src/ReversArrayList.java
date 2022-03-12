package src;

import java.util.ArrayList;
import java.util.Collections;

public class ReversArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("A");
		ar.add("B");
		ar.add("C");
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
		System.out.println(ar.get(0));
		Integer sz =ar.size();
		System.out.println(ar.get(sz-2));
		
		for (String s : ar)
		{
			System.out.println(s);
		}
		
		
		/*ar.clear();
		System.out.print(ar);
		Integer sz =ar.size();
		for(int i =0; i>=sz-1; i--) {
			System.out.print(i);
			ar.add(i);
		}*/
	}

}
