package day9;

import java.util.Arrays;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		//add(value), add(index,value)
		//remove(index),remove(object)
		//set(index,value)
		
		//get(index)
		//indexOf(value);
		
		//changeable size parameters
		List<Integer> list = Arrays.asList(11,22,33,44,55,66);//can't modify
		
//		list.add(66);//wrong
//		list.remove(2);//wrong
		System.out.println(list);
//		list.set(1,66);
//		System.out.println(list);
		
		boolean f = list.contains(33);  //replace by indexOf
		System.out.println(f);
		
		List sub = list.subList(1, 4);	//get a part of List
		System.out.println(sub);
		
//		sub.clear();		//clear all element 
//		System.out.println(sub);
		
	}

}
