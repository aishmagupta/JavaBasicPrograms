package mypackage;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//MOM 
		String s = "GOD";
		String finalstr = "";
		for (int i = s.length()-1;i>=0;i--)
		{
			finalstr  =   finalstr + s.charAt(i);
		}
		
		if (finalstr.equals(s)){
			System.out.print(s + " : str is a Palindrom");
		}
		else 
		{
			System.out.print(s + " : str is not a Palindrom");
		}
			
	}
	

}
