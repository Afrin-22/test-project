import java.util.Scanner;

public class UpperTriMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int rows = arr.length;
		int cols = arr[0].length;
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix dimension is (mxn) where m and n are equal(a square matrix)");
		System.out.println("Enter value of m:");
		int rows = sc.nextInt();
		System.out.println("Enter value of n:");
		int cols = sc.nextInt();
		 
		if(rows!=cols)
			System.out.println("Please enter a square matrix.");
		
		else {
			int[][] arr = new int[rows][cols];
			System.out.println("Inputs:");
			for(int i=0; i<rows; i++) {	
				System.out.println("row "+(i+1)+":");
				for(int j=0; j<cols; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("Lower triangular matrix:");
			for(int i=0; i<rows; i++) {
				if(i==0)
					System.out.print("[");
				
				for(int j=0; j<cols; j++) {
					if(j < i)    
	                      System.out.print("0 ");    
	                    else {    
	                    	if(i== rows-1 && j==cols-1) 
	                    		System.out.print(arr[i][j]);
	                    	else
	                    		System.out.print(arr[i][j] + " ");
	                    }
					
					if(i== rows-1 && j==cols-1)						
						System.out.print("]");
				}
				
				System.out.println();
				System.out.print(" ");
			}			
		}
		
	}

}
