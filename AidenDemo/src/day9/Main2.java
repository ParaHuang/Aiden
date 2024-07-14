package day9;

import java.util.HashSet;

public class Main2 {

	public static void main(String[] args) {
		//Set:  1. can't save duplicate value    2.it doesn't have index
		//HashSet:not order   
		HashSet<Integer> set = new HashSet<Integer>();
		
		//add
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(11);
		set.add(44);
		
		//size
		System.out.println(set);
		System.out.println(set.size());
		
		//use foreach loop to check
		for(int x:set) {
			System.out.println(x);
		}
		
		//remove
		boolean f = set.remove(22);
		System.out.println(f);
		
		
		//
		set.clear();
		System.out.println(set);
		
		
		
		
	}

}
