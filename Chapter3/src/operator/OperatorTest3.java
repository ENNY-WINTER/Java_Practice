package operator;

public class OperatorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  >, <, >=, <=, ==, !== :관계연산자, 비교연산자
		
		
		int num1 = 1;
		int num2 = 2;
		System.out.println(num1>num2);//항1이 항2보다 크다 false
		System.out.println(num1<num2);//항1이 항2보다 작다 true
		System.out.println(num1>=num2);//항1이 항2보다 크거나같다 false
		System.out.println(num1<=num2);//항1이 항2보다 작거나같다 true
		System.out.println(num1==num2);//항1과 항2가 같다 false
		System.out.println(num1!=num2);//항1과 항2가 다르다 true
		
		
		int num3 = 4;
		int num4 = 3;
		
		System.out.println(num3>num4);
		System.out.println(num3<num4);
		
		System.out.println("--------------------------");
		
		// &&, ||, !논리 연산자 
		// and 연산자
		System.out.println(true && true);  //두개의 항이 true이면 true 
		System.out.println(true && false); // 두개의 항 중 하나라도 false 이면 false를 출력
		System.out.println(false && true); //
		System.out.println(false && false); //
		// or연산자
		System.out.println(true || true); //둘 다 true 이면 true
		System.out.println(true || false); // 둘 중 하나라도 true 이면 true
		System.out.println(false || true);// 둘 중 하나라도 true 이면 true
		System.out.println(false || false); // false
		System.out.println("--------------------------"); 
		
		// 값앞에 !를 붙이면 반대값이 된다 
		System.out.println(!true); // false가 된다
		System.out.println(true);
		System.out.println(!(10>20)); //원래의 값은 false인데 !를 붙임으로써 반대값인 true가 나왔다.
		
		System.out.println("--------------------------"); 
		System.out.println(1<2 && 1!=5); 
		
		
		
		
	}

}
