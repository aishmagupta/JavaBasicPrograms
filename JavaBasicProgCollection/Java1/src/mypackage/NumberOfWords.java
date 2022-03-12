package mypackage;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My Name Is Aishma";
		String[] s1 = s.split(" ");
		System.out.println(s1.length);
		
		for (int i=0; i<s1.length;i++){
			System.out.println(s1[i]);
		}
		
	}

}
