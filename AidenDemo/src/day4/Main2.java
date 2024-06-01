package day4;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		//user vs computer:  rock paper scissors
		Scanner scanner = new Scanner(System.in);//create a Scanner, to scan keyboard
		Random random = new Random();
		
		//user choose
		System.out.println("choose:1-rock 2-paper 3-scissors");
		//wait for us input an integer number, after we confirm the input, then the number will saved into variable user
		int user = scanner.nextInt();
		System.out.print("you just chose:");
		if(user==1) {
			System.out.println("rock");
		}else if(user==2) {
			System.out.println("paper");
		}else {
			System.out.println("scissors");
		}
		
		//computer choose
		int computer = random.nextInt(1, 4);
		System.out.print("Computer just chose:");
		if(computer==1) {
			System.out.println("rock");
		}else if(computer==2) {
			System.out.println("paper");
		}else {
			System.out.println("scissors");
		}
		
		//judge
		if(user==computer) {
			System.out.println("it's a tie");
		}else if(user==1 && computer==3
				||user==2 && computer==1
				||user==3 && computer==2) {
			System.out.println("user win");
		}else {
			System.out.println("user lose");
		}
		
		System.out.println("do you want to play for one more round: 1-yes   2-no");
		
	}

}












