package mypackage;

public class NumberPattern {

	public static void main(String[] args) {
	
		Integer numofRows = 4;
		  for (int i=1;i<=numofRows;i++) 
		  {
			  for(int j=1;j<=i;j++) {
				  System.out.print(j+"  ");
			  }
			  System.out.println();
		  }

	}

}
