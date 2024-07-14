package day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
//		1.You are organizing a small party, which is only allowed 5 people to attend,but 10 people signed for this party, they are:
//		Jhon, Jack, Alex, Helan, Cecilia, Mia,So nia, Tomas, Tyler, Chris.
//		Now you need to choose 5 of them randomly to attend your party.
//		Try to create a program to make it come true, in the end, output your guests' name one by one.
		List<String> list = Arrays.asList("Jhon","Jack","Alex","Helan","Cecilia","Mia","Sonia","Tomas","Tyler","Chris");
		
//		Arrays -> tool for array
//		Collections -> tool for Collection
		Collections.shuffle(list);
		for(int i=0 ; i<5 ; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
