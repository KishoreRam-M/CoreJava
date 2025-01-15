package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	

	public static void main(String[] args) {
	
		ArrayList <Integer> list = new ArrayList<>();
		
		System.out.println("Enter the element to list collection");
		
		Scanner scanner = new Scanner(System.in);
		
		list.add(scanner.nextInt());
		
		for(Integer k : list)
		
		{
		
			System.out.println(k);
		}

	}

}

