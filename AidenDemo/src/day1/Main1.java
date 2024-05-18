package day1;

public class Main1 {

	public static void main(String[] args) {
		//1.data type, define variable
		//primitive type:	short int long    float double    char    boolean   byte
		//type variableName = value;
		//reference type:	String   Scanner   Main1.....
		//Type variableName = new Type();
		
		//2.operators
		//math:				+  -   *   /   %
		//relationship:		>	>=	<	<=	==	!=
		//logical:			!	&&	||
		//assignment:		=	+=	-=	*=	/=	%=
		

		//priority:  unary > binary
		//priority:	math>relationship>logical>assignment
		
		int a = 10;
		a+=2; //a=a+2;//8
		a-=4;	//12
		a*=2;	//16
		a/=5;	//3
		a%=5;	//3
		System.out.println(a);
		
		boolean b = 3+2>4 && 6%5!=1;//b=?
		System.out.println(b);
		int x = a+2;
		
		System.out.println(!false || 1+2<5);
	}

}













