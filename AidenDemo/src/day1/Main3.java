package day1;

import java.util.Random;

public class Main3 {

	public static void main(String[] args) {
		//switch...case...
		//when the meaningful values of expression are limit, then we use it
		/*
		 switch(expression){
		 	case value1:
		 		operationA;
		 		break;
		 	case value2:
		 		operationB;
		 		break;
		 	case value3:
		 		operationC;
		 		break;
		 	case value4:
		 		operationD;
		 		break;
		 	default:
		 		operationE;
		 }
		 */
		Random random = new Random();
		int poker = random.nextInt(1, 16);
		System.out.println(poker);
		switch(poker) {
			case 1:
				System.out.println("you have the ace of diamonds");
				break;
			case 11:
				System.out.println("you have the jack of diamonds");
				break;
			case 12:
				System.out.println("you have the queen of diamonds");
				break;
			case 13:
				System.out.println("you have the king of diamonds");
				break;
			case 14,15:
				System.out.println("you have joker");
				break;
			default:
				System.out.println("you have the "+poker+" of diamonds");
		}
		
		if(poker==1) {
			//xxxxxx
		}else if(poker==11) {
			//xxxxx
		}else if(poker==12) {
			//xxxxx
		}else if(poker==13) {
			//xxxxx
		}else if(poker==14 || poker==15) {
			//xxxxx
		}else {
			
		}
		
	}

}












