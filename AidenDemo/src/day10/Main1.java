package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
//		1.define an array, save 4 content, they are ♠️   ♥️   ♦️    ♣
		String[] ary = {"♠"," ♥","️♦","️♣"};
//		define an ArrayList， name is poker, save content as the result of the above array combine numbers from 1 to 13， for instance:
		ArrayList<String> poker = new ArrayList<String>();
//		♠️4 ,  ♠️A，  ♦️3 ，♥️7
//		but
//		if the number is 1 , the combination shoud be something with A, like ♠️A   ♥️A   ♦️A    ♣️A
//		if the number is 10 , the combination shoud be something with J, like ♠️J   ♥️J   ♦️J    ♣️J
//		if the number is 11 , the combination shoud be something with Q, like ♠️Q   ♥️Q   ♦️Q    ♣️Q
//		if the number is 12 , the combination shoud be something with K, like ♠️K   ♥️K   ♦️K    ♣️K
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=1 ; j<14 ; j++) {
				if(j==1) {
					poker.add(ary[i]+"A");
				}else if(j==11) {
					poker.add(ary[i]+"J");
				}else if(j==12) {
					poker.add(ary[i]+"Q");
				}else if(j==13) {
					poker.add(ary[i]+"K");
				}else {
					poker.add(ary[i]+j);
				}
			}
		}

		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		for(int i=1 ; i<=3 ; i++) {
			for(int j=0 ; j<7 ; j++) {
				//10		0.xxx~0.9xxxx	0.xxxx ~ 9.xxxxx
				int index = (int)(Math.random()*poker.size());//rangge
				if(i==1) {
					player1.add(poker.get(index));
				}else if(i==2) {
					player2.add(poker.get(index));
				}else {
					player3.add(poker.get(index));
				}
				poker.remove(index);
			}
		}
		System.out.println("Player 1:"+player1);
		System.out.println("Player 2:"+player2);
		System.out.println("Player 3:"+player3);
		

		int index1 = (int)(Math.random()*player1.size());
		String removed1 = player1.remove(index1);
		System.out.println("Player 1 just removed "+removed1);
		System.out.println("Now he has "+player1);

		int index2 = (int)(Math.random()*player2.size());
		String removed2 = player2.remove(index2);
		System.out.println("Player 2 just removed "+removed2);
		System.out.println("Now he has "+player2);

		int index3 = (int)(Math.random()*player3.size());
		String removed3 = player3.remove(index3);
		System.out.println("Player 3 just removed "+removed3);
		System.out.println("Now he has "+player3);
		
//		System.out.println(poker);
	}

}












