package week4.day4124;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		int[] age = {23,45,34,12,45,67,89,90,76,43,67};
		
	//	Set<Integer> value = new LinkedHashSet<Integer>(); // Print the output in insertion order
		
	//	Set<Integer> value = new HashSet<Integer>(); // Print the output in random order
		
		Set<Integer> value = new TreeSet<Integer>(); // Print in ASCII order

//		for (int i = 0; i < age.length; i++) {
//			value.add(age[i]);
			
//		}
		
//		System.out.println(value);
		
		// for each loop - collection - no need init, cond, incr/decr
		
		for (Integer data : age) { // Data - Initialization, age - Variable of iteration
			value.add(data);
			
		}
		
		System.out.println(value);
		
		// To print particular value then convert set into list as there is no get method in Set
		
		// Convert Set into List
		List<Integer> findValue = new ArrayList<Integer>(value); // Integer - Wrapper class
		Integer i = findValue.get(5);
		System.out.println(i);
	}

}

/*
 * Maps
 * Interface (Sub Interface of collection)
 * As it is interface, we cannot create objects
 * Implementations -> HashSet, TreeSet, LinkedHashSet
 * Set cannot have duplicate values inside the collection
 * Set order depends on implementation order
 * HashSet uses Hashing Algorithm (Random Order)
 * TreeSet uses ASCII order
 * LinkedHashSet uses Insertion Order
 * 
 * Syntax: Set<String> mentors = new HashSet<String>();
 * 
 * All methods of HashSet is not exposed in the mentors
 * Only methods of Set is exposed (only showing the required Implemtation)
 * 
 * add() - adds an element to a set
 * addAll() - adds all elements of one set to another
 * get() - cant be used, as it remove duplicates, we can't use it xxxxxxxxxxxxxxx
 * remove()
 * removeAll()
 * clear()
 * size()
 * toArray()
 * contains()
 */
