package day5_array;

public class Main7 {

	public static void main(String[] args) {
		//this array represents the scores of each subject for each student
		int[][] ary = {
		//subject1 	subject2 	subject3 	subject4		
			{71,	82, 		73,			94},			//student 1
			{95,	66,			97,			88},			//student 2
			{96,	90,			81,			92}				//student 3
		};
		
		//print the total score for each student 
		for(int i=0 ; i<ary.length ; i++) {
			int sum=0;
			for(int j=0 ; j<ary[i].length ; j++) {
				sum+=ary[i][j];
			}
			System.out.println("the total scores for student "+(i+1)+" is "+sum);
		}
		System.out.println();
		
		//print the average score for each subject 
		for(int i=0 ; i<ary[0].length ; i++) {
			int sum=0;
			for(int j=0 ; j<ary.length ; j++) {
				sum+=ary[j][i];
			}
			System.out.println("the total scores for subject "+(i+1)+" is "+sum);
		}
		
		
		
	}

}























