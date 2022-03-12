package mypackage;

public class Reverse_string {

	public static void main(String[] args) {
		
		String a = "aishma";
		String final_a = "";
		
		for (int i=a.length()-1;i>=0;i--) {
			
			final_a = final_a + a.charAt(i);
			
		}
		
		System.out.println(final_a);	
	}

}
