package assignment_5;

import java.util.ArrayList;
import java.util.Collections;

public class ExchangePositions {

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<String>();
	        al.add("Naveen");
	        al.add("Kumar");
	        al.add("Nikesh");
	        al.add("Shivadeep");
	        al.add("Durga");
	        al.add("Shivaji");

	        System.out.println("ArrayList before Swap:");
	        for(String temp: al){
	            System.out.println(temp);
	        }

	        //Swapping 2nd(index 1) element with the 5th(index 4) element
	        Collections.swap(al, 1, 4);

	        System.out.println("ArrayList after swap:");
	        for(String temp: al){
	            System.out.println(temp);
	        }

	}

}
