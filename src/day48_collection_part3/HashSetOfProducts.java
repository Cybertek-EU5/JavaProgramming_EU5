package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		
		Set<Product> prodSet = new TreeSet<>();  
		
		prodSet.add(new Product("book",25.99));
		prodSet.add(new Product("book", 19.99));
		prodSet.add(new Product("magazine", 7.99));
		
		System.out.println(prodSet.toString());
		
		//print each product by using for each loop
		for(Product p : prodSet) {
			System.out.println(p.getPrice());
		}
		
		//print each product by using forEach method
		prodSet.forEach(x -> System.out.println(x.getName()));
		
		
		
		
		

	}

}
