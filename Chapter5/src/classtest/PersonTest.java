package classtest;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 선언
		// 클래스명 변수명 = new 클래스();
		// 자료형 변수명 = new 생성자();

		Person kim = new Person();
		// new 는 새로운 객체를 사용하기 위해 반드시 적어야함 new 다음에 생성자(Person)가 반드시 온다
	
		kim.name = "김유신";
		kim.height = 180;
		kim.weight = 80;
		kim.gender = 'm';
		kim.married = true;
	// 변수명. 메서드명() : 메서드 실행 방법
		
		kim.showPersonInfo();
		// 변수명.멤버변수명 : 멤버 변수 사용방법

		System.out.println(kim.name);
		//System.out.println(kim.add(10, 20));

		// Scanner sc = new Scanner(System.in);
		PersonTest pt = new PersonTest();
		System.out.println(pt.devide(10, 2));
	}
	int devide(int x,int y) {
		return x/y;
	}

}
