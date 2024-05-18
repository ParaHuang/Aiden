package day2;

public class Main3 {

	public static void main(String[] args) {
//		4.print from 1 to 100, but if any number in this range is the multiple of 7 or it has number 7 inside， then print “clap”
//		samples：
//		1 2 3 4 5 6 clap 8 9 10 11 12 13 clap 15 16 clap 18 19 20 clap 22 23 24 25 26 clap clap 29 30 31 32 33 34 clap 36 clap 38.........
		int i=1;
		while(i<=100) {
			if(i/10==7) {//the tens is 7
				System.out.print("clap ");
			}else if(i%10==7 ) {//the ones is 7
				System.out.print("clap ");
			}else if(i%7==0) {//multiple of 7
				System.out.print("clap ");
			}else {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
	
	}

}

