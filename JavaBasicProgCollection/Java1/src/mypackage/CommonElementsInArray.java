package mypackage;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsInArray {

	public static void main(String[] args) {
		 
		String s = "mississipi";
		String[] b =s.split("");
		
		Set<String> h = new HashSet<String>();
		Set<String> commentelemntstore = new HashSet<String>();
		
		for (String z:b) {
			if(!h.add(z)) {
				System.out.print(z+" ");
			}
			else
			{
				commentelemntstore.add(z);
			}		
			
		}
		List<String> o = new ArrayList<String>(h);
		System.out.println("repeated elements"+o);
		
		List<String> q = new ArrayList<String>(commentelemntstore);
		System.out.println("Unique elements before sort: "+q);
	
		Collections.sort(q);
		System.out.println("Unique elements before sort: "+q);
		
		
		
		
		
		

	}

}
