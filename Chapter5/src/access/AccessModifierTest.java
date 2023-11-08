package access;

class Student{
	//접근 제어자의 종류 4종류가 존재함 : public, private , protected, default
	public int studentID; //다른 패키지에서 사용 가능 
	private String studentName; // 선언된 클래스 안에서만 사용가능 
	int score; // default : 같은 패키지 안에서만 사용가능
	protected String majorCode; // 상속을 받거나 같은 패키지에 있을 경우 사용가능
	
	
}
public class AccessModifierTest {
	public static void main(String []args) {
		
	}

}
