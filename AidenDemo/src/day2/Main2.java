package day2;

public class Main2 {

	public static void main(String[] args) {
		//loop
		/*
		 while(expression){
		 	operations
		 }
		 
		 */
		//1.endless loop
		//2.0 times
		//3.limit times loop
//		int i=1;
//		while(i<=5) {
//			System.out.println("hello");
//			i++;
//		}
//		System.out.println(i);
		//print hello for 5 times
		/*
		 loop for N times
		 int i=1;
		 while(i<=N){
		 	code
		 	i++;
		 }
		 */
		//print 1,2,3,....,99,100
		//print the result of 1+2+3+....+99+100
		
		int i=1;	//loop variable
		int sum=0;
		while(i<=100) {
			//System.out.println(i);
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		
		//print 2,4,6,...,98,100
		i=2;
		while(i<=100) {
			System.out.println(i);
			i+=2;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

