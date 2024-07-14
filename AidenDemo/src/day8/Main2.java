package day8;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		/*
		 Collection
		 	|-----List(ArrayList,LinkedList)
		 	|-----Set(HashSet)
		*/
		//Map
		//|----HashMap
		
		//OOP
		ArrayList list = new ArrayList();
		//1.add element
		list.add(11);
		list.add(88);
		list.add(100);
		
		System.out.println(list);
		//2.get element by index
		System.out.println(list.get(2));
		list.add(77);
		list.add("hello");
		list.add(3.14);
		list.add(true);
//		System.out.println(list.get(3));
		Object num = list.get(3);
		System.out.println();
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//for each: don't care about index
//		int[] ary = {11,22,33,44};
//		list.clear();
		System.out.println("---------");
		for(Object e:list) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
