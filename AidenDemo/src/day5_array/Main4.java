package day5_array;

import java.util.Arrays;

public class Main4 {

	public static void main(String[] args) {
		int[] ary = {66,22,100,44,55,11,77};
		
		//sorting
		//find the min value for index:0
		//compare ary[0] with the rest elements
		for(int i=1 ; i<ary.length ; i++) {//the rest elements
			if(ary[0]>ary[i]) {//sway position 0 and i
				int temp = ary[0];
				ary[0] = ary[i];
				ary[i] = temp;
			}
		}
		System.out.println(Arrays.toString(ary));//to see the String format of an array
		
		//find the second min value for index:1
		//compare ary[1] with the rest elements
		for(int i=2 ; i<ary.length ; i++) {
			if(ary[1]>ary[i]) {
				int temp = ary[1];
				ary[1] = ary[i];
				ary[i] = temp;
			}
		}
		System.out.println(Arrays.toString(ary));
		

		//find the second min value for index:2
		//compare ary[2] with the rest elements
		for(int i=3 ; i<ary.length ; i++) {
			if(ary[2]>ary[i]) {
				int temp = ary[2];
				ary[2] = ary[i];
				ary[i] = temp;
			}
		}
		System.out.println(Arrays.toString(ary));	
		
	}

}








