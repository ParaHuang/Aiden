package day3;

public class Main2 {

	public static void main(String[] args) {
		int i=1;
		nk1:while(i<=5) {
			
			int j=1;
			nk2:while(j<=5) {
				System.out.print(j);
				if(j==3) {
//					break;//default situation: break is to stop the loop nearby
//					break nk2;
					break nk1;
				}
				j++;
			}
			System.out.println();
			
			i++;
		}
	}

}

