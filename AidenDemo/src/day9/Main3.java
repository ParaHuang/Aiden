package day9;

import java.util.ArrayList;
import java.util.Random;

public class Main3 {

	public static void main(String[] args) {
//		1.You are organizing a small party, which is only allowed 5 people to attend,but 10 people signed for this party, they are:
//		Jhon, Jack, Alex, Helan, Cecilia, Mia,So nia, Tomas, Tyler, Chris.
//		Now you need to choose 5 of them randomly to attend your party.
//		Try to create a program to make it come true, in the end, output your guests' name one by one.
		String[] names = {"Jhon","Jack","Alex","Helan","Cecilia","Mia","Sonia","Tomas","Tyler","Chris"};
//		Random random = new Random();
//		//generate a random number
//		int index = random.nextInt(names.length);//0~9
		
		
		//				0~1
		
		ArrayList<String> list = new ArrayList<String>();
		//   A        B       C
		for(int i=0 ; i<5 ; i++) {
			//D
			int x = (int)(Math.random()*10);//0.xxxx~9.xxxx
			System.out.println(x+"----"+names[x]);
			if(!list.contains(names[x])) {
				list.add(names[x]);
			}else {
				i--;
			}
		}
		
		//A->B->D->C->B->D->C->B->D->C->B->D->C->B->D->C->B(B is not true,end loop)
		
		System.out.println("people to join the party:"+list);
	}

}
