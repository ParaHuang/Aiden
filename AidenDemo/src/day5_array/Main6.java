package day5_array;

public class Main6 {

	public static void main(String[] args) {
		//2 dimension array
		//type[][] ary = new type[rowLength][columnLength];
		//int[][] ary = new type[3][4];//all elements are 0 right now
		/*
		//type[][] ary = {
		 	{value1_1,value1_2,value1_3},
		 	{value2_1,value2_2,value2_3},
		 	{value3_1,value3_2,value3_3},
		 	{value4_1,value4_2,value4_3},
		 };
		
		*/
		//double[] ary = {11,22,33,44};
		
		int[][] ary = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		
		//ary[index1][index2]
		System.out.println(ary[2][2]);
		
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
		
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=0 ; j<ary[i].length ; j++) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0 ; i<ary[0].length ; i++) {
			for(int j=0 ; j<ary.length ; j++) {
				System.out.print(ary[j][i]+" ");
			}
			System.out.println();
		}
		
		

//		1  5  9
//		2  6  10
//		3  7  11
//		4  8  12
		
	}

}


















