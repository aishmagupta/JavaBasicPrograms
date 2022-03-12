package src;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		Integer n=s.nextInt();
		System.out.print(Factorial.fact(n));
	}
	
	public static Integer fact(int number)
	{
		int f=1;
		for(int i=number;i>0;i--) {
			f=f*i;
		}
		return f;
	}

}
