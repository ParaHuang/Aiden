package day8;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		//Generic: data restriction 
		//E:Element
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hello");
		list.add("hola");
		list.add("hey");
		for(String s:list) {
			System.out.println(s);
		}
		//3.insert
		list.add(1, "new element");//index:0~orginal size
		System.out.println(list);
		
		//4.remove
		//4.1:by index(0~size-1), return the removed element, 
		String e1 = list.remove(2);
		System.out.println(e1+" is just removed");
		System.out.println(list);
		
		boolean f = list.remove("hello00000");
		System.out.println("remove element :"+f);
		System.out.println(list);
		
	}

}
