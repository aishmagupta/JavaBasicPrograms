package Test;

public class Pyramid {

	public static void main(String[] args) {

		Integer numofRows = 3;
		for (int i=1;i<=numofRows;i++) 
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}
