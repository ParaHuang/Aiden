package day5_array;

public class Main2 {

	public static void main(String[] args) {
		int[] ary = {11,22,33,44,55,66,77};
		//check elements backwards
		//see the result of every element add together
		int sum=0;
		for(int i=ary.length-1 ; i>=0 ; i--) {
			System.out.println(ary[i]);
			sum+=ary[i];
		}
		
		System.out.println(sum);
		
		
	}

}
