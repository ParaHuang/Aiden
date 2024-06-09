package day5_array;

public class Main1 {

	public static void main(String[] args) {
		//1.define
		//a.define an array with a specific type and length,but you don't know what data you saved,right now they are default data
		//default data:
		//type[] ary = new type[length];
//		int[] ary = new int[5];
		//b.proper way to define an array  with a specific type, meanwhile define the element inside,the length is also set up since the amount of initial values
//		int[] ary = new int[] {11,22,33,44,55};
		//c.shorter way for b
		int[] ary = {11,22,33,44,55,77,88};
		
		
		
		//2.use them by ary[index] , index:0~length-1
//		System.out.println(ary[0]);
//		System.out.println(ary[1]);
//		System.out.println(ary[2]);
//		System.out.println(ary[3]);
//		System.out.println(ary[4]);
//		
//		ary[0] = 11;
//		ary[1] = 22;
//		ary[2] = 33;
//		ary[3] = 44;
//		ary[4] = 55;
//		ary[5] = 66;//wrong
		
		for(int i=0 ; i<ary.length ; i++) {
			System.out.println(ary[i]);
		}
		//for-each:when we want to use the element of array,but we don't change the value of them
		/*
		 for(type variableName:ary){
		 
		 }
		 */
		for(int e:ary) {
			System.out.println(e);
//			e = 100;
		}

		System.out.println("the last element is:"+ary[ary.length-1]);
		
	}

}










