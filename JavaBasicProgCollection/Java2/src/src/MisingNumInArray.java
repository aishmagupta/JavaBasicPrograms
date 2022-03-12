package src;

public class MisingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0 ;
		int[] arr = {1,9,8,2,4,7,6,3}; //4
	
		Integer len = arr.length;
		
		for(int i=0;i<len;i++) 
		{
			sum = sum + arr[i];
		}		
		int sumtotal = len*((len+1)/2);		
		System.out.print("missing number is : "+(sum - sumtotal));
		
		
	}

}
