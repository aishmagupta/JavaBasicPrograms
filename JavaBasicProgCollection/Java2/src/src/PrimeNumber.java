package src;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a = 0;
		boolean flag = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		a=s.nextInt();		
	
		for(int i=2;i<=a/2;i++) 
			{	
				if(a%i==0) 
				{
					flag=true;
					//break;
				}	
			}
		if(flag) {
			System.out.println(a+" : is not a prime number");
		}		
		else 
		{
			System.out.println(a+" : is a prime number");		
		}
		

	}
	}

