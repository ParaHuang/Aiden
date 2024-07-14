package day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main4 {

	public static void main(String[] args) {
//		1.You are organizing a small party, which is only allowed 5 people to attend,but 10 people signed for this party, they are:
//		Jhon, Jack, Alex, Helan, Cecilia, Mia,So nia, Tomas, Tyler, Chris.
//		Now you need to choose 5 of them randomly to attend your party.
//		Try to create a program to make it come true, in the end, output your guests' name one by one.
		String[] names = {"Jhon","Jack","Alex","Helan","Cecilia","Mia","Sonia","Tomas","Tyler","Chris"};
		
		HashSet<String> set = new HashSet<String>();
		while(set.size()<5) {
			//D
			int x = (int)(Math.random()*10);//0.xxxx~9.xxxx
			System.out.println(x);
			set.add(names[x]);
		}
		System.out.println(set);
	}

}
