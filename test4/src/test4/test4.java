package test4;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Complete input string : ");
		String str = sc1.next();
		System.out.println("input substring : ");
		String sub = sc2.next();
		
		if(str.contains(sub)) {
			int pos = str.indexOf(sub);
			System.out.println(pos);
		}
		else
			System.out.println("-1");
		
	}

}
