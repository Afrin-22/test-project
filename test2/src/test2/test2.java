package test2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter input string : ");
			String input = sc.nextLine();
			
			Pattern p = Pattern.compile("[a-z]+|\\d+");
			Matcher m = p.matcher(input);
		
			ArrayList<String> arr = new ArrayList<>();
			while (m.find()) {
			    arr.add(m.group());
			}
			
			System.out.println("\nSeparating mixed string into definite pattern in array format...");
			System.out.println(arr);
			
			int n = arr.size();
					
			System.out.println("\nOutput is here : ");
			for(int i=0; i < n; i++) {
				
				String alp = arr.get(i);
				String num = arr.get(i+1);
				i++;

				for(int j =0; j < Integer.parseInt(num); j++) {
					System.out.print(alp);
				
				}
					
			}
		}
	}
}