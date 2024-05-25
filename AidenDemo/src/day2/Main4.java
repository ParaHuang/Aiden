package day2;

public class Main4 {

	public static void main(String[] args) {
//		
		int i=100;
		while(i<1000) {//23
			//i=123 != 1*1*1 + 2*2*2 + 3*3*3
			//i=153 = 1*1*1 + 5*5*5 + 3*3*3
			//1.get every digit out separately
			int a = i%10;//ones, %10 will always get ones
			int b = i%100/10;//tens
			int c = i/100;//hundreds
			if(a*a*a+b*b*b+c*c*c==i) {
				//2.test the equation
				System.out.println(i);
			}
			
			i++;
		}
	
	}

}

