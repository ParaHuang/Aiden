package day7;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		//Arrays: a tool for array
		int[] ary = {99,22,88,11,55,66,100,23,97};
//		System.out.println(indexOf(ary, 11));
//		System.out.println(ary);
//		for(int x:ary) {
//			System.out.println(x);
//		}
		
		//1.get the String format of an array
		System.out.println(Arrays.toString(ary));
		//2.sort an array
		Arrays.sort(ary);
		System.out.println(Arrays.toString(ary));
		
		//3.binary search (ary has to be sorted)
		//number exist: return the real index
		//not exist: return -(1+the index might be if it exist)
		System.out.println(Arrays.binarySearch(ary, 22));
		System.out.println(Arrays.binarySearch(ary, 88));
		System.out.println(Arrays.binarySearch(ary, 66));

		System.out.println(Arrays.binarySearch(ary, 77));
		System.out.println(Arrays.binarySearch(ary, 44));
		
		//4.copy array:copy the orginal array with a new length.
		//if new length is shorter, get copy part of array from the beginning
		//if new length is longer, get copy the whole array and fulfill the default value
//		newArr = Arrays.copyOf(orignalArr, newLength)
		int[] newArr1 = Arrays.copyOf(ary, 4);
		System.out.println(Arrays.toString(newArr1));
		int[] newArr2 = Arrays.copyOf(ary, 14);
		System.out.println(Arrays.toString(newArr2));
		
		
		//define a method, call it insert
		//it takes an integer sorted array and an integer number as arguments
		//then insert this number at the correct position into this array
		
		
//		newArr = Arrays.copyOfRange(originalAry, from, to)
//		System.arraycopy(orginalAry, fromWhere, newAry, putWhere, putHowMany)
		
	}
	
	//fine the index of num inside of ary
	public static int indexOf(int[] ary,int num) {
		for(int i=0 ; i<ary.length ; i++) {
			if(ary[i] == num) {
				return i;
			}
		}
		return -1;
	}
}











