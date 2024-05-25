package day3;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//1.endless loop
		//2.0 time loop
		//3.limit times of loop
		
		
		//3_1.limit but certain times of loop
		//essential factor:  
		//a. initial variable(define loop variable)
		//b. condition
		//c. increment
//		int i=1;
//		while(i<=5) {
//			
//			i++;
//		}
		
		
		//3_2.limit but uncertain times of loop
		//open a pet store
		//requirement: buy cats and dogs
		//but as long as I bought 5 cats , then I stop buying and open the store
		//how many pets in total?
		//min result: 5 cats
		//max result: not sure
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;	//save the number of cat
		int totalCount = 0;	//save the number of pets
		while(true) {
			System.out.println("what are you gonna buy? 1-cat  2-dog:");
			int option = scanner.nextInt();
			totalCount++;
			//if it's a cat, then count
			if(option==1) {
				count++;
			}
			
			//if there are 5 cats, then we stop
			if(count==5) {
				break;
			}
		
		}
		System.out.println(totalCount+" pets in this store, "+count+" cats and "+ (totalCount-count)+" dogs");
	}

}















