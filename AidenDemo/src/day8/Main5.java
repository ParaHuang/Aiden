package day8;

import java.util.ArrayList;

public class Main5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(22);
		
		//return the index of a element, return -1 if it doesn't exist
		int index = list.indexOf(55);
		System.out.println(index);
		
		
		String str = "hello world, hello java";
		//count the times for every character display
		//output: 
		//h displayed 2 times
		//e displayed 2 times
		//l displayed 5 times
		char[] ary = str.toCharArray();
		for(char c:ary) {
			System.out.println(c);
		}
		
	}

}












