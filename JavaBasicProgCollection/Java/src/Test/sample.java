package Test;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st matrix size");
		int a = s.nextInt(); int b = s.nextInt();

		System.out.println("Enter 1st matrix elements");
		int first[][]=new int[10][10];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				first[i][j]=s.nextInt();
			}
		}

		System.out.println("Enter 2nd matrix size");
		int m=s.nextInt(); int n=s.nextInt();

		System.out.println("Enter 2nd matrix elements");
		int second[][] = new int[10][10];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				second[i][j]=s.nextInt();
			}
		}

		if (!(b==m)) {
			System.out.println("Enter 2nd matrix size");
		}

		int res[][]=new int[10][10];

		System.out.println("Multiplication of the matrix is");
		for (int i=0;i<a;i++) {
			for(int j=0;j<n;j++) {
				res[i][j]=0;
				for(int k=0;k<m;k++) 
				{
					res[i][j]=res[i][j]+first[i][k]*second[k][j];
				}
				System.out.print(res[i][j]+" ");			
			}
			System.out.println();
		}



	}

}
