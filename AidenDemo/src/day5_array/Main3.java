package day5_array;

public class Main3 {

	public static void main(String[] args) {
		int[] ary = {-66,-22,-100,-44,-55,-11,-77};
		//find the max and min element
		int max=ary[0];
		int min=ary[0];
		for(int i=1 ; i<ary.length ; i++) {
			if(ary[i]>max) {
				max = ary[i];
			}
			if(ary[i]<min) {
				min = ary[i];
			}
		}
		System.out.println(max);
		System.out.println(min);	
		
	}

}
