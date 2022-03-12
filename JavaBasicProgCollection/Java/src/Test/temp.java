package Test;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Integer a = s.nextInt(); Integer b = s.nextInt();
		
		//1
		int first[][] = new int[a][b];
		
		for(int i=0;i<a;i++) {
			for(int j=0;i<b;j++)
			{
				first[i][j]=s.nextInt();
			}
		}
		
		
		
	}

}
