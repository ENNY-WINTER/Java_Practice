package operator;

public class OperatorTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건 연산자, 삼항 연산자(항을 3개 쓰기 때문)
		//      조건식 ? true : false
		
		int i = 10<20 ? 10 : 20; //조건식이 true이면 10이 출력, false이면 20이 출력
		System.out.println(i);
		
		String str = 10<20 ? "참" : "거짓"; //조건식이 true이면 '참'이 출력, false이면 '거짓'이 출력
		System.out.println(str);
				
		
		//연산자의 우선순위 
		//1순위 : (), [], .
		//2순위 : ! , ++2(변수 앞에 붙었을 때), --2 , -2, +2
		//3순위 : % , /, *
		//4순위 : +, - 
		//5순위 : <, > , >=, <=
		//6순위 : &&
		//7순위 : ||
		//8순위 : ?: (조건 연산자)
		//9순위 : =, +=, -=, *=, /= (대입 연산자) 
		//10순위 : 2++, 2--
		
		int result = 10+1+10*2-10/2+10;
		System.out.println(result);
		
		int result2= 10+1+10*2-10/2+10 > 10 ? 0 : 1 ;
		System.out.println(result2);
		
		int result3= (-10)+(-1)+(10*2)-(10/2)+10 > 10 ? 0 : 1 ;
		System.out.println(result3);
		
	}

}
