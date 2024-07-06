package day7;

public class Main1 {
	
	int a;
	public static void main(String[] args) {
		//Goldbach conjecture
		//every even number which is greater than 2 equals as the sum of two prime numbers
		
		//2 is the smallest prime number   
		
		
		//to prove Goldbach conjecture with the number inside of 100
		//4~100
		//4=2+2
		//6=3+3
		//8=3+5
		
		//100=3+97
		//100=53+47
		
		//1.find out every even number from 4 to 100
		for(int number=4 ; number<=100 ; number+=2) {
			//2.the number = num1+num2
			//100 = 2 + 98
			//100 = 3 + 97
			//.........
			//100 = 47 + 53
			//100 = 48 + 52
			//100 = 49 + 51
			//100 = 50 + 50

//			num1:2~number/2
//		    num2 = number - num1;
//			12 = 2+10
//			12 = 3+9
//			12 = 4+8
//			12 = 5+7
//			12 = 6+6
			for(int num1=2 ; num1<=number/2 ; num1++) {
				int num2 = number - num1;
				//3.num1 and num2 are both prime -> print the equation
				if(isPrime(num1) && isPrime(num2)) {
					System.out.println(number+"="+num1+"+"+num2);
				}
			}
			System.out.println();
		}	
	}
	
	//prime number:only divisible by 1 and itself
	//121 = 11*11
	// 121 % 2 != 0
	// 121 / 3 x
	// 121 / 4 x
	// .....
	// 121 / 10 x
	// 121 % 11 == 0 -> not prime
	// 121 /12 ?
	//.......
	//121/120 
	
	public static boolean isPrime(int num) {
		for(int i=2 ; i<=Math.sqrt(num) ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}













