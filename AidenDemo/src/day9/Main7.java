package day9;

import java.util.ArrayList;

public class Main7 {

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
		System.out.println(poker);
	}

}
