package day3;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				System.out.print(j);
				if(j==3) {
					continue;	//skip the rest code of the nearby loop for the current round, but there is no code afterwards
//					break;
//					return;
				}
//				System.out.print("helllo");
			}
			System.out.println();
		}
		
		System.out.println("the end of program");
	}

}

