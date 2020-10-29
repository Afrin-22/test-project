import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		String str = sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();	
		
		if(sb.toString().equals(str))
			System.out.println("Is a palindrome");
		else
			System.out.println("Not a palindrome");
		
		/*
		 * char[] ch = str.toCharArray(); char[] rev = new char[ch.length];
		 * 
		 * for(int i=ch.length-1,j=0; i>=0&&i<ch.length; i--) { rev[j++] = ch[i]; }
		 * String rev_str = String.valueOf(rev);
		 * 
		 * if(rev_str.equals(str)) System.out.println("Is a palindrome"); else
		 * System.out.println("Not a palindrome");
		 */
	}

}
