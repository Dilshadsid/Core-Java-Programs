package CenterTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listCurd {
	public static void main(String[] args) {
		
		/*
		 * Scanner scanner =new Scanner(System.in); int n=scanner.nextInt();
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		/*
		 * System.out.println( list.remove(3)); list.set(2, 1); list.add(2, 0);
		 */
		/*
		 * Collections.reverse(list); System.out.print(list);
		 * 
		 */	
		
		 
		ListIterator<Integer> iterator = list.listIterator(list.size());
	    while (iterator.hasPrevious()) {
		Integer aInteger=	iterator.previous();
		System.out.println(aInteger);
		}
	}
}
