package mypackage;

import java.util.ArrayList;
import java.util.List;

public class RepeatingCountinArray {

	
public static void main(String[] args) {

	//Integer[] arr = {1,2,3,2,4,2,5,3};
	//String[] arr = A.split("");
	String[] arr = {"m","m","i"};
	
	List<String> arrList = new ArrayList<String>();
	//List<Integer> arrList = new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++) {
		int count =1;
		if(!arrList.contains(arr[i])) {
			arrList.add(arr[i]);
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
		System.out.println(arr[i]+" is repeated "+count+" times ");

		
		}
	}
}
}
