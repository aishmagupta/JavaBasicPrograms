package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sample{    

	public static void main(String[] args)
	{
	
		Integer A = 43345;
		Integer first=0; Integer last=0;
		last = last%10;
		
		first=A;
		while(first>=10) 
		{
			first = first /10;		
		}
		
		System.out.println("first "+first );
		
	}
}

