package day2;

public class Main1 {

	public static void main(String[] args) {
		//grade:0~100
		//<60, not pass
		//60~69, pass
		//70~79,OK
		//80-89,good
		//>=90,excellent
		
		int grade = 68;
//		System.out.println("ones:"+grade%10);
//		System.out.println("tens:"+grade/10);
		/*
		if(grade>=90) {
			System.out.println("excellent");
		}else if(grade>=80){
			System.out.println("good");
		}else if(grade>=70){
			System.out.println("ok");
		}else if(grade>=60){
			System.out.println("pass");
		}else {
			System.out.println("not pass");
		}
		*/
		switch (grade/10) {
		case 6:
			System.out.println("pass");
			break;
		case 7:
			System.out.println("ok");
			break;
		case 8:
			System.out.println("good");
			break;
		case 9,10:
			System.out.println("excellent");
			break;
		default:
			System.out.println("not pass");
		}
	}

}








