package Test;

import java.util.Scanner;

public class Matrix_additionNmultiplication {

	public static void main(String args[])
	{ 

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an operator (+, *): ");
		char operator = reader.next().charAt(0);

		//creating sample matrix 
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};    

		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[3][3];  //

		switch(operator) {
		case '+' : 
			for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
					c[i][j]=a[i][j]+b[i][j]; 
					System.out.print(c[i][j]+" ");    
				}    
				System.out.println();   
			}    

		case '*' :  
			for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
					c[i][j]=0;      
					for(int k=0;k<3;k++)      
					{      
						c[i][j]+=a[i][k]*b[k][j];      
					}
					System.out.print(c[i][j]+" "); 
				}
				System.out.println();
			}  


		}

	}

}
