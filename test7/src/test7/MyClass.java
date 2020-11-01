package test7;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int l = sc.nextInt();
		System.out.println("Enter inputs : ");
		int[] arr = new int[l];
		for(int i=0; i<l; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
/*		int min = arr[0];            
        for (int i = 0; i < l; i++) {              
           if(arr[i]<min)  
               min = arr[i];  
        }  
*/
		
		int min=0;
		for(int i=0; i<l; i++) {
			for(int j=i+1; j<l; j++) {
				if(arr[i]<arr[j]) {
					min=arr[i];
				}
			}
		}		
		System.out.println("Smallest element in array is "+min);
	}

}
