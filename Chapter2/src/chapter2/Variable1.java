package chapter2;

public class Variable1 {
	public static void main(String[] args) {
		// int 는 자료형 변수명; ;는 끝을 나타낸다
		// 자료형 변수명 적는것을 선언한다고 표현한다
		int level = 10;
		// 변수명 = 숫자; 초기화라고 한다. 초기화 : 변수의 값을 넣는 작업
		// '='의 의미는, 대입을 한다는 의미. 같다는 의미가 아님.
		// int는 자료형. int level이라는 공간을 만드는것임. 중복해서 만들게 되면 에러가 난다.
		// level은 변수 level의 값이 계속계속 변한다.
		level = 5;
		System.out.println(level);

		int level2 = 100;
		System.out.println(level2);

		int level3 = 1000;
		System.out.println(level3);

		// 변수명 작성 규칙.
		// 1. 변수 이름은 영문자나 숫자를 사용할 수 있고 특수문자 중에서 $와 _만 사용할 수 있다.
		// 2. 변수 이름은 숫자로 시작할 수 없다. 한글도 사용하지 말 것
		// 3. 자바에서 이미 사용중인 예약어는 사용할 수 없음. 예약어란 자바에서 사용하는 언어
		// 표기법
		// 카멜 표기법(변수명, 메서드) : 첫 단어의 첫글자는 소문자로 나머지 단어의 첫글자는 대문자로 작성 studentNumber
		// 파스칼 표기법(클래스명) : 첫단부터 다른단어의 모든 첫글자는 대문자로 작성 StudentNumber
		// 언더스코어 표기법(상수 , 데이터베이스의 필드명): 단어의 사이에 언더바_를 넣어서 작성 student_number
		

		int level4 = 0;
		level4 = 0;
		System.out.println(level4);

	}

}