package day1;

public class Main2 {

	public static void main(String[] args) {
		//decision
		//if,   if...else... ,       if...else if...else if...else...
		/*
		 if(expression){
		 	operation
		 }
		 	 
		 if(expression){
		 	operation1
		 }else{
		 	operation2
		 }
		 	 
		 	 
		 if(expressionA){
		 	operation1
		 }else if(expressionB){
		 	operation2
		 }else if(expressionC){
		 	operation3
		 }else{
		 	operationD
		 }
		 
		 */
		//see if num is even or odd
		int num = -15;
		if(num%2==0) {
			System.out.println(num+" is a even number");
		}else {
			System.out.println(num+" is a odd number");
		}
		
		//see if a year is leap year or normal year
		//leap year:
		//1.that year is divisible by 4 but not divisible by 100
		//2.that year is divisible by 400
		int year = 2000;
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is normal year");
		}
		
		//&&  > ||
		
		
		//loop
	}

}












