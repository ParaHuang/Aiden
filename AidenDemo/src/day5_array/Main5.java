package day5_array;

import java.util.Arrays;

public class Main5 {

	public static void main(String[] args) {
		
		int[] ary = {66,22,100,44,55,11,77};
		
		for(int i=0 ; i<ary.length-1 ; i++) {	//the position we are looking at 
			for(int j=i+1 ; j<ary.length ; j++) {//the rest elements
				if(ary[i]<ary[j]) {//sway position 0 and i
					int temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}		
		}
		
		System.out.println(Arrays.toString(ary));//to see the String format of an array
		
		
	}

}

//2rd way:bubble sorting






