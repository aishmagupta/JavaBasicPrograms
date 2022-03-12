package src;

import java.util.Scanner;

public class FirstNLastNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		System.out.println("Insert a number");
		Integer number = s.nextInt();
		
		int Firstdigit=0; int Lastdigit=0;
		
		Firstdigit = number;
		while(Firstdigit>=10) {
			Firstdigit = Firstdigit /10;
		}
		
		Lastdigit = number%10;
		
		System.out.println("Firstdigit : "+Firstdigit);
		System.out.println("Lastdigit : "+Lastdigit);
				
	}

}
