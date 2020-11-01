package test7;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass1 {

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
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[l-3]);
		
/*		int count=0,max=0;
		for(int i=0; i<l; i++) {
			for(int j=1; j<l; j++) {				
				
				if (arr[i] > arr[j])   
                { 
                   count++;
                   if(count==3)
       				max=arr[i];
                }				
			}
			
		}
		System.out.println(max);
*/

/*		int count=0,temp=0;
		for(int i=0; i<l; i++) {
			for(int j=i+1; j<l; j++) {				
				
				if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
			}
		}
		System.out.println(arr[l-3]);
*/
	}

}
