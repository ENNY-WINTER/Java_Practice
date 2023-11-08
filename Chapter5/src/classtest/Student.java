package classtest;
//객체 : 사람, 동물, 자동차 , 학생 등이 객체가 되며 추상적인 내용인 생산(생산번호,방법 등), 주문, 관리(식단관리라고 하면 하루 칼로리,식단 등)들도 객체가 될 수 있다.
//class는 객체를 만드는 바탕, 객체가 가지고 있는 변수나 메서드의 집합

public class Student { //클래스의 첫글자는 반드시 대문자, 단어가 이어질 때도 두번째 단어의 첫자는 대문자. 한글로 만들지 말것 
	//멤버 변수: 객체가 가지고 있는 변수
	int studentID; //학번
	String studentName; //이름
	int grade; //학년
	String address; //주소 
	//메서드(Method) : 객체가 할 수 있는 일 :
	
	public static void eat( ) {
		System.out.println("밥을 먹습니다.");
	}
	
	// 학교를 간다.
	// 버스를 탄다.
	// 공부를 한다.
	// 씻는다.

}
