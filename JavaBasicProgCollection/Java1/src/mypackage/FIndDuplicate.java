package mypackage;

import java.util.HashMap;

public class FIndDuplicate {

	public static void main(String[] args) {
		
		String s = "javashava";
		
		HashMap h = new HashMap();
		
		for (int i =0; i< s.length();i++) {
			char c = s.charAt(i);
			if (h.containsKey(c)) {
				//h.put(c, h.get(c) + 1);
			}
		}
			
		}
		

	}


