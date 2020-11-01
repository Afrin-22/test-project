import java.util.*;
/*import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;*/

public class MyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int k=1;

		String[] toys_arr = {"lion","tiger","giraffe","parrot","bear"};
		List<String> toys = Arrays.asList(toys_arr);

		List<String> S1 = new ArrayList<>(toys.size());
		for(String i : toys) {
			S1.add(i);
		}
		System.out.println("Original elements :"+S1);
		
		while(k>0) {
			System.out.println("Input:");
			String str = sc.next();
		
			
			int index = toys.indexOf(str);	
			index++;
			System.out.println("Taking out "+str+" from position "+index);
			
	        Iterator<String> ltr = S1.iterator(); 

	        String i="";
			while (ltr.hasNext()) 
	        { 
	            i = ltr.next(); 	            
	            if(i.equals(str)) {
					ltr.remove();
	                break;
	            }
	  	    }
			
			System.out.println(S1);
			k++;
		}
	}	
}
