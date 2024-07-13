package day8;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {99,22,88,11,55,66,100,23,97};
		
		//copy array with a certain range
		int[] newArr1 = Arrays.copyOfRange(ary, 2, 7);
		System.out.println(Arrays.toString(newArr1));
		
		int[] newArr2 = Arrays.copyOfRange(ary, 2, 17);
		System.out.println(Arrays.toString(newArr2));

		//from has to be in the correct range   0~length
		int[] newArr3 = Arrays.copyOfRange(ary, 9, 17);
		System.out.println(Arrays.toString(newArr3));
		
		int[] newArr4 = new int[12];
		//{0,0,0,0,0,0,0,0,0,0,0,0}
		//1:original array
		//2:in original array, copy from which position 
		//3:new array, we need define firstly
		//4:in new array, where we start to put those elements
		//5:in original array,how many elements you want to copy
		System.arraycopy(ary,5, newArr4, 8, 4);
		System.out.println(Arrays.toString(newArr4));
		
		//1.the size of array can't change
		//2. ary[index] to operate element , index:0~length-1
		
		
		
	}

}















