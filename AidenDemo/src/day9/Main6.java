package day9;

import java.util.LinkedHashSet;

public class Main6 {

	public static void main(String[] args) {
		//Set:  1. can't save duplicate value    2.it doesn't have index
		//HashSet:not order   
//		HashSet<Integer> set = new HashSet<Integer>();
//		TreeSet<Integer> set = new TreeSet<Integer>();	//in natural order
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(); //in add order
		
		//add
		set.add(66);
		set.add(11);
		set.add(22);
		set.add(55);
		set.add(33);
		set.add(44);
		
		System.out.println(set);
		
		
	}

}
