
package test3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input here ");
		String str = sc.nextLine();
		
		String[] str_arr = str.split(" ");
		int len = str_arr.length;
		
		for(int i=len-1; i<len && i>=0 ; i--) {
			System.out.print(str_arr[i]+" ");
		}	
	}
}
