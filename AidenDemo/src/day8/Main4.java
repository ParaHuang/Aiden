package day8;

import java.util.ArrayList;

public class Main4 {

	public static void main(String[] args) {
		//primitive type:	int short long     double float    boolean     char    byte
		//reference type:	Random,String,ArrayList,Object,Main4,8 kind of Wrapper Class.....
		
		//generic: data restriction, it's reference type
		//Wrapper class
		//primitive     		Wrapper class
		//int					Integer
		//short					Short
		//long					Long
		//double				Double
		//float					Float
		//boolean				Boolean
		//char					Character
		//byte					Byte
		
		
		int a = 10;
		Integer b = 10;
		b = a;
		a = b;
		
		//old version:
		Integer c = new Integer(10);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		
		System.out.println(list);
		int x = list.get(2);
		System.out.println(x);
		
		int y = list.remove(2);
		System.out.println(y+" is just removed");
		System.out.println("now the list is "+list);
		
//		list.remove(44);//44->int, remove by Index
//		Integer z = 44;//Integer
//		list.remove(z);//remove by object
		list.remove((Integer)44);	//cast 44 from int to Integer
		System.out.println("now the list is "+list);
		
	}

}












